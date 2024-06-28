package com.lojaonline.favorite.usecase.usecases;

import com.lojaonline.item.core.domain.Favorito;
import com.lojaonline.item.core.domain.Item;

public interface RemoveFavoritoUseCase {
    void removeFavorito(Favorito favorito, Item item);
}
