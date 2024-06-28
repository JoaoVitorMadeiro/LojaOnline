package com.lojaonline.item.application.usercaseimpl;

import com.lojaonline.item.application.gateway.UpdateItemGateWay;
import com.lojaonline.item.core.domain.Item;
import com.lojaonline.item.usecase.usercases.UpdateItemUseCase;
public class UpdateItemUseCaseIMpl implements UpdateItemUseCase {
    private UpdateItemGateWay updateItemGateWay;

    public UpdateItemUseCaseIMpl(UpdateItemGateWay updateItemGateWay) {
        this.updateItemGateWay = updateItemGateWay;
    }


    @Override
    public void updateItem() {

    }
}
