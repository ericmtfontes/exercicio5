package application;

import utils.StringUtil;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite alguma coisa: ");
        String value = sc.nextLine();
        String newValue = StringUtil.invertedValue(value);
        System.out.println("Valor original: " + value);
        System.out.println("Valor invertido: " + newValue);
        sc.close();
    }
}
