// CartController.java
package com.lojaonline.item.infrastructure.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.lojaonline.item.infrastructure.service.CartService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class CartController {


   private CartService cartService;

    @Operation(summary = "Add item to cart", description = "Add an item to the cart", responses = {
            @ApiResponse(responseCode = "200", ref = "ok"),
            @ApiResponse(responseCode = "400", ref = "badRequest"),
            @ApiResponse(responseCode = "403", ref = "permissionDenied"),
            @ApiResponse(responseCode = "404", ref = "ResourceNotFound"),
            @ApiResponse(responseCode = "409", ref = "conflict")
    })
    @PostMapping
    public ResponseEntity<?> addItemToCart() throws JsonProcessingException {
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<?> getCart() {
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<?> updateCart() {
        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    public ResponseEntity<?> deleteCart() {
        return ResponseEntity.ok().build();
    }

}