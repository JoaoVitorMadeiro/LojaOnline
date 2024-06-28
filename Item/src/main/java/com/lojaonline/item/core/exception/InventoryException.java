package com.lojaonline.item.core.exception;

public class InventoryException {
    private Long id;
    private Long productId;
    private Integer quantity;

    // Construtor padrão
    public InventoryException() {
    }

    // Construtor com parâmetros
    public InventoryException(Long id, Long productId, Integer quantity) {
        this.id = id;
        this.productId = productId;
        this.quantity = quantity;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}

