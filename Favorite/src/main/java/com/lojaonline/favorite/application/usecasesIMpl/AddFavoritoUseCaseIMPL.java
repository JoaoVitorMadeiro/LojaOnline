package com.lojaonline.favorite.application.usecasesIMpl;

import com.lojaonline.item.application.gateway.AddFavoritoGateWay;
import com.lojaonline.item.core.domain.Item;
import com.lojaonline.item.usecase.usercases.AddFavoritoUseCase;


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
