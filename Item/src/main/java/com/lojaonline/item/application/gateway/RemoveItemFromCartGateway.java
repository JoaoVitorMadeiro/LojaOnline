package com.lojaonline.item.application.gateway;

public interface RemoveItemFromCartGateway {
    void execute(Long idUser, Long idItem);
}
