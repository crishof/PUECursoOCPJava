import java.util.ArrayList;
import java.util.List;

public class arrayPares {
    public static void main(String[] args) {

        List<Integer> pares = new ArrayList<>();

        for (int i = 1; i < 30; i++) {

            if (i % 2 == 0) {
                pares.add(i);
            }

        }

        for (Integer par : pares){
            System.out.println("par : " + par);
        }
    }
}
