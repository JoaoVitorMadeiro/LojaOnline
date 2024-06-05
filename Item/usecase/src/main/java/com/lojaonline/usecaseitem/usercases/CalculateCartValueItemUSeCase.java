package com.lojaonline.usecaseitem.usercases;

import com.lojaonline.core.domain.Item;

public interface CalculateCartValueItemUSeCase {
    Integer calculateValueItem(Item item, Integer quantity);
}
