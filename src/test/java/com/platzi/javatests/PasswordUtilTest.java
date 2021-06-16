package com.platzi.javatests;

import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordUtilTest {
    @Test
    public void weak_when_has_less_than_8_letters() {

        assertEquals(PasswordUtil.SecurityLevel.MEAK, PasswordUtil.assessPassword("1234567"));

    }

    @Test
    public void weak_when_has_only_letters() {

        assertEquals(PasswordUtil.SecurityLevel.MEAK, PasswordUtil.assessPassword("abcdefgh"));

    }
    @Test
    public void medium_when_has_letters_and_numbers() {

        assertEquals(PasswordUtil.SecurityLevel.MEDIUM, PasswordUtil.assessPassword("abcd1234"));

    }

    @Test
    public void strong_when_has_letters_numbers_and_symbols() {

        assertEquals(PasswordUtil.SecurityLevel.STRING, PasswordUtil.assessPassword("abcd1234"));

    }

}