package password;

import java.util.Random;

public class Password {

    private final String pass;
    private final int longitud;

    public Password(int longitud) {
        this.longitud = longitud;
        this.pass = generarPassword(longitud);
    }

    public String getPass() {
        return pass;
    }

    public String generarPassword(int longitud) {

        String pass = "";

        for (int i = 0; i < longitud; i++) {

            char may = (char) new Random().nextInt(65, 90 + 1);
            char min = (char) new Random().nextInt(97, 122 + 1);
            char num = (char) new Random().nextInt(48, 57 + 1);

            int opcion = new Random().nextInt(1, 3 + 1);

            switch (opcion) {
                case 1 -> pass += may;
                case 2 -> pass += min;
                case 3 -> pass += num;
            }
        }
        return pass;
    }

    public boolean esFuerte(String password) {

        int may = 0;
        int min = 0;
        int num = 0;
        for (int i = 0; i < password.length(); i++) {

            if (password.charAt(i) >= 65 && password.charAt(i) <= 90) {
                may++;
            }
            if (password.charAt(i) >= 97 && password.charAt(i) <= 122) {
                min++;
            }
            if (password.charAt(i) >= 48 && password.charAt(i) <= 57) {
                num++;
            }
        }
        System.out.println("num = " + num);
        System.out.println("min = " + min);
        System.out.println("may = " + may);
        return may > 2 && min > 1 && num > 5;
    }
}
