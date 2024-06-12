package com.lojaonline.usecase.usercases;

import com.lojaonline.core.domain.Item;

public interface SearchItemUseCase {
    void searchItem(Item nameitem);

    void searchItemId(Item idItem);
}
