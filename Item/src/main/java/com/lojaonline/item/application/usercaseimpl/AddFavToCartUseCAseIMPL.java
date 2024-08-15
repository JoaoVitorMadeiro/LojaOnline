package com.lojaonline.item.application.usercaseimpl;

import com.lojaonline.item.usecase.usercases.AddFavToCartUsecase;

public class AddFavToCartUseCAseIMPL implements AddFavToCartUsecase {
    @Override
    public void execute(Long idUser, Long idItem) {
      if (idUser == null || idItem == null) {
        throw new IllegalArgumentException("idUser and idItem must not be null");
      }
      else {
        // Add item to user's cart
      }
    }
}
