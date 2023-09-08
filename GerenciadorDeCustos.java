import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.time.LocalDate;
import java.util.List;


public class GerenciadorDeCustos {
    public ArrayList<Custo> listarTodos;
    private LinkedList<Custo> ListCusto;
    private static GerenciadorDeCustos instance = null;

    GerenciadorDeCustos() {
        ListCusto = new LinkedList<>();

    }

    public static GerenciadorDeCustos getInstance() {
        if (instance == null)
            instance = new GerenciadorDeCustos();
        return instance;
    }

    public void add(Custo custo) {
        ListCusto.add(custo);
    }

    public void deleteRecord() {
        if (!ListCusto.isEmpty()) {
            ListCusto.removeLast();
        }
    }

    public Custo deleteAndPrint() {
        if (!ListCusto.isEmpty()) {
            Custo ultimoCusto = ListCusto.removeLast();
            return ultimoCusto;
        } else {
            return null; // Retorna null se a lista estiver vazia
        }
    }

    public void imprime() {
        for (Custo p: ListCusto) {
            System.out.println(p);
        }
    }

    public LinkedList<Custo> listarTodos() {
        return ListCusto;
    }


    public ArrayList<Custo> buscarData(LocalDateTime data) {
        ArrayList<Custo> aux = new ArrayList<>();
        for (Custo v : ListCusto) {
            if (v.getDatahora().equals(data)) {
                aux.add(v);
            }
        }
        return aux;
    }

    public LocalDate DataInicio(int a, int b, int c){
        LocalDate dataInicio = LocalDate.of(a,b,c);
        return dataInicio;
    }
    public LocalDate DataFim(int a, int b, int c){
        LocalDate dataFim = LocalDate.of(a,b,c);
      return dataFim;
    }

    public static List<LocalDate> pesquisarPorPeriodo(List<LocalDate> datas, LocalDate inicio, LocalDate fim) {
        List<LocalDate> datasNoPeriodo = new ArrayList<>();

        for (LocalDate data : datas) {
            if (data.isEqual(inicio) || (data.isAfter(inicio) && data.isBefore(fim))) {
                datasNoPeriodo.add(data);
            }
        }

        return datasNoPeriodo;
    }

    public LinkedList<LocalDate> GereLisData(LocalDate dataInicio, LocalDate dataFim) {
        LinkedList<LocalDate> datasNoPeriodo = new LinkedList<>();

        for (Custo elemento : ListCusto) {
            LocalDate dataElemento = elemento.getData();

            if (dataElemento.isAfter(dataInicio) && dataElemento.isBefore(dataFim)) {
                datasNoPeriodo.add(dataElemento);
            }
        }

        return datasNoPeriodo;
    }



}





