package PruebaTecnicaVW;

import java.util.List;

public class PruebaRobots {
    public static void main(String[] args) {

        List<Character> r1Start = List.of('1', '2', 'N');
        List<Character> r1Instruction = List.of('L', 'M', 'L', 'M', 'L', 'M', 'L', 'M', 'M');
        List<Character> r2Start = List.of('3', '3', 'E');
        List<Character> r2Instruction = List.of('M', 'M', 'R', 'M', 'M', 'R', 'M', 'R', 'R', 'M');

        coordenadas();

        char[][] workspace = llenarMatriz();

        char[][] workspaceStart = ubicarRobot(workspace, r1Start);

        imprimirMatriz(workspaceStart);
    }


    public static char[][] ubicarRobot(char[][] workspace, List<Character> r1Start) {

        int iValue = r1Start.get(0) - '0';
        int jValue = r1Start.get(1) - '0';

        System.out.println("iValue = " + iValue);
        System.out.println("jValue = " + jValue);

        for (int i = 0; i < workspace.length; i++) {
            for (int j = 0; j < workspace.length; j++) {
                if ((workspace.length - 1 - i) == iValue && j == jValue) {

                    switch (r1Start.get(2)) {
                        case 'N' -> workspace[(i)][j] = '↑';
                        case 'O' -> workspace[(i)][j] = '←';
                        case 'E' -> workspace[(i)][j] = '→';
                        case 'S' -> workspace[(i)][j] = '↓';
                    }
                    break;
                }
            }
        }
        return workspace;
    }

    public static char[][] llenarMatriz() {

        char[][] workspace = new char[5][5];

        for (int i = 0; i < workspace.length; i++) {
            for (int j = 0; j < workspace.length; j++) {
                workspace[i][j] = 'x';
            }
        }
        return workspace;
    }

    public static void imprimirMatriz(char[][] workspace) {

        for (char[] chars : workspace) {
            for (int j = 0; j < workspace.length; j++) {
                if (j == 0) {
                    System.out.print(" | " + chars[j] + " | ");
                } else {
                    System.out.print(chars[j] + " | ");
                }
            }
            System.out.println();
        }
    }

    private static void coordenadas() {

        String[][] workspace = new String[5][5];

        System.out.println(" = = = = COORDENADAS = = = ");

        for (int i = 0; i < workspace.length; i++) {
            for (int j = 0; j < workspace.length; j++) {
                workspace[i][j] = (workspace.length - 1 - i) + "" + (j);
                if (j == 0) {
                    System.out.print(" | " + workspace[i][j] + " | ");
                } else {
                    System.out.print(workspace[i][j] + " | ");
                }
            }
            System.out.println();
        }

        System.out.println(" = = = = = = = = = = = = = ");
    }
}


//        N = Flecha arriba : '\u2191');
//        E = Flecha derecha : '\u2192');
//        S = Flecha izquierda : '\u2190');
//        O = Flecha abajo : '\u2193');