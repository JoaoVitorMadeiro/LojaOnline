package com.lojaonline.usecaseitem.usercases;

import com.lojaonline.core.domain.Item;

public interface SearchItemUseCase {
    void searchItem(Item nameitem);
    void searchItemId(Item idItem);
}
