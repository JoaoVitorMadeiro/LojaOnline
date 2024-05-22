package com.lojaonline.core.domain;

import com.lojaonline.core.domain.enums.CategoryEnum;

import java.util.UUID;

public class Item {
    private UUID id;
    private String name;
    private String description;
    public Integer price;
    public Integer quantity;
    private CategoryEnum Category;
}