package org.hw_11_28;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


//        Using groupingBy in Collectors method:
//        Count number of students with same Second name
//        How many users red the same book

public class App {
    public static void main(String[] args) throws Exception {

        Student s1 = new Student("001", "Aleks", "Groz");
        s1.addBook("Java 8 extended");
        s1.addBook("Spring boot in action");
        s1.addBook("Effictive Java");


        Student s2 = new Student("002", "Shlomi", "Tailer");

        s2.addBook("Effictive Java");
        s2.addBook("Introduction to HTML");


        Student s3 = new Student("003", "Petr", "Tailer");

        s3.addBook("Effictive Java");
        s3.addBook("Introduction to HTML");
        List<Student> students = new ArrayList<Student>();
        students.add(s2);
        students.add(s1);
        students.add(s3);

        processStudents(students);


    }

    static void processStudents(List<Student> students) {

        Stream<Student> studentStream = students.stream();
        Stream<Set<String>> booksStream = studentStream.map((Student s) -> s.getBooks());

        Stream<String> booksNamesStream = booksStream.flatMap((Set x) -> x.stream());

        Set<String> books = booksNamesStream.filter((String sBookName) -> sBookName.contains("Java")).collect(
                Collectors.toSet());

        Map<String, Set<String>> result = students.stream().collect(Collectors.toMap(
                s1 -> s1.getId(),
                s1 -> s1.getBooks()
        ));

        Stream<Map.Entry<String, Set<String>>> mapStream = result.entrySet().stream();

        //Using groupingBy method to count number of students with same Second name
        Map<String, Long> sr1 = students.stream().collect(
                Collectors.groupingBy(s -> s.getFamilyName(), Collectors.counting()
                ));
        //How many users red the same book
//        Map<String, Long> res2 = students.stream().map(x ->
//
//                {
//                    List<Pair<String, String>> l = new ArrayList<>();
//                    x.getBooks().forEach(b -> l.add(new Pair<>(b, x.getId())));
//                    return l;
//                }
//
//        ).flatMap(c -> c.stream()).collect(
//                Collectors.groupingBy(x -> x.getKey(), Collectors.counting()));


    }
}
