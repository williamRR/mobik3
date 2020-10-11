package com.mobike.demo.dao;

import com.mobike.demo.entity.Bike;
import org.springframework.data.repository.CrudRepository;

public interface IBikeDao extends CrudRepository<Bike, Long> {

}
