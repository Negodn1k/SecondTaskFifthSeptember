package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task {

    public Task() {
        sumChecker();
        numChecker();
        numTFChecker();
        cycleWriter();
        years();
        byteArray();
        hundredArray();
        arrayUpper();
        twoDArray();
        setArray();
    }

    Scanner input = new Scanner(System.in);

    private boolean sumChecker() {
        System.out.print("Enter first num = ");
        int firstNum = input.nextInt();
        System.out.println("Enter second num = ");
        int secondNum = input.nextInt();

        if (firstNum + secondNum >= 10 && firstNum + secondNum <= 20) {
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }
    }

    private String numChecker() {
        System.out.print("Enter value = ");
        int value = input.nextInt();

        if (value >= 0) {
            System.out.println("Positive");
            return "Positive";
        } else {
            System.out.println("Negative");
            return "Negative";
        }
    }

    private boolean numTFChecker() {
        System.out.print("Enter value = ");
        int value = input.nextInt();

        if (value >= 0) {
            System.out.println("Positive");
            return true;
        } else {
            System.out.println("Negative");
            return false;
        }
    }

    private void cycleWriter() {
        System.out.print("Enter String = ");
        String string = input.next();
        System.out.print("Enter times = ");
        int times = input.nextInt();

        for (int i = times; i != 0; i--) {
            System.out.println(string);
        }
    }

    private boolean years() {
        System.out.print("Enter year = ");
        int year = input.nextInt();

        if (year % 4 == 0) {
            System.out.println("leap year");
            return true;
        } else {
            System.out.println("not leap year");
            return false;
        }
    }

    private void byteArray() {
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (Math.random() > 0.5) {
                array.add(1);
            } else array.add(0);
        }

        System.out.println(array);

        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).equals(0)) {
                array.set(i, 1);
            } else array.set(i, 0);
        }

        System.out.println(array);
    }

    private void hundredArray() {
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            array.add(i + 1);
        }

        System.out.println(array);
    }

    private void arrayUpper() {
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            array.add((int) (Math.random() * 12));
        }

        System.out.println(array);

        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) < 6) {
                array.set(i, array.get(i) * 2);
            }
        }

        System.out.println(array);
    }

    private void twoDArray() {
        List<List<Integer>> array = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            List<Integer> secondArray = new ArrayList<>();
            for (int sI = 0; sI < 10; sI++){
                secondArray.add((int) (Math.random() * 10));
            }
            array.add(secondArray);
        }

        for (List<Integer> integers : array) {
            System.out.println(integers);
        }

        System.out.println();

        for (int i = 0; i < array.size(); i++) {
            for (int sI = 0; sI <= array.get(i).size(); sI++) {
                if (i == sI) {
                    array.get(i).set(sI, 1);
                }
            }
        }

        for (List<Integer> integers : array) {
            System.out.println(integers);
        }
    }

    private List<Integer> setArray() {
        System.out.print("Enter size = ");
        int size = input.nextInt();
        System.out.print("Enter value = ");
        int value = input.nextInt();

        List<Integer> array = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            array.add(value);
        }

        System.out.println(array);
        return array;
    }
}
