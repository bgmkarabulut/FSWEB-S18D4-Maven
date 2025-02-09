package com.workintech.s18d1.dao;

import com.workintech.s18d1.entity.BreadType;
import com.workintech.s18d1.entity.Burger;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class BurgerDaoImpl implements BurgerDao{
    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    public BurgerDaoImpl(EntityManager entityManager){
        this.entityManager=entityManager;
    }

    @Override
    public void save(Burger burger) {

    }

    @Override
    public Burger findById(int id) {
        return null;
    }

    @Override
    public List<Burger> findAll() {
        return List.of();
    }

    @Override
    public List<Burger> findByPrice(double price) {
        return List.of();
    }

    @Override
    public List<Burger> findByBreadType(BreadType breadType) {
        return List.of();
    }

    @Override
    public List<Burger> findByContent(String content) {
        return List.of();
    }

    @Override
    public void update(Burger burger) {

    }

    @Override
    public void remove(int id) {

    }
}
