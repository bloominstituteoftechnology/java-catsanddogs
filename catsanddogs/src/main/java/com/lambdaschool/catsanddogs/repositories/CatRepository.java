package com.lambdaschool.catsanddogs.repositories;

import com.lambdaschool.catsanddogs.models.Cat;
import org.springframework.data.repository.CrudRepository;

public interface CatRepository extends CrudRepository<Cat, Long>
{
}
