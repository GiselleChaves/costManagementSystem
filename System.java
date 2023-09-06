import java.io.PrintStream;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class GerenciadorDeFuncionario {
    public Employee funcionario;



    private LinkedList<Employee> vetorFuncionarios;
    private static GerenciadorDeFuncionario instance = null;

    private GerenciadorDeFuncionario() { vetorFuncionarios = new LinkedList<>(); }

    public static GerenciadorDeFuncionario getInstance() {
        if (instance == null)
            instance = new GerenciadorDeFuncionario();
        return instance;
    }

    public void adicionar(String cod, String desc) {
        this.vetorFuncionarios.add(funcionario); }

public Employee buscarPorCodigo(String cod) {
    ArrayList<Employee> employees = new ArrayList<>();
    for (Employee fun : vetorFuncionarios) {
        if (cod.equals(fun.getRegister())) {            employees.add(fun);        }
    }
    if (!employees.isEmpty()) {
        return employees.get(0);
    } else {
        return null;
    }
}

    public ArrayList<Employee> listarTodos() {
        return vetorFuncionarios;
    }

}
/*
    public GerenciadorDeEmpregados(Employee funcionario) {
        this.funcionario = funcionario;

        ListEmployee = new LinkedList<Employee>();

    count = 0 ;
    }
    public System() {

        ListEmployee = new LinkedList<Employee>();

        count = 0 ;
    }

    public boolean addEmp(Employee funcionario) {
        return ListEmployee.add(funcionario);
        //funcionario.CodigoDeRegistrar(1);

    }
    public void DeleteRecord() {
        ListEmployee.remove(ListEmployee.size() - 1);
    }
    public void toStringSystem(){
        for(Employee funcionario : ListEmployee){
         String msg = "\n" + funcionario.getNome();

        }
    }

    }
   


