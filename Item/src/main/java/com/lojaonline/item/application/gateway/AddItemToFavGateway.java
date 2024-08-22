package com.lojaonline.item.application.gateway;

public interface AddItemToFavGateway {
    void execute(Long idUser, Long idItem);
    
}
