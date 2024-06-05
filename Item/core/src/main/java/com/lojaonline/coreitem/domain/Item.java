package com.lojaonline.coreitem.domain;

import com.lojaonline.coreitem.domain.enums.CategoryEnum;

import java.util.UUID;

public class Item {
    private UUID id;
    private String name;
    private String description;
    public Integer price;
    public Integer quantity;
    private CategoryEnum Category;




    public Item(UUID id, String name, String description, Integer price, Integer quantity, CategoryEnum category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        Category = category;
    }

    public Item() {
    }

    public CategoryEnum getCategory() {
        return Category;
    }

    public void setCategory(CategoryEnum category) {
        Category = category;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public boolean isEmpty() {
        return (this.name == null || this.name.isEmpty()) ||
                (this.description == null || this.description.isEmpty()) ||
                (this.price == null) ||
                (this.quantity == null) ||
                (this.Category == null);
    }
}