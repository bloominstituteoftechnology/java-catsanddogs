package com.lambdaschool.catsanddogs.models;

import javax.persistence.*;

@Entity
@Table(name = "cats")
public class Cat
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long catid;

    @Column(unique = true, nullable = false)
    String catname;

    public Cat()
    {
    }

    public long getCatid()
    {
        return catid;
    }

    public void setCatid(long catid)
    {
        this.catid = catid;
    }

    public String getCatname()
    {
        return catname.toUpperCase();
    }

    public void setCatname(String catname)
    {
        this.catname = catname;
    }
}
