package com.lojaonline.item.infrastructure.dto;

import com.lojaonline.item.core.domain.enums.CategoryEnum;

public record itemDtoRecord(String nome, Integer preco, String descricao, CategoryEnum categoria, Integer quantidade) {

}
