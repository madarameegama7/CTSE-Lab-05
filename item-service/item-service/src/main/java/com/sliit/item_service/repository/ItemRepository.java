package com.sliit.item_service.repository;

import com.sliit.item_service.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository <Item, Long> {


    Item getProductByProductID(Long productId);

}
