package com.prasanth.cartflow.model;
import jakarta.persistence.*;
@Entity @Table(name="cart_items")
public class CartItem {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @Column(nullable=false) private String cartId;
 @Column(nullable=false) private String productName;
 private double price; private int quantity; private String imageUrl;
 public Long getId(){return id;} public String getCartId(){return cartId;} public void setCartId(String v){cartId=v;}
 public String getProductName(){return productName;} public void setProductName(String v){productName=v;} public double getPrice(){return price;} public void setPrice(double v){price=v;}
 public int getQuantity(){return quantity;} public void setQuantity(int v){quantity=v;} public String getImageUrl(){return imageUrl;} public void setImageUrl(String v){imageUrl=v;}
}
