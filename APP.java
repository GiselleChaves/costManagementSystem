import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class APP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Custo newCusto = new Custo();
        GerenciadorDeCustos gerCusto = GerenciadorDeCustos.getInstance();
        GerenciadorDeFuncionario gerFuncionario = GerenciadorDeFuncionario.getInstance();

        Department depart = Department.vendas;
        LocalDateTime t1 = LocalDateTime.of(2022, 12, 30, 15, 0, 0);

        Employee Empregado;
        Employee Empregado1;
        Empregado = new Employee("Lucas", depart);
        gerFuncionario.add(Empregado);
        gerFuncionario.add(Empregado);
        gerFuncionario.add(Empregado);

        Empregado1 = new Employee("Cindi", depart);

        int opcao;

        do {
            System.out.println("Escreva (1) para login : ");
            System.out.println("Escreva (2) para criar uma nova conta");
            System.out.println("Escreva (3) adicionar novo Custo no sistema:");
            System.out.println("Escreva (4) caso queira vizualizar o custo total mensal :");
            System.out.println("Escreva (5)Listar ");
            System.out.println("Escreva (6) retorna excluir ultimo item e retornar :");
            opcao = in.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Escolha qual conta voce deseja acessar : ");
                    gerFuncionario.imprime();
                    System.out.println("Dos codigos a cima qual conta desejas acessar : ");
                    int usuario = in.nextInt();
                    gerFuncionario.chooseEmployee(usuario);
                    break;

                case 2:
                    System.out.println("Favor digite o nome do usuario");
                    in.nextLine(); // Consumir a quebra de linha pendente
                    String nome = in.nextLine();
                    System.out.println("compras (1)\n" + "vendas(2),\n" + "expedicao(3),\n" + "engenharia(4),\n" + "producao (5)");
                    int AuxEmplo = in.nextInt();
                    newCusto.retornaCerto(AuxEmplo);
                    Empregado = new Employee(nome, newCusto.retornaCerto(AuxEmplo));
                    gerFuncionario.add(Empregado);
                    Empregado.toString();
                    gerFuncionario.imprime();
                    gerFuncionario.listarTodos();
                    break;

                case 3:
                    System.out.println("Seja bem-vindo! Vamos criar uma conta para você. Por favor, escolha o seu departamento:");
                    System.out.println("compras (1)\n" + "vendas(2),\n" + "expedicao(3),\n" + "engenharia(4),\n" + "producao (5)");
                    int auxSetor = in.nextInt();
                    newCusto.retornaCerto(auxSetor);
                    System.out.println("AquisicaoDeBens (1)\n" + "ManutencaoDeBens(2),\n" + "ServicosDeTerceiros(3),\n");
                    int CatAux = in.nextInt();
                    in.nextLine(); // Consumir a quebra de linha pendente
                    System.out.println("Informe a descrição do item : ");
                    String Description = in.nextLine();
                    System.out.println("Informe o custo do item : ");
                    double uniCusto = in.nextDouble();

                    LocalDateTime agora = LocalDateTime.now();
                    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                    String dataHoraFormatada = agora.format(formato);
                    System.out.println("Data e Hora Atual: " + dataHoraFormatada);

                    Department deAux = newCusto.retornaCerto(auxSetor);
                    Categoria cat = newCusto.retornaTipoCerto(CatAux);

                    newCusto = new Custo(Description, deAux, uniCusto, cat);
                    newCusto.setData(agora);

                    gerCusto.add(newCusto);
                    gerCusto.add(newCusto);
                    gerCusto.add(newCusto);
                    gerCusto.listarTodos();
                    gerCusto.imprime();

                    System.out.println("Item Adicionado: " + newCusto.toString());
                    break;

                case 4:
                    System.out.println("");
                    break;

                case 5:
                    System.out.println("");
                    break;

                case 6:
                    System.out.println("Removemos o último custo:");
                    gerCusto.deleteAndPrint();
                    gerFuncionario.imprime();
                    break;

                default:
                    throw new IllegalStateException("Opção inesperada: " + opcao);
            }

        } while (true);
    }
}
