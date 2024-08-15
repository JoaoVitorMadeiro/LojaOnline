package com.lojaonline.item.infrastructure.service;


import java.util.Optional;

import com.lojaonline.item.infrastructure.dto.itemDtoRecord;
import com.lojaonline.item.infrastructure.entity.Item;
import com.lojaonline.item.infrastructure.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepositopy;
    private final RestTemplate restTemplate;

    public Item addItem(itemDtoRecord dto, boolean isAdmin) {
        if (isAdmin) {
            Item item = new Item();
            item.setNome(dto.nome());
            item.setPreco(dto.preco());
            item.setDescricao(dto.descricao());
            item.setCategoria(dto.categoria());
            item.setQuantidade(dto.quantidade());
            System.out.println(item.getCategoria());
            return itemRepositopy.save(item);
        } else {
            throw new RuntimeException("Você não tem permissão para adicionar um item");
        }
    }

    public Item buscarPorNome(String nome) {
        Optional<Item> item = itemRepositopy.findByNome(nome);

        if (item.isPresent()) {
            return item.get();
        }
        return null;
    }

    public Item buscarPorId(Long id) {
        Optional<Item> item = itemRepositopy.findById(id);
        return item.orElse(null);
    }
    // public Item fitrarPorPreco(int preco) {
    //     for (Item item : itemRepositopy) {
    //         if (item.getPreco() == preco) {
    //             return item;
    //         }
    //     }
    //     return null;
    // }

    public void deleteItem(Item idItem, boolean isAdmin) {
        if (isAdmin) {
            itemRepositopy.delete(idItem);
        } else {
            throw new RuntimeException("Você não tem permissão para deletar um item");
        }
    }

    public ItemService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Item getItemById(Long id) {
        return restTemplate.getForObject("http://localhost:8080/item/" + id, Item.class);
    }

}
