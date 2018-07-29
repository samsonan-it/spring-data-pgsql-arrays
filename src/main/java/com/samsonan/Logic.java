package com.samsonan;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name="LOGICS")
public class Logic {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name="LOGIC_PARAMS")
    @Type(type = "com.samsonan.FloatArrayUserType")
    private Float[] floatParams;

    protected Logic() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float[] getFloatParams() {
        return floatParams;
    }

    public void setFloatParams(Float[] floatParams) {
        this.floatParams = floatParams;
    }

    @Override
    public String toString() {
        return "Logic{" +
                "id=" + id +
                ", floatParams=" + Arrays.toString(floatParams) +
                '}';
    }
}
