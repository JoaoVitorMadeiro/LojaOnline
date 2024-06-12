package com.lojaonline.core.domain;

public class Favorito {
    private Long id;
    private Item item;


    public Favorito(Long id, Item item) {
        this.id = id;
        this.item = item;
    }

    public Favorito() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }


}