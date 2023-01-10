package org.hw_12_19_regexp;


import java.util.regex.Pattern;

public class RegExpHW {
    public static void main(String[] args) {
    // 1) Напишите регулярное выражение, которое соответствует любому номеру телефона.
// Телефонный номер состоит из 7 цифр подряд, 1234567, или из 3х цифр, пробела или тире, а затем из 4 цифр (123-4567,
// 123 4567).
//        String test = "1234567";
//        String test1 = "123 4567";
//        String test2 = "123-4567";
//        String test3 = "14567";
//        String test4 = "12345678";

        String regexp1 = "\\d{3}[\\s-]?\\d{4}";

//        System.out.println(Pattern.matches(regexp1, test));
//        System.out.println(Pattern.matches(regexp1, test1));
//        System.out.println(Pattern.matches(regexp1, test2));
//        System.out.println(Pattern.matches(regexp1, test3));
//        System.out.println(Pattern.matches(regexp1, test4));


        //2) Напишите регулярное выражение, которое соответствует URL-адресу сайта вида https://someaddress.someending
//        String test = "https://someaddress.someending";
//        String test5 = "https://someaddress.someending.tgr";
//        String test1 = "htttps://someaddress.someending";
//        String test2 = "https://someaddress.someen.ding";
//        String test3 = "https://someaddress";
//        String test4 = "htt://someaddress.someending";

        String regexp2 = "^(https://)[a-z0-9]+\\.[a-z0-9]+";

//        System.out.println(Pattern.matches(regexp2, test));
//        System.out.println(Pattern.matches(regexp2, test1));
//        System.out.println(Pattern.matches(regexp2, test2));
//        System.out.println(Pattern.matches(regexp2, test3));
//        System.out.println(Pattern.matches(regexp2, test4));
//        System.out.println(Pattern.matches(regexp2, test5));


//         3) Напишите метод поиска в тексте всех слов, начинающихся с определенной буквы.

//        String test = "A";
//        String test1 = "Assss";
//        String test2 = "ing";
//        String test3 = "https";
//        String test4 = "aaaasomeending";

        String regexp3 = "^(A|a).*";

//        System.out.println(Pattern.matches(regexp3, test));
//        System.out.println(Pattern.matches(regexp3, test1));
//        System.out.println(Pattern.matches(regexp3, test2));
//        System.out.println(Pattern.matches(regexp3, test3));
//        System.out.println(Pattern.matches(regexp3, test4));



//         *4) Напишите метод проверки введенного пароля - от 8 до 15 символов, обязательно содержит цифры,
//         буквы верхнего и нижнего регистра и спецсимволы.

//        String test = "A";
//        String test1 = "AvFrku*wgc78!j";
//        String test2 = "ing";
//        String test3 = "https";
//        String test4 = "ksngJ*?GVfb";

        String regexp4 = "((?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#?^*%&]).{8,15})";

//        System.out.println(Pattern.matches(regexp4, test));
//        System.out.println(Pattern.matches(regexp4, test1));
//        System.out.println(Pattern.matches(regexp4, test2));
//        System.out.println(Pattern.matches(regexp4, test3));
//        System.out.println(Pattern.matches(regexp4, test4));
    }
}



