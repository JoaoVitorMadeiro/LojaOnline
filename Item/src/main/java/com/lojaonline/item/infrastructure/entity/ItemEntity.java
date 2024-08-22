package com.lojaonline.item.infrastructure.entity;



import java.time.LocalDate;

import com.lojaonline.item.core.domain.enums.CategoryEnum;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "item")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "id")
public class ItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private Integer preco;
    private Integer quantidade;
    private LocalDate dataCadastro = LocalDate.now();
    @Enumerated(EnumType.STRING)
    private CategoryEnum categoria;

    public ItemEntity(String nome, String descricao, Integer preco, Integer quantidade, CategoryEnum categoria) {
    }
}