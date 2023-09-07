
public class Employee {

    private static int nextregister = 1000;

    private int register;


    private String nome;

    private Department umDepartamento;

    public Employee(String nome, Department departamento) {
        this.nome = nome;
        this.umDepartamento = departamento;
        this.register = nextregister++;
    }

    public Employee() {
        this.register = nextregister++;
    }

    public int getRegister() {
        return register;
    }

    public int setRegister(int register) {
        return register;
    }

    public String getNome() {
        return nome;
    }

    public String setNome(String umnome) {
        return nome = umnome;
    }


    public String toString() {
        String msg = " ";
        msg = "\n Codigo de registro : " + getRegister() + "\n Nome do Funcionario : " + getNome() + "\n Departamento do Funcionario : " + umDepartamento + "\n";
        return msg;
    }
}
    
