package com.dh.sp.mongo.repository;

import com.dh.sp.mongo.document.Item;
import java.util.UUID;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ItemRepository extends MongoRepository<Item, UUID> {

}
