package com.lojaonline.cart.usecase.usecase;


import com.lojaonline.item.core.domain.Carrinho;
import com.lojaonline.item.core.domain.Item;

public interface AddCartUseCase {
    void addCart(Carrinho carrinho, Item item);
}
