package it.pkg.core.dao;

import it.pkg.core.dao.entity.CatEntity;

import java.util.List;

public interface CatDao {

    List<CatEntity> findAll();

}

