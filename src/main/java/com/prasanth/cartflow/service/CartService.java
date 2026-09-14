package com.prasanth.cartflow.service;
import com.prasanth.cartflow.model.CartItem; import com.prasanth.cartflow.repository.CartItemRepository; import org.springframework.stereotype.Service; import java.util.List;
@Service public class CartService { private final CartItemRepository repo; public CartService(CartItemRepository repo){this.repo=repo;}
 public List<CartItem> getCart(String cartId){return repo.findByCartId(cartId);} public CartItem add(String cartId,CartItem item){item.setCartId(cartId); if(item.getQuantity()<1)item.setQuantity(1); return repo.save(item);}
 public CartItem update(String cartId,Long id,int qty){CartItem x=repo.findById(id).orElseThrow(); if(!x.getCartId().equals(cartId))throw new IllegalArgumentException("Item does not belong to cart"); x.setQuantity(Math.max(1,qty)); return repo.save(x);}
 public void delete(String cartId,Long id){CartItem x=repo.findById(id).orElseThrow(); if(!x.getCartId().equals(cartId))throw new IllegalArgumentException("Item does not belong to cart"); repo.delete(x);} public void clear(String cartId){repo.deleteAll(repo.findByCartId(cartId));}}
