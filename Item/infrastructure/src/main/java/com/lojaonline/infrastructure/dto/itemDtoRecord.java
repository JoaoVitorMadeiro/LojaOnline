package com.lojaonline.infrastructure.dto;

public record itemDtoRecord(String nome, Integer preco, String descricao, CategoryEnum categoria, Integer quantidade) {

}
