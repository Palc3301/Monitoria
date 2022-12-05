package ouvidoria;

import java.util.ArrayList;

public class Ouvidoria {

    private ArrayList<Manifestacao> manifestacoes = new ArrayList<Manifestacao>();

    public void registrarManifestacao(Manifestacao novoManifestacao) {
        manifestacoes.add(novoManifestacao);
    }

    public void listarManifestacoes() {
        for(Manifestacao item : manifestacoes) {
            System.out.println(item);
        }
    }
    public int sizeMani(){
        return manifestacoes.size();
    }
}
