package com.lojaonline.usercase.usercases;

import com.lojaonline.core.domain.Item;

public interface CalculateCartValueItemUSeCase {
    Integer calculateValueItem(Item item, Integer quantity);
}
