package com.lambdaschool.catsanddogs;

import com.lambdaschool.catsanddogs.models.Cat;
import com.lambdaschool.catsanddogs.models.Dog;
import com.lambdaschool.catsanddogs.repositories.CatRepository;
import com.lambdaschool.catsanddogs.repositories.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// @Component
public class SeedData implements CommandLineRunner
{
    @Autowired
    private DogRepository dogRepos;

    @Autowired
    private CatRepository catRepos;

    @Override
    public void run(String[] args) throws Exception
    {
        Dog dogTemp = new Dog();
        dogTemp.setDogname("Dottie");
        dogRepos.save(dogTemp);

        dogTemp = new Dog();
        dogTemp.setDogname("Ginger");
        dogRepos.save(dogTemp);

        dogTemp = new Dog();
        dogTemp.setDogname("Mojo");
        dogRepos.save(dogTemp);

        Cat catTemp = new Cat();
        catTemp.setCatname("Tiger");
        catRepos.save(catTemp);
    }
}
