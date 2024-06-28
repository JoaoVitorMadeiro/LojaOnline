package com.lojaonline.item.application.usercaseimpl;

import com.lojaonline.item.application.gateway.CreateItemGateWay;
import com.lojaonline.item.core.domain.Item;
import com.lojaonline.item.usecase.usercases.CreateItemUseCase;

public class CreateItemUseCaseImpl implements CreateItemUseCase {
    private CreateItemGateWay createItemGateWay;

    public CreateItemUseCaseImpl(CreateItemGateWay createItemGateWay) {
        this.createItemGateWay = createItemGateWay;
    }

    @Override
    public void createItem(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Item is required");
        }
        createItemGateWay.create(item);
    }
}
