package com.prasanth.cartflow.controller;
import com.prasanth.cartflow.model.CartItem; import com.prasanth.cartflow.service.CartService; import org.springframework.web.bind.annotation.*; import java.util.List;
@RestController @RequestMapping("/api/cart") @CrossOrigin("*")
public class CartController { private final CartService service; public CartController(CartService service){this.service=service;}
 @GetMapping("/{cartId}") public List<CartItem> get(@PathVariable String cartId){return service.getCart(cartId);}
 @PostMapping("/{cartId}/items") public CartItem add(@PathVariable String cartId,@RequestBody CartItem item){return service.add(cartId,item);}
 @PutMapping("/{cartId}/items/{itemId}") public CartItem update(@PathVariable String cartId,@PathVariable Long itemId,@RequestParam int quantity){return service.update(cartId,itemId,quantity);}
 @DeleteMapping("/{cartId}/items/{itemId}") public void delete(@PathVariable String cartId,@PathVariable Long itemId){service.delete(cartId,itemId);}
 @DeleteMapping("/{cartId}/clear") public void clear(@PathVariable String cartId){service.clear(cartId);}}
