package com.lojaonline.cart.application.gateway;


import com.lojaonline.cart.core.domain.Carrinho;

public interface AddCartGateWay {
    void addCart(Carrinho carrinho, Item item);
}
