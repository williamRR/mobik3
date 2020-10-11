package com.mobike.demo.services;

import com.mobike.demo.entity.MedioPago;

import java.util.List;

public interface IMedioPagoService {

  public List<MedioPago> findAll();

  public void save(MedioPago medioPago);

  public MedioPago findOne(Long id);

  public void delete(Long id);
}
