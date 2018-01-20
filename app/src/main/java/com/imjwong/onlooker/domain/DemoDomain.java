package com.imjwong.onlooker.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * DemoDomain class
 *
 * @author J.Wong
 * @date 2018/01/19
 */
@Entity
@Table(name = "demo_domain")
public class DemoDomain extends AbstractAuditingEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
