package com.lambdaschool.catsanddogs.models;

import javax.persistence.*;

@Entity
@Table(name = "dogs")
public class Dog
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long dogid;

    @Column(unique = true, nullable = false)
    String dogname;

    public Dog()
    {
    }

    public long getDogid()
    {
        return dogid;
    }

    public void setDogid(long dogid)
    {
        this.dogid = dogid;
    }

    public String getDogname()
    {
        return dogname;
    }

    public void setDogname(String dogname)
    {
        this.dogname = dogname;
    }
}
