package com.lojaonline.item.usecase.usercases;

import com.lojaonline.item.core.domain.Item;

public interface SearchItemUseCase {
    void searchItem(Item nameitem);

    void searchItemId(Item idItem);
}
