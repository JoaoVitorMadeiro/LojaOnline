package com.lojaonline.cart.usecase.usecase;


import com.lojaonline.item.core.domain.Item;

public interface CalculateCartValueItemUSeCase {
    Integer calculateValueItem(Item item, Integer quantity);
}
