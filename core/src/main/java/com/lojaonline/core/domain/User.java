package com.lojaonline.core.domain;

import com.lojaonline.core.domain.enums.EnumUserType;

import java.util.UUID;

public class User {
    private UUID id;
    private String name;
    private String email;
    private String password;
    private EnumUserType.UserType type;

    public User(UUID id, String name, String email, String password, EnumUserType.UserType type) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.type = type;
    }
    public User () {
    }
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public EnumUserType.UserType getType() {
        return type;
    }
    public void setType(EnumUserType.UserType type) {
        this.type = type;
    }

    public static class Pedido {
        private Integer Pix = 1;
        private Integer Cartao = 2;
        private Integer Boleto = 3;
        private Integer cartaoParcelado = 4;
        private Item item;
        private Integer formaPagamento;
        private Integer parcelas;

        public Pedido(Item item, Integer formaPagamento, Integer parcelas) {
            this.item = item;
            this.formaPagamento = formaPagamento;
            this.parcelas = parcelas;
        }

        public Integer calcularTotal() {
            return item.quantity * item.price;
        }
        public Integer calcularParcelas(){
           Integer valorParcelado = calcularTotal() / parcelas;
           return valorParcelado;
        }

        public Integer aplicarDesconto() {
            Integer total = calcularTotal();
            switch (formaPagamento) {
                case 1: //pix
                    return total - (total * 10 / 100);
                case 2://cartao debito
                    return total - (total * 5 / 100);
                case 3://Boleto
                    return total - (total * 2 / 100);
                case 4://cartao parcelado
                    return total;
                default:
                    return total;
            }
        }


        public void formaPagamento(){
            if(Pix == 1){
                System.out.println("Pagamento via Pix");
                aplicarDesconto();
            } else if (Cartao == 2) {
                System.out.println("Pagamento via Cartão de Débito");
                aplicarDesconto();
            } else if (Boleto == 3) {
                System.out.println("Pagamento via Boleto");
                aplicarDesconto();
            } else if (cartaoParcelado == 4) {
                System.out.println("Pagamento via Cartão de Crédito Parcelado");
                calcularParcelas();
            }
        }
    }
}