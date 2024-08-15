package com.lojaonline.item.usecase.usercases;

public interface AddItemToFavUseCase {
    void execute(Long idUser, Long idItem);
}
