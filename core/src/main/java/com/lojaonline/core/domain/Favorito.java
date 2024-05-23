package com.lojaonline.core.domain;

import java.util.UUID;

public class Favorito {
    private UUID id;
    private Item item;
    private User user;

    public Favorito(UUID id, Item item, User user) {
        this.id = id;
        this.item = item;
        this.user = user;
    }
    public Favorito () {
    }
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public Item getItem() {
        return item;
    }
    public void setItem(Item item) {
        this.item = item;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

}