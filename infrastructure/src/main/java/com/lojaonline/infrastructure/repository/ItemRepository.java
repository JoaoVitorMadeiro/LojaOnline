package com.lojaonline.infrastructure.repository;

import java.util.Optional;

import com.lojaonline.infrastructure.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ItemRepository extends JpaRepository<Item, Long>{

    Optional<Item> findByNome(String nome);

    
}