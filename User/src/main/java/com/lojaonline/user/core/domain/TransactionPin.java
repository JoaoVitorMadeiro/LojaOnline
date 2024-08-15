package com.lojaonline.user.core.domain;

import java.time.LocalDateTime;
import java.util.Objects;

public class TransactionPin {
    private Long Id;
    private User user;
    private String pin;
    private Integer attempts;
    private Boolean isBlocked;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public TransactionPin(Long Id, User user, String pin, Integer attempts, Boolean isBlocked) {
        this.Id = Id;
        this.user = user;
        this.pin = pin;
        this.attempts = attempts;
        this.isBlocked = isBlocked;
        this.createdAt =LocalDateTime.now();
    }

    public TransactionPin(User user, String pin) {
        this.user = user;
        this.pin = pin;
        this.attempts = 3;
        this.isBlocked = false;
        this.createdAt = LocalDateTime.now();
    }
    public TransactionPin(){

    }

    public Integer getAttempts() {
        return attempts;
    }

    public void setAttempts(Integer attempts) {
        this.attempts = attempts;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Boolean getBlocked() {
        return isBlocked;
    }

    public void setBlocked(Boolean blocked) {
        isBlocked = blocked;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransactionPin that = (TransactionPin) o;
        return Objects.equals(Id, that.Id) && Objects.equals(user, that.user) && Objects.equals(pin, that.pin) && Objects.equals(attempts, that.attempts) && Objects.equals(isBlocked, that.isBlocked) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, pin, attempts, isBlocked, createdAt);
    }
}
