package com.lojaonline.favorite.infrastructure.repository;

import com.lojaonline.item.infrastructure.entity.Favorito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoritoRepository extends JpaRepository<Favorito, Long> {

}
