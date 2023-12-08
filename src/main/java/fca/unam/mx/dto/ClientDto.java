package fca.unam.mx.dto;

import org.jdbi.v3.core.mapper.reflect.ColumnName;
public class ClientDto {
    private Long id;
    private String name;
    private String lastname;
    private String lastname2;
    private String rfc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ColumnName("nombre")
    public String getName() {
        return name;
    }

    public void setName(String name) {                              
        this.name = name;
    }

    @ColumnName("apellido_paterno")
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }    

    @ColumnName("apellido_materno")
    public String getLastname2() {
        return lastname2;
    }

    public void setLastname2(String lastname2) {
        this.lastname2 = lastname2;
    }

    @ColumnName("rfc")
    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
}
