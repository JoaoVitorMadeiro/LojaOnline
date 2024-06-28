package com.lojaonline.cart.application.usecaseimpl;

import com.lojaonline.cart.application.gateway.AddCartGateWay;
import com.lojaonline.item.core.domain.Carrinho;
import com.lojaonline.item.core.domain.Item;
import com.lojaonline.item.usecase.usercases.AddCartUseCase;


public class AddCArtUseCaseImpl implements AddCartUseCase {
    private AddCartGateWay addCartGateWay;

    public AddCArtUseCaseImpl( AddCartGateWay addCartGateWay) {
        this.addCartGateWay = addCartGateWay;
    }

    @Override
    public void addCart(Carrinho carrinho, Item item) {
        if (carrinho == null) {
            throw new IllegalArgumentException("Cart is required");
        }
        if (item == null) {
            throw new IllegalArgumentException("Item is required");
        }
        addCartGateWay.addCart(carrinho, item);
    }
}