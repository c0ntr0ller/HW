package ru.study.firstpkg;

import java.util.Random;

/**
 * Класс логики
 * Назначение
 * 1. создание загадываемого числа
 * 2. проверка результатов на совпадение
 */
public class Checker {
    private int iRnd;

    public Checker(int maxVal) {
        Random random = new Random();
        iRnd = random.nextInt(maxVal);
    }

    public boolean numIsLess(int inNumber) {
        return (inNumber < iRnd);
    }

    public boolean numIsMore(int inNumber) {
        return (inNumber > iRnd);
    }

    public boolean numEqual(int inNumber) {
        return (inNumber == iRnd);
    }

    public int getiRnd(){
        return iRnd;
    }
}
