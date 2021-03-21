package com.company;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
@Getter
@Setter
@ToString
public class Car implements Comparable<Car>{

    protected String m_Id;
    protected String m_brand;
    protected String m_model;
    protected LocalDateTime m_creation;
    protected String m_color;
    protected Integer m_seats;

    public Car(String m_Id, String m_brand, String m_model, LocalDateTime m_creation, String m_color, Integer m_seats) {
        this.m_Id = m_Id;
        this.m_brand = m_brand;
        this.m_model = m_model;
        this.m_creation = m_creation;
        this.m_color = m_color;
        this.m_seats = m_seats;
    }

    @Override
    public int compareTo(Car o) {
        return this.m_Id.compareTo(o.m_Id);
    }
}
