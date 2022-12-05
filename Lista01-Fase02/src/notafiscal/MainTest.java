package notafiscal;

import java.util.Locale;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        NotaFiscal nota = new NotaFiscal();
        System.out.println("Digite o valor da Quantidade Comprada");
        nota.setQtdCompradaItem(sc.nextInt());
        System.out.println("Digite o valor do Preco");
        nota.setPreco(sc.nextDouble());

        System.out.println(nota.valorNotaFiscal());
        sc.close();
    }
}
