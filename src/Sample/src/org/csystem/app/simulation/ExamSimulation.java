package org.csystem.app.simulation;

import org.csystem.util.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

public class ExamSimulation {
    public String lectureName;
    public int [][] grades;
    public double [] averages;
    public double average;

    public void findAverages()
    {
        int totalNumberOfStudents = 0;
        int totalGrades = 0;

        for (int i = 0; i < grades.length; ++i) {
            int total = ArrayUtil.sum(grades[i]);

            averages[i] = (double)total / grades[i].length;
            totalGrades += total;
            totalNumberOfStudents += grades[i].length;
        }
        average = (double)totalGrades / totalNumberOfStudents;
    }

    public void fillGrades()
    {
        Random r = new Random();
        Scanner kb = new Scanner(System.in);

        System.out.printf("%s sınavı için şube sayısını giriniz:", lectureName);
        grades = new int[Integer.parseInt(kb.nextLine())][];
        averages = new double[grades.length];

        for (int i = 0; i < grades.length; ++i) {
            System.out.printf("%d. şube öğrenci sayısı?", i + 1);
            int n = Integer.parseInt(kb.nextLine());

            grades[i] = ArrayUtil.getRandomArray(r, n, 0, 101);
        }
    }

    public ExamSimulation(String name)
    {
        lectureName = name;
    }

    public void run()
    {
        fillGrades();
        findAverages();
    }

    public void displayGrades()
    {
        System.out.printf("%s sınav notları:%n", lectureName);
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < grades.length; ++i) {
            System.out.printf("%d. şube notları:", i + 1);
            ArrayUtil.display(2, grades[i]);
        }
        System.out.println("------------------------------------------------------");
    }

    public void displayReport()
    {
        System.out.println("******************************************************");
        displayGrades();
        System.out.printf("%s sınavı şubeler not ortalamaları:%n", lectureName);
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < averages.length; ++i)
            System.out.printf("%d. şube not ortalaması:%f%n", i + 1, averages[i]);
        System.out.printf("%s sınavı okul ortalaması:%f%n", lectureName, average);
        System.out.println("******************************************************");
    }
}
