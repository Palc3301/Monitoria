package datas;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class DataClass {
    private int dia;
    private int mes;
    private int ano;

    Calendar calendar = Calendar.getInstance();

    public DataClass() {
        this.dia = calendar.get(Calendar.DAY_OF_MONTH);
        this.mes = calendar.get(Calendar.MONTH) + 1;
        this.ano = calendar.get(Calendar.YEAR);
    }
    public DataClass(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int amanha() {
        return dia + 1;
    }

    @Override
    public String toString() {
        return "Calendario " + this.dia + "/" + this.mes + "/" + this.ano;
    }
}
