package com.lojaonline.infrastructureitem.dto;

public record itemDtoRecord(String nome, Integer preco, String descricao, CategoryEnum categoria, Integer quantidade) {
    
}
