package com.lojaonline.application.usercaseimpl;

import com.lojaonline.core.domain.Item;
import com.lojaonline.core.domain.enums.CategoryEnum;
import com.lojaonline.application.gateway.CreateItemGateWay;
import com.lojaonline.core.exception.InventoryException;
import com.lojaonline.usecase.usercases.CreateItemUseCase;


public class CreateItemUseCaseImpl implements CreateItemUseCase {
    private CreateItemGateWay createItemGateWay;
    private CategoryEnum.Category Category;
    private InventoryException inventory;

    public CreateItemUseCaseImpl(CreateItemGateWay createItemGateWay, CategoryEnum.Category Category, InventoryException inventory) {
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
