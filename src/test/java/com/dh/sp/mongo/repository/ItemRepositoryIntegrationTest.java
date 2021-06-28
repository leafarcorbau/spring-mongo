package com.dh.sp.mongo.repository;

import static org.assertj.core.api.Assertions.assertThat;

import com.dh.sp.mongo.IntegrationTest;
import com.dh.sp.mongo.document.Item;
import com.dh.sp.mongo.factory.ItemFactory;
import java.util.Optional;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ItemRepositoryIntegrationTest extends IntegrationTest {

  @Autowired
  private ItemRepository itemRepository;

  @Test
  public void findById(){

    //Given
    final UUID seed = UUID.randomUUID();
    final Item item = itemRepository.save(ItemFactory.create(seed).build());

    //When
    final Optional<Item> actual = itemRepository.findById(seed);

    //Then
    assertThat(actual).isNotEmpty();
    assertThat(actual.get())
        .usingRecursiveComparison()
        .isEqualTo(item);
  }
}
