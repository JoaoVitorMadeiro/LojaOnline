package com.lojaonline.aplicationitem.usercaseimpl;

import com.lojaonline.core.domain.Item;
import com.lojaonline.core.domain.enums.CategoryEnum;
import com.lojaonline.core.exception.Inventory;
import com.lojaonline.application.gateway.CreateItemGateWay;
import com.lojaonline.usercase.usercases.CreateItemUseCase;

public class CreateItemUseCaseImpl implements CreateItemUseCase {
    private CreateItemGateWay createItemGateWay;
    private CategoryEnum.Category Category;
    private Inventory inventory;

    public CreateItemUseCaseImpl(CreateItemGateWay createItemGateWay, CategoryEnum.Category Category, Inventory inventory) {
        this.createItemGateWay = createItemGateWay;
        this.Category = Category;
        this.inventory = inventory;
    }
    @Override
    public void createItem(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Item is required");
        }
        createItemGateWay.create(item);
    }
}
