package proyectointegrador;

import java.util.*;

public class ProyectoIntegrador {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int i = 19;
        int j = 19;
        String[][] matriz = Matriz(i, j);
        String[][] matriz1 = (matrizmejorada(matriz, i, j));
        //imprimir(matrizmejorada(matriz, i, j));
        int menu;
        System.out.println("---Bienvenido al juego 'Alea Evangelii'---- \n");
        char resp = 's';
        do {

            System.out.println("1-Jugar\n2-Reglas del juego\n3-Salir");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.print(" " + 0
                            + "   "
                            + 1
                            + "   "
                            + 2
                            + "   "
                            + 3
                            + "   "
                            + 4
                            + "   "
                            + 5
                            + "   "
                            + 6
                            + "   "
                            + 7
                            + "   "
                            + 8
                            + "   "
                            + 9
                            + "  "
                            + 10
                            + "  "
                            + 11
                            + "  "
                            + 12
                            + "  "
                            + 13
                            + "  "
                            + 14
                            + "  "
                            + 15
                            + "  "
                            + 16
                            + "  "
                            + 17
                            + "  "
                            + 18
                            + "\n\n");
                    imprimirmatrizrecursiva(matriz1, 0, 0);
                    break;

                case 2:
                    System.out.println("a)El juego consta de dos equipos unicamente el equipo\n"
                            + "de los duques y los rebeldes"
                            + "Los duques tienen un rey que esta en\n"
                            + "la casilla del medio"
                            + "Solamente el rey puede estar en las equis que estan en el tablero,\n"
                            + "la casilla del medio donde inicia el rey"
                            + "es llamada castillo, esta misma solo puede ser ocupada 1 vez por el rey\n"
                            + "es decir , si el rey sale del castillo no puede"
                            + "volver a entrar al mismo, pero las demas piezas si pueden pasar por el\n"
                            + "castillo un numero n de veces pero no pueden tomar ese lugar\n"
                            + "b) El juego acaba cuando el rey llegue a las equis que estan las 4\n"
                            + "esquinas del tablero"
                            + "o cuando los rebeldes acorralen al rey de esa forma comen al rey y el juego\n"
                            + "acaba para los duques y su rey\n"
                            + "c)Esta prohibido que al momento de mover las piezas\n"
                            + "la misma pase por encima de otra, las piezas pueden moverse"
                            + "unicamente de forma vericar u horizontal , en en un numero\n"
                            + "n de espacios"
                            + "ninguna pieza puede moverse de forma diagonal\n"
                            + "d)Es importante resaltar que los duques que esten mas cercanos al rey\n"
                            + "no pueden morir\n"
                            + "e)la forma de comer en el juego es si la pieza tiene un rival a la derecha\n"
                            + "y a la izq a la vez o si tiene un rival arriba y abajo"
                            + "para poder comer al rey tiene que estar acorralado de modo que\n"
                            + "tenga rebeldes a la derecha, arriba, abajo e izquierda"
                            + "si el rey se encuentra al borde del tablero, o a un lado del castillo,\n"
                            + "el mismo podre ser comido cuando tenga piezas rivales arriba y a los lados ");
                    break;
                case 3:
                    String cadena = "pene";
                    System.out.println(Integer.toBinaryString(Integer.parseInt(cadena)));

                    break;

            }
        } while (resp != 'n' || resp != 'N');

    }

    static public String[][] Matriz(int fil, int col) {
        String[][] temporal = new String[fil][col];
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                temporal[i][j] = " ";
            }
        }
        return temporal;
    }

    static public String[][] matrizmejorada(String[][] matriz, int fil, int col) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (j < 2 && i < 2 || i < 2 && j > 16 || i > 16 && j < 2 || i > 16 && j > 16) {
                    matriz[i][j] = "#";
                } else if (i == 0 && j == 2 || i == 0 && j == 5 || i == 0 && j == 13 || i == 0 && j == 16) {
                    matriz[i][j] = "®";
                } else if (i == 2 && j == 0 || i == 2 && j == 5 || i == 2 && j == 13 || i == 2 && j == 18) {
                    matriz[i][j] = "®";
                } else if (i == 3 && j == 7 || i == 3 && j == 9 || i == 3 && j == 11) {
                    matriz[i][j] = "®";
                } else if (i == 4 && j == 6 || i == 4 && j == 12) {
                    matriz[i][j] = "®";
                } else if (i == 5 && j == 0 || i == 5 && j == 2 || i == 5 && j == 5 || i == 5 && j == 13 || i == 5 && j == 16 || i == 5 && j == 18) {
                    matriz[i][j] = "®";
                } else if (i == 6 && j == 4 || i == 6 && j == 14) {
                    matriz[i][j] = "®";
                } else if (i == 7 && j == 3 || i == 7 && j == 15) {
                    matriz[i][j] = "®";
                } else if (i == 9 && j == 3 || i == 9 && j == 15) {
                    matriz[i][j] = "®";
                } else if (i == 11 && j == 3 || i == 11 && j == 15) {
                    matriz[i][j] = "®";
                } else if (i == 12 && j == 4 || i == 12 && j == 14) {
                    matriz[i][j] = "®";
                } else if (i == 13 && j == 0 || i == 13 && j == 2 || i == 13 && j == 5 || i == 13 && j == 13 || i == 13 && j == 16 || i == 13 && j == 18) {
                    matriz[i][j] = "®";
                } else if (i == 14 && j == 6 || i == 14 && j == 12) {
                    matriz[i][j] = "®";
                } else if (i == 15 && j == 7 || i == 15 && j == 9 || i == 15 && j == 11) {
                    matriz[i][j] = "®";
                } else if (i == 16 && j == 0 || i == 16 && j == 5 || i == 16 && j == 13 || i == 16 && j == 18) {
                    matriz[i][j] = "®";
                } else if (i == 18 && j == 2 || i == 18 && j == 5 || i == 18 && j == 13 || i == 18 && j == 16) {
                    matriz[i][j] = "®";
                } else if (i == 4 && j == 8 || i == 4 && j == 10) {
                    matriz[i][j] = "■";
                } else if (i == 6 && j == 9) {
                    matriz[i][j] = "■";
                } else if (i == 7 && j == 8 || i == 7 && j == 10) {
                    matriz[i][j] = "■";
                } else if (i == 8 && j == 4 || i == 8 && j == 7 || i == 8 && j == 9 || i == 8 && j == 11 || i == 8 && j == 14) {
                    matriz[i][j] = "■";
                } else if (i == 9 && j == 6 || i == 9 && j == 8 || i == 9 && j == 10 || i == 9 && j == 12) {
                    matriz[i][j] = "■";
                } else if (i == 10 && j == 4 || i == 10 && j == 7 || i == 10 && j == 9 || i == 10 && j == 11 || i == 10 && j == 14) {
                    matriz[i][j] = "■";
                } else if (i == 11 && j == 8 || i == 11 && j == 10) {
                    matriz[i][j] = "■";
                } else if (i == 12 && j == 9) {
                    matriz[i][j] = "■";
                } else if (i == 14 && j == 8 || i == 14 && j == 10) {
                    matriz[i][j] = "■";
                } else if (i == 9 && j == 9) {
                    matriz[i][j] = "@";
                }
            }

        }

        return matriz;
    }

    static void imprimirmatrizrecursiva(String matriz[][], int filas, int cols) {
        int cont = 0;
        if (filas == matriz.length - 1 && cols == matriz.length - 1) {

            System.out.print("[" + matriz[filas][cols] + "] ");
            System.out.println("   18");
            cont++;
        } else {
            if (cols == matriz[0].length - 1) {

                System.out.println("[" + matriz[filas][cols] + "] " + "   " + filas);
                imprimirmatrizrecursiva(matriz, filas + 1, 0);
                cont++;
            } else {
                System.out.print("[" + matriz[filas][cols] + "] ");
                imprimirmatrizrecursiva(matriz, filas, cols + 1);
                cont++;
            }
        }

    }
    /*
     System.out.print(" " + 0 
     + "   " 
     + 1 
     + "   " 
     + 2 
     + "   " 
     + 3 
     + "   " 
     + 4 
     + "   " 
     + 5 
     + "   " 
     + 6
     + "   "
     + 7 
     + "   " 
     + 8 
     + "   " 
     + 9 
     + "  " 
     + 10 
     + "  " 
     + 11 
     + "  " 
     + 12 
     + "  " 
     + 13 
     + "  "
     + 14 
     + "  " 
     + 15 
     + "  " 
     + 16 
     + "  " 
     +17 
     + "  " 
     + 18
     +"\n\n");
     imprimirmatrizrecursiva(matriz1,0,0);
     */
}
