package com.lojaonline.core.domain;

import com.lojaonline.core.exception.Pedido;

import java.util.UUID;

public class Carrinho {
    private UUID id;
    private Item items;
    private Pedido pedido;
    private Favorito favorito;

    public Carrinho(UUID id, Item items, Pedido pedido, Favorito favorito) {
        this.id = id;
        this.items = items;
        this.pedido = pedido;
        this.favorito = favorito;
    }
    public Carrinho () {
    }
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public Item getItems() {
        return items;
    }
    public void setItems(Item items) {
        this.items = items;
    }
    public Pedido getPedido() {
        return pedido;
    }
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    public Favorito getFavorito() {
        return favorito;
    }
    public void setFavorito(Favorito favorito) {
        this.favorito = favorito;
    }
}