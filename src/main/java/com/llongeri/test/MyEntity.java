package com.llongeri.test;

import org.apache.commons.collections4.Equator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MyEntity  implements Equator<MyEntity> {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
    private Long id;

    @Override
    public boolean equate(MyEntity myEntity, MyEntity t1) {
        return false;
    }

    @Override
    public int hash(MyEntity myEntity) {
        return 0;
    }
}
