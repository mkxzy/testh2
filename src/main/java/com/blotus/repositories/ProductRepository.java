package com.blotus.repositories;

import com.blotus.domain.ProductModel;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Administrator on 2017/3/12.
 */
public interface ProductRepository extends CrudRepository<ProductModel, Integer> {
}
