package com.lojaonline.item.usecase.usercases;

import com.lojaonline.item.core.domain.Item;

public interface SearchItemUseCase {
    void searchItem(String nameitem);

    void searchItemId(Long idItem);
}
