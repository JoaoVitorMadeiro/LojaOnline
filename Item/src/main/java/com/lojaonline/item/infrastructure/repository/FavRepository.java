package com.lojaonline.item.infrastructure.repository;

import com.lojaonline.item.infrastructure.entity.FavEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavRepository extends JpaRepository<FavEntity, Long> {
}
