package com.lojaonline.cart.infrastructure.repository;

import com.lojaonline.item.infrastructure.entity.Carrinho;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CarrinhoRepository extends JpaRepository<Carrinho, Long> {

}