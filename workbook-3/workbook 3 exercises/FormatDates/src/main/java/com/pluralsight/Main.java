package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main
{
    public static void main(String[] args)
    {
        dateOnly();
        timeOnly();
        dateAndTime();
    }

    public static void dateOnly(){
        //get current date
        LocalDate today = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(today.format(formatter));


    }

    public static void timeOnly () {
        //get current time
        LocalTime now = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm");
        System.out.println(now.format(formatter));
    }

    public static void dateAndTime (){

    }


    }
