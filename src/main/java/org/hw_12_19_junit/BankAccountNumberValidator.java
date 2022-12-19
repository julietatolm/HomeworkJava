package org.hw_12_19_junit;

//Написать метод проверки номера банковского счета public boolean isValidAccountNumber(String accountNumber)
//и тесты проверки корректной работы метода
//- БС может содержать только 14 цифр
//- Все 14 цифр не могут быть нулями
//- Номер счета не может быть нулевым или пустым.
//Задачу выполнить способом test-driven development,
// TDD (сначала написать тесты на метод, после чего напиcать сам метод).

public class BankAccountNumberValidator {

    public boolean isValidAccountNumber(String accountNumber) {
        if (accountNumber.length() == 14) {
            if (accountNumber.contains("0")) {
                return false;
            }
            if (accountNumber.matches("a-zA-Z")) {
                return false;
            }
            if (accountNumber.isEmpty()) {
                return false;
            }
            return true;

        }
        else {
            return false;
        }
    }

}
