package com.design.pattern.iterator.impl;


public interface SuperHeroArray<E>
{
    Itr<E> getIterator();
}