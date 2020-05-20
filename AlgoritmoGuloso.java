import java.util.List;
import java.util.Random;
import java.util.Collections;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.lang.Comparable;
public class AlgoritmoGuloso {
    public static class Intervalos implements Comparable<Intervalos> {
        public int maximo;
        public int minimo;
        public List<Integer> lista;

        Intervalos(int minimo, int maximo) {
            if (minimo > maximo)
                throw new IllegalArgumentException("Minimo maior que maximo");
            this.maximo = maximo;
            this.minimo = minimo;
            this.lista = new ArrayList<Integer>();
            for (int i = minimo; i <= maximo; i++)
                this.lista.add(i);
        }
        public int compareTo(Intervalos toTest) {
            if (toTest.maximo == this.maximo && toTest.minimo == this.minimo)
                return 0;
            return (this.minimo > toTest.minimo) ? 1 : -1;
        }

        public String toString() {
            return "(" + this.minimo + ":" + this.maximo + ")";
        }
    }

    public static Set sdm(int start, int last, int quantity) {
        Set result = new HashSet<Intervalos>();
        int i = start;
        while(i);
        return null;
    }

    public static void main(String[] args) {
        Intervalos[] intervalos = new Intervalos[] { new Intervalos(4, 8), new Intervalos(6, 7), new Intervalos(13, 14),
                new Intervalos(4, 5), new Intervalos(2, 4), new Intervalos(6, 9), new Intervalos(7, 10),
                new Intervalos(9, 11), new Intervalos(1, 6), new Intervalos(3, 13), new Intervalos(9, 12) };
                Arrays.sort(intervalos);
                for (Intervalos intervalos2 : intervalos) {
                    System.out.println(intervalos2);
                }
    }

}