import java.util.LinkedList;

public class GerenciadorDeFuncionario {
    private LinkedList<Employee> vetorFuncionarios;
    private static GerenciadorDeFuncionario instance = null;

            GerenciadorDeFuncionario() {
            vetorFuncionarios = new LinkedList<>();
    }

    public static GerenciadorDeFuncionario getInstance() {
        if (instance == null)
            instance = new GerenciadorDeFuncionario();
        return instance;
    }

    public void add(Employee employee) {
        vetorFuncionarios.add(employee);
    }

    public LinkedList<Employee> listarTodos() {
        return vetorFuncionarios;
    }


    public Employee buscarPorCodigo(int cod) {
        for (Employee fun : vetorFuncionarios) {
            if (cod == fun.getRegister()) {
                return fun;
            }
        }
        return null; // Se não encontrar, retornar null
    }

    public void deleteRecord() {
        if (!vetorFuncionarios.isEmpty()) {
            vetorFuncionarios.removeLast();
        }
    }

    public void toStringSystem() {
        for (Employee funcionario : vetorFuncionarios) {
            System.out.println(funcionario.toString());
        }
    }
}
