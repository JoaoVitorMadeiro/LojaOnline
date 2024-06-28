package com.lojaonline.user.core.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Wallet {
    private Long Id;
    private User user;
    private BigDecimal balance;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Wallet(Long Id, User user, BigDecimal balance, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.Id = Id;
        this.user = user;
        this.balance = balance;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Wallet(BigDecimal balance, User user) {
        this.balance = balance;
        this.user = user;
        this.createdAt = LocalDateTime.now();
    }

    public Wallet() {
    }


}
