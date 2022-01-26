package com.company;

public class Main {

    public static void main(String[] args) {
	//1

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println("fullName = " + "ФИО сотрудника - " + fullName);

    //2

        fullName = fullName.replace("a", "A");
        fullName = fullName.replace("b", "B");
        fullName = fullName.replace("c", "C");
        fullName = fullName.replace("d", "D");
        fullName = fullName.replace("e", "E");
        fullName = fullName.replace("f", "F");
        fullName = fullName.replace("g", "G");
        fullName = fullName.replace("h", "H");
        fullName = fullName.replace("i", "I");
        fullName = fullName.replace("j", "J");
        fullName = fullName.replace("k", "K");
        fullName = fullName.replace("l", "L");
        fullName = fullName.replace("m", "M");
        fullName = fullName.replace("n", "N");
        fullName = fullName.replace("o", "O");
        fullName = fullName.replace("p", "P");
        fullName = fullName.replace("q", "Q");
        fullName = fullName.replace("r", "R");
        fullName = fullName.replace("s", "S");
        fullName = fullName.replace("t", "T");
        fullName = fullName.replace("u", "U");
        fullName = fullName.replace("v", "V");
        fullName = fullName.replace("w", "W");
        fullName = fullName.replace("x", "X");
        fullName = fullName.replace("y", "Y");
        fullName = fullName.replace("z", "Z");
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName);

    //3

        fullName = fullName.replace(" ", "; ");
        System.out.println("Данные ФИО сотрудника для административного отдела - " + fullName);

    //4

        String fullName2 = "Иванов Семён Семёнович";
        fullName2 = fullName2.replace("ё", "е");
        fullName2 = fullName2.replace("Ё", "Е");
        System.out.println(fullName2);
    }
}
