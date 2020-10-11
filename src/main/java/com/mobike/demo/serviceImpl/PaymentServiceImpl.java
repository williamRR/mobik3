package com.mobike.demo.serviceImpl;

import com.mobike.demo.dao.IMedioPagoDAO;
import com.mobike.demo.entity.MedioPago;
import com.mobike.demo.services.IMedioPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MedioPagoServiceImpl implements IMedioPagoService {

  @Autowired
  private IMedioPagoDAO medioPagoDAO;

  @Override
  @Transactional(readOnly = true)
  public List<MedioPago> findAll() {
    return (List<MedioPago>) medioPagoDAO.findAll();
  }

  @Override
  @Transactional
  public void save(MedioPago medioPago) {
    medioPagoDAO.save(medioPago);
  }

  @Override
  @Transactional(readOnly = true)
  public MedioPago findOne(Long id) {
    return medioPagoDAO.findById(id).orElse(null);
  }

  @Override
  @Transactional
  public void delete(Long id) {
    medioPagoDAO.deleteById(id);
  }
}
