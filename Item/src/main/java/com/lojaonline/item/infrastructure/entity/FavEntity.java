package com.lojaonline.item.infrastructure.entity;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@ToString
@Table(name = "favorito")
public class FavEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idUser;
    private Long idItem;
    private LocalDateTime dataCadastro = LocalDateTime.now();
    private LocalDateTime dataAtualizacao = LocalDateTime.now();

    public FavEntity(Long idUser, Long idItem) {
        this.idUser = idUser;
        this.idItem = idItem;
    }
}
