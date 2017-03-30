package it.pkg.core.dao.impl;

import it.pkg.core.dao.JpaDao;
import it.pkg.core.dao.CatDao;
import it.pkg.core.dao.entity.CatEntity;
import it.pkg.core.dao.sql.CatSql;

import javax.persistence.Query;
import java.util.List;

public class CatDaoImpl extends JpaDao<Integer, CatEntity> implements CatDao {

    public List<CatEntity> findAll() {
        Query query = entityManager.createNativeQuery(CatSql.FIND_ALL, CatEntity.class);
        List<CatEntity> cats = query.getResultList();

        return cats;
    }

}

