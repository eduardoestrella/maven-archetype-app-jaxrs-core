#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.core.dao.sql;

import ${package}.core.dao.entity.CatEntity;

public final class CatSql {
    /**
     * Table name
     */
    private static final String TABLE_ENTITY;
    
    /**
     * Query Base
     */
    private static final String QUERY_BASE;
    
    /**
     * Find all
     */
    public static final String FIND_ALL;
    
    /**
     * Constructor por defecto
     */
    private CatSql() {

    }

    static {

        TABLE_ENTITY = CatEntity.class.getName();

        QUERY_BASE = "SELECT c1 FROM " + TABLE_ENTITY + " c1 ";

        FIND_ALL = "" +
                " SELECT " +
                "   * " +            
                " FROM " +
                "   cat c ";
    }
}
