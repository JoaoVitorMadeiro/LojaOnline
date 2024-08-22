package com.lojaonline.item.infrastructure.repository;

import java.util.Optional;

import com.lojaonline.item.infrastructure.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ItemRepository extends JpaRepository<ItemEntity, Long> {
    Optional<ItemEntity> findByNome(String nome);
}