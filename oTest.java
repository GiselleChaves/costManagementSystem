import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedList;

public class oTest {
    public static void main(String[] args) {
        Department depart = Department.vendas; // Note que estou usando letras maiúsculas para a enumeração
        Categoria categ = Categoria.ServicosDeTerceiros; //
        Categoria categ1 = Categoria.ManutencaoDeBens; //
        Custo c1;
        Custo c2;

        GerenciadorDeCustos gerCusto = GerenciadorDeCustos.getInstance();
        LocalDateTime t1 = (LocalDateTime.of(2022, 12, 30, 15, 0, 0));
        LocalDateTime t2 = (LocalDateTime.of(2023, 9, 9, 12, 0, 0));

        c1 = new Custo("Cama", categ, 200);
        c1.setData(t1);

        c2 = new Custo("cadeira", categ1, 300);
        c2.setData(t2);


        Employee Empregado = new Employee();
        Employee Empregado1 = new Employee();
        Employee Empregado2 = new Employee();

        GerenciadorDeFuncionario empregado = GerenciadorDeFuncionario.getInstance();
        Empregado = new Employee("Lucas", depart);
        Empregado1 = new Employee("Arthur", depart);
        Empregado2 = new Employee("Cindi", depart);


        GerenciadorDeCustos g1 = new GerenciadorDeCustos();
        GerenciadorDeFuncionario gereF = new GerenciadorDeFuncionario();


        gereF.add(Empregado);
        gereF.add(Empregado1);
        gereF.add(Empregado2);
        g1.add(c1);
        g1.add(c2);

        java.lang.System.out.println(">>>>>-------------------------------------------\n" +
                gereF.listarTodos());


        java.lang.System.out.println("\n---------------------------------------------");


        //   java.lang.System.out.println("TESTANDO CUSTOS ::::: " + c1.toString());
        //java.lang.System.out.println("\n---------------------------------------------");
        java.lang.System.out.println("Todos : " + g1.listarTodos());
        //java.lang.System.out.println("\n---------------------------------------------");


        java.lang.System.out.println("\n---------------------------------------------");
        // java.lang.System.out.println("i = " + Empregado);
        //java.lang.System.out.println("i = " + Empregado1);
        //  java.lang.System.out.println("aqui tem o custo : " );

        //java.lang.System.out.println(">>>");
    }
}


