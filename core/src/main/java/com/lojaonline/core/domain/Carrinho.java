package com.lojaonline.core.domain;

import com.lojaonline.core.exception.Pedido;

import java.util.UUID;

public class Carrinho {
    private UUID id;
    private Item items;
    private Pedido pedido;
    private Favorito favorito;
}