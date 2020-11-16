package ru.mirea.gib04.lab4.zadanie2;

class Movie implements Priceable{
    int price = 30;

    @Override
    public int getPrice()
    {
        return price;
    }
}