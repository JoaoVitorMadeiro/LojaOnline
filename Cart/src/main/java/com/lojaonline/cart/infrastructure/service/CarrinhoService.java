package com.lojaonline.cart.infrastructure.service;

import com.lojaonline.item.infrastructure.entity.Carrinho;
import com.lojaonline.item.infrastructure.repository.CarrinhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class CarrinhoService {
    @Autowired
    private CarrinhoRepository carrinhoRepo;

    public void addItem(long Id, Carrinho carrinho, Integer quantidade) {
        carrinho.addItemAoCarrinho(Id, quantidade);
        carrinhoRepo.save(carrinho);
    }

    public void clearCarrinho(Long id, Carrinho carrinho) {
        carrinho.preRemove(id);
        carrinhoRepo.save(carrinho);
    }


}