package com.lambdaschool.catsanddogs.repositories;

    import com.lambdaschool.catsanddogs.models.Dog;
    import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long>
{
}
