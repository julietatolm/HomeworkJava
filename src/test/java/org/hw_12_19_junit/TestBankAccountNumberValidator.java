package org.hw_12_19_junit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestBankAccountNumberValidator {

    static BankAccountNumberValidator bankAccountNumberValidator;

    @BeforeAll
    static void init() {
        bankAccountNumberValidator = new BankAccountNumberValidator();
    }

    //- БС может содержать только 14 цифр
//- Все 14 цифр не могут быть нулями
//- Номер счета не может быть нулевым или пустым.
    @Test
    void isValidAccountNumberReturnsTrue() {
        String accountNumber14 = "12345678912345";
        assertEquals(true, bankAccountNumberValidator.isValidAccountNumber(accountNumber14));
    }

    @Test
    void isValidAccountNumberReturnsFalse() {
        //15 numbers
        String accountNumber15 = "123456789123456";
        assertEquals(false, bankAccountNumberValidator.isValidAccountNumber(accountNumber15));

        //One or more of 14 numbers is null
        String accountNumber14HasZero = "01234567891234";
        String accountNumber14HasZeros = "01234567890000";
        assertEquals(false, bankAccountNumberValidator.isValidAccountNumber(accountNumber14HasZero));
        assertEquals(false, bankAccountNumberValidator.isValidAccountNumber(accountNumber14HasZeros));
        assertEquals(false, bankAccountNumberValidator.isValidAccountNumber("0"));
        //null
        assertThrows(NullPointerException.class, () -> bankAccountNumberValidator.isValidAccountNumber(null));
        //""
        assertEquals(false, bankAccountNumberValidator.isValidAccountNumber(""));
        //no letters
        assertEquals(false, bankAccountNumberValidator.isValidAccountNumber("12345678912345a"));
    }
}