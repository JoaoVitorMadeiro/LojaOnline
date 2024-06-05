package com.lojaonline.usecaseitem.usercases;

import com.lojaonline.core.domain.Favorito;
import com.lojaonline.core.domain.Item;

public interface RemoveFavoritoUseCase {
    void removeFavorito(Favorito favorito, Item item);
}
