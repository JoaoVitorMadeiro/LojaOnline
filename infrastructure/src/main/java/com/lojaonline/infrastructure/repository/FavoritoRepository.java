package com.lojaonline.infrastructure.repository;

import com.lojaonline.infrastructure.entity.Favorito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoritoRepository extends JpaRepository<Favorito, Long>{

}
