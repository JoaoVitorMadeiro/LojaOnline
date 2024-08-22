package com.lojaonline.item.infrastructure.dto;


import com.lojaonline.item.core.domain.enums.CategoryEnum;
import com.lojaonline.item.infrastructure.entity.ItemEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class ItemRespostaDto {

    private long id;
    private String nome;
    private String descricao;
    private Integer preco;
    private Integer quantidade;
    private CategoryEnum categoria;


    public static ItemRespostaDto transformaEmDTO(ItemEntity itemEntity) {
        return new ItemRespostaDto();
    }


}
