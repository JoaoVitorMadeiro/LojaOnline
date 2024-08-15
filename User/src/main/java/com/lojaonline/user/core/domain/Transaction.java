package com.lojaonline.user.core.domain;

import com.lojaonline.user.core.domain.enums.TransectionStatusEnum;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class Transaction {
    private Long Id;
    private Wallet fromwallet;
    private Wallet towallet;
    private BigDecimal value;
    private TransectionStatusEnum status;
    private LocalDateTime craetedAt;
    private LocalDateTime updatedAt;

    public Transaction(Long Id, Wallet fromwallet, Wallet towallet, BigDecimal value, TransectionStatusEnum status) {
        this.Id = Id;
        this.fromwallet = fromwallet;
        this.towallet = towallet;
        this.value = value;
        this.status = status;
        this.craetedAt = LocalDateTime.now();
    }
    public Transaction(Wallet fromwallet, Wallet towallet, BigDecimal value) {
        this.fromwallet = fromwallet;
        this.towallet = towallet;
        this.value = value;
        this.status = TransectionStatusEnum.PENDING;
        this.craetedAt = LocalDateTime.now();
    }

    public Transaction(){

    }

    public Wallet getFromwallet() {
        return fromwallet;
    }

    public void setFromwallet(Wallet fromwallet) {
        this.fromwallet = fromwallet;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public TransectionStatusEnum getStatus() {
        return status;
    }

    public void setStatus(TransectionStatusEnum status) {
        this.status = status;
    }

    public Wallet getTowallet() {
        return towallet;
    }

    public void setTowallet(Wallet towallet) {
        this.towallet = towallet;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public LocalDateTime getCraetedAt() {
        return craetedAt;
    }

    public void setCraetedAt(LocalDateTime craetedAt) {
        this.craetedAt = craetedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return Objects.equals(Id, that.Id) && Objects.equals(fromwallet, that.fromwallet) && Objects.equals(towallet, that.towallet) && Objects.equals(value, that.value) && status == that.status && Objects.equals(craetedAt, that.craetedAt) && Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fromwallet, towallet, value, status, craetedAt);
    }
}
