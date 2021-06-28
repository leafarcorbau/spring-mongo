package com.dh.sp.mongo.factory;

import com.dh.sp.mongo.document.Item;
import java.util.UUID;

public class ItemFactory {

  public static Item.ItemBuilder create (final UUID seed){
    return Item.builder()
        .id(seed)
        .description("description-"+seed)
        .price(1D);
  }
}
