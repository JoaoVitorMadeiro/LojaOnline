// CartRepository.java
package com.lojaonline.item.infrastructure.repository;

import com.lojaonline.item.infrastructure.entity.CartEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<CartEntity, Long> {
}