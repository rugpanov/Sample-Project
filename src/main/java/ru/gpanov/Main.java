package ru.gpanov;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    Speaker speaker = new Speaker();
	    speaker.sayHello();
	    String[] str = new String[2];
	    str[0]="1";//ds
	    str[1]="2";
	    System.out.print(Arrays.asList(str));
    }
}