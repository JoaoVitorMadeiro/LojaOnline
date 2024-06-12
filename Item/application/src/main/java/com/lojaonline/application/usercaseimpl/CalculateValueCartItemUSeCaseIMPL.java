package com.lojaonline.application.usercaseimpl;

import com.lojaonline.core.domain.Item;
import com.lojaonline.usecase.usercases.CalculateCartValueItemUSeCase;

public class CalculateValueCartItemUSeCaseIMPL implements CalculateCartValueItemUSeCase{

    @Override
    public Integer calculateValueItem(Item item, Integer quantity) {
        return 0;
    }
}
