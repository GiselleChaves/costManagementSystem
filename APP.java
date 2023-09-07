import java.time.LocalDateTime;

public class APP {

    public static void main(String[] args) {
        Department depart = Department.vendas; // Note que estou usando letras maiúsculas para a enumeração
        Employee Empregado;
        Employee Empregado1;
        LocalDateTime t1 = (LocalDateTime.of(2022, 12, 30, 15, 0, 0));
        Empregado = new Employee("Lucas", depart);
        Empregado1 = new Employee("Cindi", depart);
        java.lang.System.out.println("i = " + Empregado);

        // System.out.println("Olá Mundo ");
        // Não é necessário criar um objeto System aqui
        // System.out.println("Aqui: " + Empregado.toString()); // Imprimir Empregado1
        // System.out.println("Aqui: " + Empregado1.toString());


       /*  int opcao; // Declare a variável 'opcao'

       
        System . out .println("Click  para entrar no sistema");

        do {
            opcao = in.nextInt();

            System . out .println("Escreva (1) para login : ");
            System . out .println("Escreva (2) caso queira vizualizar o custo total mensal :");
            System . out .println("Escreva (3) para ver o custo total dos ultimos 3 mesês :");
            System . out .println("Escreva (5)");
            System . out .println("Escreva (6)");
            System . out .println("Escreva (0) para sair :");

            switch (opcao) {

                case 1 :
                    System . out .println("Bem Vindo Usuário  : ");
                    break ;

                case 2 :
                    System . out .println("");
                    break ;

                case 3 :
                    System . out .println("");
                    break ;

                case 4 :
                    System . out .println("");
                    break ;

                case 5 :

                    System . out .println("");
                    break ;
                case 6 :

                    System . out .println("");
                    break ;
            }

        } while (opcao != 7);
        */
    }
}
