package ru.study.firstpkg;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Bek on 17.09.2015.
 */
public class Main {
    public static void main(String[] args) {
        int iNum = 0;
        int maxVal = 100;
        Checker checker = new Checker(maxVal);

        InOutClass inout = new InOutClass();
        inout.msgStart(maxVal);

        for (int i = 0; i < 7; i++) {
            iNum = inout.readNext();
            if (checker.numIsLess(iNum)){
                inout.msgLess();
            }
            if (checker.numIsMore(iNum)){
                inout.msgMore();
            }
            if (checker.numEqual(iNum)){
                break;
            }
        }

        if (checker.numEqual(iNum)){
            inout.msgEqual();
        }
        else{
            inout.msgFail(checker.getiRnd());
        }

    }
}
