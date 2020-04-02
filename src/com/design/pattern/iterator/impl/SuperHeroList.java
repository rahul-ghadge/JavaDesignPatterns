package com.design.pattern.iterator.impl;

import com.design.pattern.model.SuperHero;

public class SuperHeroList implements SuperHeroArray<SuperHero>
{
    private SuperHero[] superHeros;
     
    public SuperHeroList(SuperHero[] superHeros)
    {
        this.superHeros = superHeros;
    }
     
    @Override
    public Itr<SuperHero> getIterator() {
        return new SuperHeroIterator(superHeros);
    }
}