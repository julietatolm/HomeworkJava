package org.hw_12_07;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

//Second level: 5. Создать класс Cat с полями
//String name
//int age
//String colour

@ToString
@Getter
@AllArgsConstructor
public class Cat {
    private String name;
    private int age;
    private String colour;
}
