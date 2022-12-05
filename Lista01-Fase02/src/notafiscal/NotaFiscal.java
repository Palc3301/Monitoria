package notafiscal;

public class NotaFiscal {

    private int idItemFaturado;
    private String descricao;
    private int qtdCompradaItem;
    private double preco;

    public NotaFiscal() {
    }

    public NotaFiscal(int idItemFaturado, String descricao, int qtdCompradaItem, double preco) {
        this.idItemFaturado = idItemFaturado;
        this.descricao = descricao;
        this.qtdCompradaItem = qtdCompradaItem;
        this.preco = preco;
    }

    public int getIdItemFaturado() {
        return idItemFaturado;
    }

    public void setIdItemFaturado(int idItemFaturado) {
        this.idItemFaturado = idItemFaturado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdCompradaItem() {
        return qtdCompradaItem;
    }

    public void setQtdCompradaItem(int qtdCompradaItem) {
        if (qtdCompradaItem <0) {
            qtdCompradaItem = 0;
        }
        this.qtdCompradaItem = qtdCompradaItem;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0){
            preco = 0;
        }
        this.preco = preco;
    }

    public double valorNotaFiscal() {

        double valorTotal = getQtdCompradaItem() * getPreco();

        return valorTotal;
    }
}
