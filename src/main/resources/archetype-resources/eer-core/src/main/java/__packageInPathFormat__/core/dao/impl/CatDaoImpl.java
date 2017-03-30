#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.core.dao.impl;

import ${package}.core.dao.JpaDao;
import ${package}.core.dao.CatDao;
import ${package}.core.dao.entity.CatEntity;
import ${package}.core.dao.sql.CatSql;

import javax.persistence.Query;
import java.util.List;

public class CatDaoImpl extends JpaDao<Integer, CatEntity> implements CatDao {

    public List<CatEntity> findAll() {
        Query query = entityManager.createNativeQuery(CatSql.FIND_ALL, CatEntity.class);
        List<CatEntity> cats = query.getResultList();

        return cats;
    }

}

