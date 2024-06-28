package com.lojaonline.item.application.usercaseimpl;

import com.lojaonline.item.application.gateway.DeleteItemGateway;
import com.lojaonline.item.core.domain.Item;
import com.lojaonline.item.usecase.usercases.DeleteItemUsecase;

public class DeleteItemUsecaseImpl implements DeleteItemUsecase {
    private final DeleteItemGateway deleteItemGateway;

    public DeleteItemUsecaseImpl(DeleteItemGateway deleteItemGateway) {
        this.deleteItemGateway = deleteItemGateway;
    }


    @Override
    public void deleteItem(Long id) {
        // TODO Auto-generated method stub

    }
}
