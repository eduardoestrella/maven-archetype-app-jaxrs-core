#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.core.dao;


import java.util.List;

public interface Dao<K, E> {

    void persist(E entity) throws Exception;

    E findById(K id);

    void delete(E entity) throws Exception;

}
