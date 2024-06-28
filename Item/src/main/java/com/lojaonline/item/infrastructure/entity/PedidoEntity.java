package com.lojaonline.item.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Builder
@Table(name = "pedido")
public class PedidoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private UUID idUser;
    private UUID idItem;
    private Integer quantity;
    private Integer price;
    private Integer total;
}
