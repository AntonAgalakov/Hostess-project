package ru.Eltex.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToData {
    public String get() {
        Date today = new Date();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy"); //pattern is specified here
        System.out.println(dateFormat.format(today)); //25-Feb-16

        dateFormat.applyPattern("dd-MM-yyyy");
        System.out.println(dateFormat.format(today));
        return dateFormat.format(today);
    }
}
