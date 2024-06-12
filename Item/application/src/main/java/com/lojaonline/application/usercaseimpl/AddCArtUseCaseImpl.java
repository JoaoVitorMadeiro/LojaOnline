package com.lojaonline.application.usercaseimpl;

import com.lojaonline.application.gateway.AddCartGateWay;

import com.lojaonline.core.domain.Carrinho;
import com.lojaonline.core.domain.Item;
import com.lojaonline.usecase.usercases.AddCartUseCase;


public class AddCArtUseCaseImpl implements AddCartUseCase {
    private Carrinho carrinho;
    private Item item;
    private AddCartGateWay addCartGateWay;

    public AddCArtUseCaseImpl(Carrinho carrinho, Item item, AddCartGateWay addCartGateWay) {
        this.carrinho = carrinho;
        this.item = item;
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