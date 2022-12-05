import notafiscal.NotaFiscal;
import ouvidoria.Manifestacao;
import ouvidoria.Ouvidoria;
import ouvidoria.enums.SituacaoManifestacao;
import ouvidoria.enums.TipoManifestacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Ouvidoria ouvidoria = new Ouvidoria();

        int opcao = 0;
        do {
            Scanner sc = new Scanner(System.in);
            Manifestacao manifestacao = new Manifestacao();
            System.out.print("Deseja Relizar uma Manifestacao ou listar as Manifestacoes?\n" +
                    "ELOGIO: 1\n" +
                    "RECLAMACAO: 2\n" +
                    "SUGESTAO: 3\n" +
                    "LISTAR: 4\n" +
                    "SAIR: 5\n" +
                    ":");
            opcao = Integer.parseInt(sc.nextLine());
            if (opcao == 1) {
                manifestacao.setCodigo(ouvidoria.sizeMani());
                System.out.println("Digite o Titulo da manifestacao:");
                manifestacao.setTitulo(sc.nextLine());

                System.out.println("Digite seu Nome:");
                manifestacao.setAutor(sc.nextLine());

                System.out.println("Digite uma descricao:");
                manifestacao.setDescricao(sc.nextLine());

                manifestacao.setTipo(TipoManifestacao.ELOGIO);
                manifestacao.setSituacao(SituacaoManifestacao.ABERTA);
                ouvidoria.registrarManifestacao(manifestacao);

            } else if (opcao == 2) {

                manifestacao.setCodigo(ouvidoria.sizeMani());
                System.out.println("Digite o Titulo da manifestacao:");
                manifestacao.setTitulo(sc.nextLine());

                System.out.println("Digite seu Nome:");
                manifestacao.setAutor(sc.nextLine());

                System.out.println("Digite sua Sugestao:");
                manifestacao.setDescricao(sc.nextLine());

                manifestacao.setTipo(TipoManifestacao.RECLAMACAO);
                manifestacao.setSituacao(SituacaoManifestacao.ABERTA);
                ouvidoria.registrarManifestacao(manifestacao);

            } else if (opcao == 3) {

                manifestacao.setCodigo(ouvidoria.sizeMani());
                System.out.println("Digite o Titulo da manifestacao:");
                manifestacao.setTitulo(sc.nextLine());

                System.out.println("Digite seu Nome:");
                manifestacao.setAutor(sc.nextLine());

                System.out.println("Digite sua Sugestao:");
                manifestacao.setDescricao(sc.nextLine());

                manifestacao.setTipo(TipoManifestacao.SUGESTAO);
                manifestacao.setSituacao(SituacaoManifestacao.ABERTA);
                ouvidoria.registrarManifestacao(manifestacao);

            } else if (opcao == 4) {
                ouvidoria.listarManifestacoes();
            }

        } while (opcao >= 1 && opcao <5);
    }

}