package com.mobike.demo.dao;

import com.mobike.demo.entity.MedioPago;
import org.springframework.data.repository.CrudRepository;

public interface IMedioPagoDAO extends CrudRepository<MedioPago, Long> {
}
