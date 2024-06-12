package com.lojaonline.application.usercaseimpl;

import com.lojaonline.application.gateway.AddFavoritoGateWay;
import com.lojaonline.core.domain.Item;
import com.lojaonline.usecase.usercases.AddFavoritoUseCase;


public class AddFavoritoUseCaseIMPL implements AddFavoritoUseCase {
    private Item item;
    private AddFavoritoGateWay addFavoritoGateWay;

    public AddFavoritoUseCaseIMPL(AddFavoritoGateWay addFavoritoGateWay, Item item) {
        this.addFavoritoGateWay = addFavoritoGateWay;
        this.item = item;
    }

    @Override
    public void addFavorito(Item item) {
        addFavoritoGateWay.addFavorito(item);
    }
}