package com.design.pattern.iterator.impl;

import com.design.pattern.model.SuperHero;

public class SuperHeroIterator implements Itr<SuperHero> {
     
    private SuperHero[] superHeros;
    private int position;
     
    public SuperHeroIterator(SuperHero[] superHeros)
    {
        this.superHeros = superHeros;
        position = 0;
    }
 
    @Override
    public void reset() {
        position = 0;
    }
 
    @Override
    public SuperHero next() { 
        return superHeros[position++];
    }
 
    @Override
    public SuperHero currentItem() {
        return superHeros[position];
    }
 
    @Override
    public boolean hasNext() {
        if(position >= superHeros.length)
            return false;
        return true;
    }
}