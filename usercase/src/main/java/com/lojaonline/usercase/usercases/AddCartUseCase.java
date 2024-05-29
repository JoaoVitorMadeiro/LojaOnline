package com.lojaonline.usercase.usercases;

import com.lojaonline.core.domain.Carrinho;
import com.lojaonline.core.domain.Item;

public interface AddCartUseCase {
    void addCart(Carrinho carrinho, Item item);
}
