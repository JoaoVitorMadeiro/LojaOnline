package com.lojaonline.item.core.domain;

import java.time.LocalDateTime;
import java.util.Objects;

public class Cart {
    private Long id;
    private Long idUser;
    private Item item;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private boolean isPaid;

    public Cart(Long id, Long idUser, Item item, boolean isPaid) {
        this.id = id;
        this.idUser = idUser;
        this.item = item;
        this.createdAt = LocalDateTime.now();
        this.isPaid = isPaid;
    }

    public Cart() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return Objects.equals(id, cart.id) && Objects.equals(idUser, cart.idUser) && Objects.equals(item, cart.item) && Objects.equals(createdAt, cart.createdAt) && Objects.equals(updatedAt, cart.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idUser, item, createdAt, updatedAt);
    }
}
