package com.lojaonline.infrastructure.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class ItemRespostaDto {

    private long id;
    private String nome;
    private String descricao;
    private Integer preco;
    private Integer quantidade;
    private CategoryEnum categoria;


    public static ItemRespostaDto transformaEmDTO(Item item) {
        return new ItemRespostaDto();
    }


}
