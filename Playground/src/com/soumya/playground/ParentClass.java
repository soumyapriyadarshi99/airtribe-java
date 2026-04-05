package com.soumya.playground;

public class ParentClass {
    public int num;
    public String str;
    ParentClass(){
        System.out.println("Parent class constructor called");
    }

    ParentClass( int num, String str){
        this.num = num;
        this.str = str;

        System.out.println(num +", "+ str + " parametrised constructor");
    }
}
