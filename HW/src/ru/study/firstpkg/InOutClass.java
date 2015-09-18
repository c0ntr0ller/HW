package ru.study.firstpkg;

// import com.sun.org.apache.xpath.internal.operations.*;

//import java.lang.String;

import java.util.Scanner;

/**
 * Created by Bek on 17.09.2015.
 */
public class InOutClass {
    Scanner scanner = new Scanner(System.in);

    public int readNext(){
        while (!scanner.hasNextInt()){
            System.out.println("Не число! Введите снова!");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static void msgStart(int maxVal){
        System.out.println("Введите число от 0 до " + maxVal);
    }

    public static void msgLess(){
        System.out.println("< Меньше загаданного");
    }

    public static void msgMore(){
        System.out.println("> Больше загаданного");
    }

    public static void msgEqual(){
        System.out.println("!!!Бинго!!!");
    }

    public static void msgFail(int rightNumber){
        System.out.println("К сожалению вы исчерпали попытки. Правильное число " + rightNumber);
    }
}
