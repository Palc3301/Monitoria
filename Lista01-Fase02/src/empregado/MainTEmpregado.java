package empregado;

import java.util.Locale;
import java.util.Scanner;

public class MainTEmpregado {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Empregado empregado1 = new Empregado();
        System.out.println("Digite Seu Nome:");
        empregado1.setNome(sc.next());
        System.out.println("Digite Seu SobreNome");
        String valor = sc.nextLine();
        empregado1.setSobreNome(sc.nextLine());
        System.out.println("Digite o Valor do Salario");
        empregado1.setSalario(sc.nextDouble());

        System.out.println("Digite o Proximo Contratado");

        Empregado empregado2 = new Empregado();
        System.out.println("Digite Seu Nome:");
        empregado2.setNome(sc.next());
        System.out.println("Digite Seu SobreNome");
        String valor2 = sc.nextLine();
        empregado2.setSobreNome(sc.nextLine());
        System.out.println("Digite o Valor do Salario");
        empregado2.setSalario(sc.nextDouble());

        System.out.println("Salario anual R$" + empregado1.salarioAnual());
        System.out.println("Salario anual R$" + empregado2.salarioAnual());


        System.out.print(empregado1.valorDoEmpregado());
        System.out.printf("%.2f", empregado1.aumento());
        System.out.println();
        System.out.print("|");
        System.out.println();
        System.out.print(empregado2.valorDoEmpregado());
        System.out.printf("%.2f", empregado2.aumento());

        sc.close();
    }
}
