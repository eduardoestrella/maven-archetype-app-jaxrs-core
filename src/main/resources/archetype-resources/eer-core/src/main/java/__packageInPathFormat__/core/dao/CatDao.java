#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.core.dao;

import ${package}.core.dao.entity.CatEntity;

import java.util.List;

public interface CatDao {

    List<CatEntity> findAll();

}

