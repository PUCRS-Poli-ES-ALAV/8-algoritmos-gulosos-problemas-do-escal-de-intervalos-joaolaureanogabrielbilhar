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

        Intervalos(int minimo, int maximo) {
            if (minimo > maximo)
                throw new IllegalArgumentException("Minimo maior que maximo");
            this.maximo = maximo;
            this.minimo = minimo;
        }
        public int compareTo(Intervalos toTest) {
            if (toTest.maximo == this.maximo && toTest.minimo == this.minimo)
                return 0;
            return (this.maximo > toTest.maximo) ? 1 : -1;
        }

        public String toString() {
            return "(" + this.minimo + ":" + this.maximo + ")";
        }
    }
    public static void main(String[] args) {
        // TEST 1
        ArrayList<Intervalos> intervalos = new ArrayList<Intervalos>();
        Intervalos[] arrayIntervalos = new Intervalos[]{new Intervalos(4, 8), new Intervalos(6, 7), new Intervalos(13, 14),
            new Intervalos(4, 5), new Intervalos(2, 4), new Intervalos(6, 9), new Intervalos(7, 10),
            new Intervalos(9, 11), new Intervalos(1, 6), new Intervalos(3, 13), new Intervalos(9, 12) };
                for (Intervalos intervalo : arrayIntervalos) {
                    intervalos.add(intervalo);
                }
        System.out.println(AlgoritmoGuloso.sdm(new ArrayList(intervalos)));    


        // TEST 2
        intervalos = new ArrayList<Intervalos>();
        arrayIntervalos = new Intervalos[]{
            new Intervalos(0,4),new Intervalos(1,2),new Intervalos(2,4),new Intervalos(3,5),new Intervalos(3,6),
            new Intervalos(5,6),new Intervalos(5,7),new Intervalos(6,7),new Intervalos(7,9),new Intervalos(8,10)
        };
                for (Intervalos intervalo : arrayIntervalos) {
                    intervalos.add(intervalo);
                }
        System.out.println(AlgoritmoGuloso.sdm(new ArrayList(intervalos)));    
        }
    public static Set sdm(List<Intervalos> listaIntervalos) {
        if(listaIntervalos == null || listaIntervalos.size() == 0)
            return null;
        if(listaIntervalos.size() == 1)
        return new HashSet<Intervalos>(listaIntervalos);

        Collections.sort(listaIntervalos);
        Set result = new HashSet<Intervalos>();
        int index = 0;
        int lastMax = Integer.MIN_VALUE;
        while(index < listaIntervalos.size()){
            if(listaIntervalos.get(index).minimo >= lastMax){
                result.add(listaIntervalos.get(index));
                lastMax = listaIntervalos.get(index).maximo;
            }
        index++;
        }
        return result;
    }

}