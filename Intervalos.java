import java.util.List;
import java.util.Collections;

public class Intervalos {
        int maximo;
        int minimo;
        Intervalos(final List<Integer> lista) {
            Collections.sort(lista);
            this.maximo = lista.get(0);
            this.minimo = lista.get(lista.size() - 1);
        }
    }