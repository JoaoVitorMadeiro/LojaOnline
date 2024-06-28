package com.lojaonline.item.application.gateway;

import com.lojaonline.item.core.domain.Item;

public interface SearchItemGateway {
    Item searchItem(Long id);
}
