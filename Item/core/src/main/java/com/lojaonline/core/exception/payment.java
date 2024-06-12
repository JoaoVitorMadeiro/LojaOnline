package com.lojaonline.core.exception;

import com.lojaonline.core.domain.Item;

public class payment {
    private Integer Pix = 1;
    private Integer Cartao = 2;
    private Integer Boleto = 3;
    private Integer cartaoParcelado = 4;
    private Item item;
    private Integer formaPagamento;
    private Integer parcelas;

    public void Pedido(Item item, Integer formaPagamento, Integer parcelas) {
        this.item = item;
        this.formaPagamento = formaPagamento;
        this.parcelas = parcelas;
    }

    public Integer calcularTotal() {
        return item.quantity * item.price;
    }

    public Integer calcularParcelas() {
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


    public void formaPagamento() {
        if (Pix == 1) {
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
