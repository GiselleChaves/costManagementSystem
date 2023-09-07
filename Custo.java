import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Custo {
    private double custo;
    private Categoria category;
    private LocalDateTime datahora;

    private Interface metodos;
    private String descrição;


    public Custo(String umaDescrição, Interface umA, double umcusto) {
        this.custo = umcusto;
        this.metodos = umA;
        this.descrição = umaDescrição;
    }

    public Custo() {

    }

    public double getCusto() {
        return custo;
    }

    public LocalDateTime getData() {
        return datahora;
    }

    public void setData(LocalDateTime data) {
        datahora = data;
    }

    public String getDescrição() {
        return descrição;
    }

    public Interface getMetodos() {
        return metodos;
    }

    public LocalDateTime getDatahora() {
        return datahora;
    }


    public String toString() {
        String msg = " ";
        msg = "\n Descrição do custo : " + getDescrição() + " \n Setor que está vinculada a compra : " + getMetodos() + " \n Valor R$ Custo : " + getCusto() + " \n Data : " + getData() + "\n";
        return msg;
    }

    public Department retornaCerto(int numero) {
        switch (numero) {
            case 1:
                return Department.compras;
            case 2:
                return Department.vendas;
            case 3:
                return Department.expedicao;
            case 4:
                return Department.engenharia;
            case 5:
                return Department.producao;
            default:
                return null; // Retorna null se nenhum enum correspondente for encontrado


/*
    @Override
    public int compareTo(Custo o) {
        return  getCusto().compareTo(o.getCusto());

    }*/
}}}
