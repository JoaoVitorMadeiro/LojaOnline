package com.lojaonline.item.infrastructure.service;

import com.lojaonline.item.infrastructure.entity.CartEntity;
import com.lojaonline.item.infrastructure.entity.ItemEntity;
import com.lojaonline.item.infrastructure.repository.CartRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class CartService {
    private CartRepository cartRepository;

    public ItemEntity addItemToCart(Long idUser, Long idItem) {
        Optional<CartEntity> cartEntity = cartRepository.findById(idUser);
        if(cartEntity.isPresent()){
            ItemEntity itemEntity = new ItemEntity();
            itemEntity.setId(idItem);
            return itemEntity;
        }
        return null;
    }

    public  CartEntity getCart(Long idUser) {
        return cartRepository.findById(idUser).orElse(null);
    }

    public CartEntity updateCart(Long idUser, Long idItem, Integer quantidade) {
        Optional<CartEntity> cartEntity = cartRepository.findById(idUser);
        if(cartEntity.isPresent()){
            CartEntity cart = cartEntity.get();
            cart.setQuantidade(quantidade);
            return cartRepository.save(cart);
        }
        return null;
    }

    public void deleteCart(Long idUser) {
        cartRepository.deleteById(idUser);
    }

    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }
}
