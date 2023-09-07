public class Interface {

    private GerenciadorDeFuncionario gereF;

    private GerenciadorDeCustos gereCust;
    private Custo[] criarCusto;
    private Department dp;


    public Interface(Department dp)
    {        this.dp = dp;    }

    public Interface() {
    }

    public Department getDepartment()
    {        return dp;    }

  /*  public Department retornaCerto(int numero) {
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
        }
    }*/

}


