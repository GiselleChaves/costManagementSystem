import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Custo {
    private double custo;
    private Categoria category;
    private LocalDateTime datahora;

    private String descrição;


    public Custo(String umaDescrição, Categoria category, double umcusto) {
        this.custo = umcusto;
        this.category = category;
        this.descrição = umaDescrição;
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

    public Categoria getOcusto() {
        return category;
    }

    public LocalDateTime getDatahora() {
        return datahora;
    }


    public String toString() {
        String msg = " ";
        msg = "\n Descrição do custo : " + getDescrição() + " \n Setor que está vinculada a compra : " + getOcusto() + " \n Valor R$ Custo : " + getCusto() + " \n Data : " + getData() + "\n";
        return msg;
    }




/*
    @Override
    public int compareTo(Custo o) {
        return  getCusto().compareTo(o.getCusto());

    }*/
}
