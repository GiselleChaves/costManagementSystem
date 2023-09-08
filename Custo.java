import jdk.jfr.Category;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Custo {
    private double custo;
    private Categoria category;
    private LocalDateTime datahora;

    private Department d1;
    private String descrição;


    public Custo(String umaDescrição,  Department d1,  double umcusto, Categoria c1) {
        this.custo = umcusto;
        this.d1=d1;
        this.descrição = umaDescrição;
        this.category=c1;
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

    public Department getMetodos() {
        return d1;
    }

    public LocalDateTime getDatahora() {
        return datahora;
    }

    public Categoria getCategoria() {return category;}


    public String toString() {
        String msg = " ";
        msg = "\n Descrição do custo : " + getDescrição()  + " \n Valor R$ Custo : " + getCusto() + " \n Setor que está vinculada a compra : " + getMetodos() + "\n Categoria de Custo :"+getCategoria()+" \n Data : " + getData() + "\n";
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


}}

    public Categoria retornaTipoCerto(int numero) {
        switch (numero) {
            case 1:
                return category.AquisicaoDeBens;
            case 2:
                return category.ManutencaoDeBens;
            case 3:
                return category.ServicosDeTerceiros;

            default:
                return null; // Retorna null se nenhum enum correspondente for encontrado

        }}
}
