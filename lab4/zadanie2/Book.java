package ru.mirea.gib04.lab4.zadanie2;

class Book implements Priceable
{
    int royalty = 5;
    int markup = 7;

    @Override
    public int getPrice()
    {
        return royalty + markup;
    }
}