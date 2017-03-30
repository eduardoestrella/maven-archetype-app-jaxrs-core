#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.core.dao.entity;

import javax.persistence.*;

@Entity
@Table(name = "cat", schema = "sample_cat", catalog = "")
public class CatEntity {
    private int id;
    private String name;
    
    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setBrandid(String name) {
        this.name = name;
    }
}
