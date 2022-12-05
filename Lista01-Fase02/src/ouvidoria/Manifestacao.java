package ouvidoria;

import ouvidoria.enums.SituacaoManifestacao;
import ouvidoria.enums.TipoManifestacao;

public class Manifestacao {
    private static int COUNT_MANIFESTACAO = 0;
    private int codigo;
    private String titulo;
    private String descricao;
    private String autor;
    private SituacaoManifestacao situacao;
    private TipoManifestacao tipo;

    public Manifestacao() {;
    }

    public Manifestacao(String titulo, String autor, String descricao, TipoManifestacao tipo) {
        this.codigo = ++COUNT_MANIFESTACAO;
        this.titulo = titulo;
        this.autor = autor;
        this.descricao = descricao;
        this.situacao = SituacaoManifestacao.ABERTA;
        this.tipo = tipo;
    }

    public Manifestacao(int codigo, String titulo, String descricao, String autor, SituacaoManifestacao situacao, TipoManifestacao tipo) {
        this.codigo = ++COUNT_MANIFESTACAO;
        this.titulo = titulo;
        this.descricao = descricao;
        this.autor = autor;
        this.situacao = SituacaoManifestacao.ABERTA;
        this.tipo = tipo;
    }

    public static void setCountManifestacao(int countManifestacao) {
        COUNT_MANIFESTACAO = countManifestacao;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo +1;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setSituacao(SituacaoManifestacao situacao) {
        this.situacao = situacao;
    }

    public void setTipo(TipoManifestacao tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString(){
        return "Manifestacao{" + "codigo=" + codigo +
                ", titulo=" + titulo + "|"
                + ", autor=" + autor + "|"
                + "Descricao=" + descricao +"|" +
                "Tipo Manifestacao=" + tipo+"|"+
                "Situacao=" + situacao + "}";
    }
}
