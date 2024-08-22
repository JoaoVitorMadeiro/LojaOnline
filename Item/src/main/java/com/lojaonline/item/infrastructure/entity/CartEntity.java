package com.lojaonline.item.infrastructure.entity;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Calendar;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@ToString
@Table(name = "carrrinho")
public class CartEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idUser;
    private Long idItem;
    private String itemEntity;
    private Integer quantidade;
    private Integer preco;
    private Integer total;
    private String status;
    private LocalDateTime dataCadastro = LocalDateTime.now();
    private LocalDateTime dataAtualizacao = LocalDateTime.now();
}
