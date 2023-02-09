package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Obliczanie średniej arytmetyczniej wprowadzonych liczb.");

        Scanner scanner = new Scanner(System.in);
        boolean shouldContiniue = true;
        List<Float> numbers = new ArrayList<>();

        System.out.print("Wprowadź pierwszą liczbę: ");
        float firstNumber = scanner.nextInt();
        numbers.add(firstNumber);
        System.out.print("Wprowadź kolejną liczbę: ");
        float secondNumber = scanner.nextInt();
        numbers.add(secondNumber);

        do {
            System.out.println("1. Dodaj kolejną liczbę \n" +
                    "2. Wylicz średnią arytmetyczną");

            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.print("Wprowadź liczbę: ");
                    float anotherNumber = scanner.nextInt();
                    numbers.add(anotherNumber);
                    break;
                case 2:
                    System.out.print("Średnia arytmetyczna wprowadzonych liczb to: " + countAverage(numbers));
                    shouldContiniue = false;
            }

        } while (shouldContiniue);

    }

    public static float countAverage(List<Float> list) {
        float sum = 0;
        for (Float number : list) {
            sum += number;
        }
        float average = (sum / list.size());
        return average;
    }
}
