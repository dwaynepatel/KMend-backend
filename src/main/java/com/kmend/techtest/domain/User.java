package com.kmend.techtest.domain;

import com.kmend.techtest.utility.Region;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue
    private Long id;


    private Integer birthday;

    private Integer spend;

    public String region;


}
