package Kata1;

import java.time.LocalDate;
import java.time.Month;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alvar
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alvaro Tracnho", LocalDate.of(1999, Month.AUGUST, 27));
        System.out.println(person.getName() + " " + person.getAge());
    }
            
            
}
