package com.namayatri.namayatri.Payload;

import jakarta.persistence.Column;
import org.springframework.stereotype.Component;

@Component
public class CountryDto {

    private Integer id;


    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
