/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Tsebiso.Nzinzama
 */
import java.util.Arrays;

public class Person {
    
    private String name;
    private int age;
    private String gender;
    private String[] interests;

    
    public Person(String name, int age, String gender, String[] interests) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.interests = interests;
    }

    
    public String hello() {
        StringBuilder greeting = new StringBuilder();
        greeting.append("Hello, my name is ").append(name);
        greeting.append(", my gender is ").append(gender);
        greeting.append(" and I am ").append(age).append(" years old.");
        greeting.append(" My interests are ").append(Arrays.toString(interests));
        return greeting.toString();
    }

   
    public static void main(String[] args) {
        
        Person person = new Person(
            "Ryuk",
            35,
            "male",
            new String[] {"being a hardarse", "agile", "SSD hard drives"}
        );

        String greeting = person.hello();
        System.out.println(greeting);
    }
}

