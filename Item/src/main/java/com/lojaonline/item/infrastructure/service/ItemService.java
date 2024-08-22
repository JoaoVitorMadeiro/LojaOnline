package com.lojaonline.item.infrastructure.service;


import java.util.Optional;

import com.lojaonline.item.infrastructure.dto.itemDtoRecord;
import com.lojaonline.item.infrastructure.entity.ItemEntity;
import com.lojaonline.item.infrastructure.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class ItemService {
    
    private ItemRepository itemRepositopy;
    private final RestTemplate restTemplate;

    public ItemEntity addItem(itemDtoRecord dto, boolean isAdmin) {
        if (isAdmin) {
            ItemEntity itemEntity = new ItemEntity();
            itemEntity.setNome(dto.nome());
            itemEntity.setPreco(dto.preco());
            itemEntity.setDescricao(dto.descricao());
            itemEntity.setCategoria(dto.categoria());
            itemEntity.setQuantidade(dto.quantidade());
            System.out.println(itemEntity.getCategoria());
            return itemRepositopy.save(itemEntity);
        } else {
            throw new RuntimeException("Você não tem permissão para adicionar um item");
        }
    }

    public ItemEntity buscarPorNome(String nome) {
        Optional<ItemEntity> item = itemRepositopy.findByNome(nome);

        if (item.isPresent()) {
            return item.get();
        }
        return null;
    }

    public ItemEntity buscarPorId(Long id) {
        Optional<ItemEntity> item = itemRepositopy.findById(id);
        return item.orElse(null);
    }
    public void deleteItem(ItemEntity idItemEntity, boolean isAdmin) {
        if (isAdmin) {
            itemRepositopy.delete(idItemEntity);
        } else {
            throw new RuntimeException("Você não tem permissão para deletar um item");
        }
    }
    public ItemService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ItemEntity getItemById(Long id) {
        return restTemplate.getForObject("http://localhost:8080/item/" + id, ItemEntity.class);
    }

}
