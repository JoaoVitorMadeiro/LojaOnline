package com.lojaonline.cart.core.domain;

public class Carrinho {
    private long id;
    private enum items
    private Enum favorito;

    public Carrinho(long id, Item items, Favorito favorito) {
        this.id = id;
        this.items = items;
        this.favorito = favorito;
    }

    public Carrinho() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Item getItems() {
        return items;
    }

    public void setItems(Item items) {
        this.items = items;
    }

    public Favorito getFavorito() {
        return favorito;
    }

    public void setFavorito(Favorito favorito) {
        this.favorito = favorito;
    }
}