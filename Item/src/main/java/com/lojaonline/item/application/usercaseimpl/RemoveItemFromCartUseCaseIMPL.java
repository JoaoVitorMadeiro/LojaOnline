package com.lojaonline.item.application.usercaseimpl;

import com.lojaonline.item.usecase.usercases.RemoveItemFromCartUseCase;

public class RemoveItemFromCartUseCaseIMPL implements RemoveItemFromCartUseCase {
    @Override
    public void execute(Long idUser, Long idItem) {
        if (idUser == null || idItem == null) {
            throw new IllegalArgumentException("idUser and idItem must not be null");
        }
        else {
            // Remove item from user's cart
        }
    }
}
