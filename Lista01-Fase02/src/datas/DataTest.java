package datas;


import java.util.Locale;
import java.util.Scanner;

public class DataTest {
    public static void main(String[] args) {

        DataClass dataClass2 = new DataClass();

        System.out.println(dataClass2);
        System.out.println("O dia de amanha sera: " + dataClass2.amanha());
        dataClass2.toString();
    }
}
