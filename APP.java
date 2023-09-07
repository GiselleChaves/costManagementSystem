import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import static java.lang.System.in;

public class APP {

    public static void main(String[] args) {

        Scanner in=   new Scanner (System.in);
        Custo newCusto = new Custo();
        GerenciadorDeCustos gerCusto = GerenciadorDeCustos.getInstance();
        GerenciadorDeFuncionario gerFuncionario = new GerenciadorDeFuncionario();
        Department depart = Department.vendas; // Note que estou usando letras maiúsculas para a enumeração
        LocalDateTime t1 = (LocalDateTime.of(2022, 12, 30, 15, 0, 0));


        Employee Empregado;
        Employee Empregado1;
Empregado = new Employee("Lucas", depart);
gerFuncionario.add(Empregado);
        gerFuncionario.add(Empregado);
        gerFuncionario.add(Empregado);
        gerFuncionario.add(Empregado);

        Empregado1 = new Employee("Cindi", depart);
        java.lang.System.out.println("i = " + Empregado);


        ///////////////////////////////////////////////////////////

        LocalDateTime agora = LocalDateTime.now();

        // Define um formato para a data e hora (opcional)
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        // Formata a data e hora como uma string
        String dataHoraFormatada = agora.format(formato);

        // Exibe a data e hora atual formatada
        System.out.println("Data e Hora Atual: " + dataHoraFormatada);

        gerCusto.listarTodos();


        // System.out.println("Olá Mundo ");
        // Não é necessário criar um objeto System aqui
        // System.out.println("Aqui: " + Empregado.toString()); // Imprimir Empregado1
        // System.out.println("Aqui: " + Empregado1.toString());


       int opcao; // Declare a variável 'opcao'


        System . out .println("Click  para entrar no sistema");

        do {


            System . out .println("Escreva (1) para login : ");
            System . out .println("Escreva (2) para criar uma nova conta" );
            System . out .println("Escreva (3) adicionar novo Custo no sistema:");
            System . out .println("Escreva (4) caso queira vizualizar o custo total mensal :");
            System . out .println("Escreva (5)Listar " );
            System . out .println("Escreva (6) retorna excluir ultimo item e retornar :");
            opcao = in.nextInt();
            switch (opcao) {

                case 1 :
                    System . out .println("Escolha qual conta voce deseja acessar : ");

                    System . out .println("Bem Vindo Usuário  : ");
                    System . out .println("Bem Vindo Usuário  : ");
                    break ;

                case 2 :
                    System . out .println("");
                    gerCusto.imprime();
                    break ;

                case 3 :
                    System . out .println("Seja vem vindo vamos criar uma conta para você por favor escolha o seu departamento :");
                    System.out.println("compras (1)\n" +  "vendas(2),\n" +  "expedicao(3),\n" + "engenharia(4),\n" + "producao (5)");
                    int auxSetor=in.nextInt();

                    Interface retornaC ;
                    retornaC = new Interface();
                    newCusto.retornaCerto(auxSetor);


                    System . out .println("informe a descrição do item : ");
                    System . out .print(" ");
                    String Description0 = in.nextLine();
                    String Description = in.nextLine();
                    System . out .println("informe o custo do item    : ");
                    double uniCusto = in.nextDouble();
                    LocalDateTime t3 = (LocalDateTime.of(2022, 12, 30, 15, 0, 0));
                    // Adiciona data
                    newCusto = new Custo(Description, retornaC, uniCusto);
                    newCusto.setData(t3);
                    // adiciona no vetor e printa
                    gerCusto.add(newCusto);
                    gerCusto.listarTodos();
                    gerCusto.imprime();

                    System . out .println("Item Adicionadooooo;" + newCusto.toString());
                    System . out .println("Item Adicionado;");
                    break ;

                case 4 :
                    System . out .println("");
                    break ;

                case 5 :

                    System . out .println("");
                    break ;
                case 6 :

                    System . out .println("removemos o ultimo custo" );
                    gerCusto.deleteAndPrint();
                    gerCusto.imprime();
                    gerFuncionario.imprime();



                    break ;
                default:
                    throw new IllegalStateException("Unexpected value: " + opcao);
            }

        } while (true);

    }
}
