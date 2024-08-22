// CartController.java
package com.lojaonline.item.infrastructure.controller;

import com.lojaonline.item.infrastructure.entity.CartEntity;
import com.lojaonline.item.infrastructure.entity.ItemEntity;
import com.lojaonline.item.infrastructure.service.CartService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartController {

    private CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @Operation(summary = "Add item to cart", description = "Add an item to the cart", responses = {
            @ApiResponse(responseCode = "200", ref = "ok"),
            @ApiResponse(responseCode = "400", ref = "badRequest"),
            @ApiResponse(responseCode = "403", ref = "permissionDenied"),
            @ApiResponse(responseCode = "404", ref = "ResourceNotFound"),
            @ApiResponse(responseCode = "409", ref = "conflict")
    })
    @PostMapping
    public ResponseEntity<CartEntity> addToCart(@RequestBody ItemEntity itemEntity) {
        CartEntity cartEntity = cartService.addToCart(itemEntity);
        return ResponseEntity.ok(cartEntity);
    }
}