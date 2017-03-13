package com.YegorovOleksiy.practice.modul03.task03;

import java.util.Date;

/**
 * Created by Miles on 06.03.2017.
 */
public class Solution {

    public static void main(String[] args) {

        Course course1 = new Course(new Date(2016, 9, 1), "Math");
        Course course2 = new Course(new Date(2016, 9, 1), "Economy");
        Course course3 = new Course(new Date(2016, 9, 1), "Literature");
        Course course4 = new Course(new Date(2016, 9, 1), "Physics");
        Course course5 = new Course(new Date(2016, 9, 1), "Computer Science");

        Student studentPetro = new Student("Petro", "Zinych", 3);
        Student studentBohdan = new Student("Kozyrenko", new Course[]{course1, course2});

        CollegeStudent collegeStudent1 =new CollegeStudent("Oleksandr", "Voitko", 7);
        CollegeStudent collegeStudent2 =new CollegeStudent("Kolesnyk", new Course[]{course3, course4});
        CollegeStudent collegeStudent3 =new CollegeStudent("Kozyrenko", "Bohdan", 101, "Drahomanov", 87, 1055);

        SpecialStudent specialStudent = new SpecialStudent(123987);
        SpecialStudent specialStudent1 = new SpecialStudent("Voitenko", "Viktor", 5);
        SpecialStudent specialStudent2 = new SpecialStudent("Nechytailo", new Course[]{course5, course2});


    }

}
