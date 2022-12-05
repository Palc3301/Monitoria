package empregado;

public class Empregado {

    private String nome;
    private String sobreNome;
    private double salario;

    public Empregado() {
    }

    public Empregado(String nome, String sobreNome, double salario) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            salario = 0;
        }
        this.salario = salario;
    }

    public double salarioAnual() {
        double salarioAnualTotal = this.salario * 12;

        return salarioAnualTotal;
    }

    public double aumento() {
        double aumento10 =  (this.salario * 1.1) * 12;
        return aumento10;
    }

    public String valorDoEmpregado() {

        return "O empregado:" + getNome() +" "+  getSobreNome() + " recebe anualmente R$"
                + salarioAnual() + " e recebendo o aumento de 10% irá receber R$";
    }
}

