package com.lojaonline.item.usecase.usercases;

public interface AddItemToCartUseCase {
    void execute(Long idUser, Long idItem);
}
