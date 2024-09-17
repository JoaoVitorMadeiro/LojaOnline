package com.lojaonline.item.infrastructure.dto;

 import com.lojaonline.item.core.domain.enums.CategoryEnum;
 import com.lojaonline.item.infrastructure.entity.ItemEntity;
 import jakarta.persistence.GeneratedValue;
 import jakarta.persistence.GenerationType;
 import jakarta.persistence.Id;
 import lombok.Getter;

 public class ItemDto {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     private String nome;
     private Integer preco;
     private String descricao;
     private CategoryEnum categoria;
     private Integer quantidade;

     public ItemDto(String nome, Integer preco, String descricao, CategoryEnum categoria,  Integer quantidade) {
         this.nome = nome;
         this.preco = preco;
         this.descricao = descricao;
         this.quantidade = quantidade;
         this.categoria = categoria;
     }

     public ItemEntity transformaItem() {
         return new ItemEntity(nome, descricao, preco, quantidade, categoria);
     }

     // Getters and setters...
     public Long getId() {
         return id;
     }

     public void setId(Long id) {
         this.id = id;
     }

     public String getNome() {
         return nome;
     }

     public void setNome(String nome) {
         this.nome = nome;
     }

     public Integer getQuantidade() {
         return quantidade;
     }

     public void setQuantidade(Integer quantidade) {
         this.quantidade = quantidade;
     }

     public Integer getPreco() {
         return preco;
     }

     public void setPreco(Integer preco) {
         this.preco = preco;
     }
 }