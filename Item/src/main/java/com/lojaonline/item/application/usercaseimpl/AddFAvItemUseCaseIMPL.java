package com.lojaonline.item.application.usercaseimpl;

import com.lojaonline.item.usecase.usercases.AddFavItemUsecase;

public class AddFAvItemUseCaseIMPL implements AddFavItemUsecase {
    @Override
    public void execute(Long idUser, Long idItem) {
      if (idUser == null || idItem == null) {
        throw new IllegalArgumentException("idUser and idItem must not be null");
      }
      else {
        // Add item to user's favorites
      }
    }
}
