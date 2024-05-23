package com.lojaonline.infrastructure.repository;

import com.lojaonline.infrastructure.entity.Carrinho;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CarrinhoRepository extends JpaRepository<Carrinho, Long>{

}