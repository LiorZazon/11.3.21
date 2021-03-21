package com.company;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@ToString
@Getter
@Setter
       public class Person implements Comparable<Person> {

    protected Integer m_id;
    protected Float m_height;
    protected String m_name;
    protected Date m_birth_date;

    public Person(int m_id, float m_height, String m_name, Date b_date) {
        this.m_id = m_id;
        this.m_height = m_height;
        this.m_name = m_name;
        this.m_birth_date = b_date;
    }

    @Override
    public int compareTo(Person o) {
        return this.m_birth_date.compareTo(o.m_birth_date);
        // compare myself (this) to Person o
        // if this should come later in the line return 1
        // if this should come before in the line return -1
        // if does not matter return 0
        // -1 0 1
        // A     B   +1
        //   AB       0
        // B     A   -1
        // this
        /*if (this.m_height > o.m_height) {
            return 1; // this will come after
        } else if (this.m_height < o.m_height) {
            return -1; // this will come before
        }
        return 0; // equal -- order not matters

        /*@Override
        public int compareTo(Person o){
            if (this.m_height < o.m_height){
                return 1;
            }
            else if (this.m_height > o.m_height){
                return -1;
            }
            return 0;
        }*/
    }
}

