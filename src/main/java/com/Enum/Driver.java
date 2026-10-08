package com.Enum;

public class Driver
{
    public static void main(String[] args)
    {
        for(Month everyMonth : Month.values())
        {
            System.out.println(everyMonth);
        }
        //To Get Particular Month
        System.out.println(Month.FEBRUARY);
    }
}
