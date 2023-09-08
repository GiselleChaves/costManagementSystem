import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.time.LocalDate;


public class GerenciadorDeCustos {
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
}