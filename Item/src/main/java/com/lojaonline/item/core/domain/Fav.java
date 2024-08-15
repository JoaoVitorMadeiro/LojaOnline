package com.lojaonline.item.core.domain;

import java.time.LocalDateTime;
import java.util.Objects;

public class Fav {
    private Long id;
    private Item item;
    private LocalDateTime updatedAt;
    private LocalDateTime creadtedAt;
    private Long IdUser;

    public Fav(Long id, Long idUser, Item item) {
        this.id = id;
        this.creadtedAt  = LocalDateTime.now();
        IdUser = idUser;
        this.item = item;
        this.updatedAt = LocalDateTime.now();
    }

    public Fav() {
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Long getIdUser() {
        return IdUser;
    }

    public void setIdUser(Long idUser) {
        IdUser = idUser;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fav fav = (Fav) o;
        return Objects.equals(id, fav.id) && Objects.equals(item, fav.item) && Objects.equals(updatedAt, fav.updatedAt) && Objects.equals(creadtedAt, fav.creadtedAt) && Objects.equals(IdUser, fav.IdUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, item, updatedAt, creadtedAt, IdUser);
    }
}
