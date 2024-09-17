package com.lojaonline.item.infrastructure.service;

import com.lojaonline.item.infrastructure.entity.CartEntity;
import com.lojaonline.item.infrastructure.entity.FavEntity;
import com.lojaonline.item.infrastructure.entity.ItemEntity;
import com.lojaonline.item.infrastructure.repository.FavRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FavService {
    private FavRepository favRepository;
    private RestTemplate restTemplate;

    public FavService(FavRepository favRepository) {
        this.favRepository = favRepository;
    }

    public ItemEntity getItemById(Long id) {
        return restTemplate.getForObject("http://localhost:8081/item/" + id, ItemEntity.class);
    }

    public FavEntity AdditemToFav(Long idUser, Long idItem) {
       ItemEntity itemEntity = getItemById(idItem);
       if(itemEntity != null){
           FavEntity favEntity = new FavEntity();
           favEntity.setIdUser(idUser);
           favEntity.setIdItem(idItem);
           return favRepository.save(favEntity);
       }
       return null;
    }
    public FavEntity AddFavToCart(Long idUser, Long idItem) {
        ItemEntity itemEntity = getItemById(idItem);
        if(itemEntity != null){
            CartEntity cartEntity = new CartEntity();
            cartEntity.setIdUser(idUser);
            cartEntity.setItemEntity(String.valueOf(itemEntity));
            cartEntity.setPreco(itemEntity.getPreco());
        }
        return null;
    }

}
