package com.lojaonline.application.gateway;

import com.lojaonline.core.domain.Carrinho;
import com.lojaonline.core.domain.Item;

public interface AddCartGateWay {
    void addCart(Carrinho carrinho, Item item);
}
