package com.lojaonline.item.core.domain;

import com.lojaonline.item.core.domain.enums.CategoryEnum;

import java.time.LocalDateTime;


public class Item {
    private Long id;
    private String name;
    private String description;
    public Integer price;
    public Integer quantity;
    private CategoryEnum Category;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


    public Item(Long id, String name, String description, Integer price, Integer quantity, CategoryEnum category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.Category = category;
        this.createdAt = LocalDateTime.now();
    }

    public Item() {
    }

    public CategoryEnum getCategory() {
        return Category;
    }

    public void setCategory(CategoryEnum category) {
        Category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
    public boolean NameLimit(String name){
        if(name.length() > 150){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean QuantityLimit(Integer quantity){
        if (quantity >= 0){
            return true;
        }
        else{
            return false;
        }
    }

}