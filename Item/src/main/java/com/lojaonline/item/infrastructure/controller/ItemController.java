package com.lojaonline.item.infrastructure.controller;

import com.lojaonline.item.infrastructure.dto.itemDtoRecord;
import com.lojaonline.item.infrastructure.entity.ItemEntity;
import com.lojaonline.item.infrastructure.service.ItemService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/item")
public class ItemController {
    private ItemService itemService;
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }
    
    @Operation(summary = "record a new permission", description = "save a new book in database", responses = {
        @ApiResponse(responseCode = "200", ref = "ok"),
        @ApiResponse(responseCode = "400", ref = "badRequest"),
        @ApiResponse(responseCode = "403", ref = "permissionDenied"),
        @ApiResponse(responseCode = "404", ref = "ResourceNotFound"),
        @ApiResponse(responseCode = "409", ref = "conflict")
})
    @PostMapping
    public  ResponseEntity <ItemEntity>  addItem(@RequestBody itemDtoRecord dto, @RequestParam boolean isAdmin) {
      ItemEntity itemEntity = itemService.addItem(dto, isAdmin);
      return new ResponseEntity<>(itemEntity, HttpStatus.CREATED);
    }
    @GetMapping("/nome/{nome}")
    public ItemEntity buscarPorNome(@PathVariable("nome") String nome) {
        return itemService.buscarPorNome(nome);
    }
    @GetMapping("/{id}")
    public ItemEntity buscarPorId(@PathVariable("id") Long id) {
        return itemService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable("id") ItemEntity idItemEntity, @RequestParam boolean isAdmin) {
        itemService.deleteItem(idItemEntity, isAdmin);
    }


   
    
}