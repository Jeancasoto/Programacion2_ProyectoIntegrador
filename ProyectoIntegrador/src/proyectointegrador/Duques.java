package proyectointegrador;

public class Duques extends Pieza implements Complemento {

    @Override
    public boolean movimiento(String[][] matriz, int x, int y, int nx, int ny) {
        boolean b = true;
        int cont = 0;
        int dif;

        if (x == nx) {
            // dif=y-ny;
            if (y < ny) {
                for (int i = y + 1; i < ny; i++) {
                    if (matriz[x][i].equals("R") || matriz[x][i].equals("D") || matriz[x][i].equals("@")) {
                        cont++;
                    }
                }
            } else if (ny < y) {
                for (int i = ny + 1; i < y; i++) {
                    if (matriz[x][i].equals("R") || matriz[x][i].equals("D") || matriz[x][i].equals("@")) {
                        cont++;
                    }
                }
            }

        } else if (y == ny) {
            //dif=x-nx;
            if (x < nx) {
                for (int i = x + 1; i < nx; i++) {
                    if (matriz[i][y].equals("R") || matriz[x][i].equals("D") || matriz[x][i].equals("@")) {
                        cont++;
                    }
                }
            } else if (nx < x) {
                for (int i = nx + 1; i < x; i++) {
                    if (matriz[i][y].equals("R") || matriz[x][i].equals("D") || matriz[x][i].equals("@")) {
                        cont++;
                    }
                }
            }

        }
        if (cont != 0) {
            b = true;
        } else {

            b = false;
        }

        return b;

    }

    @Override
    public boolean ganaelrey(String[][] matriz) {
        boolean b = false;
        int cont=0;
        if (matriz[0][0].equals("@")
                || matriz[0][1].equals("@")
                || matriz[1][0].equals("@")
                || matriz[1][1].equals("@")
                || matriz[0][17].equals("@")
                || matriz[0][18].equals("@")
                || matriz[1][17].equals("@")
                || matriz[1][18].equals("@")
                || matriz[17][17].equals("@")
                || matriz[17][18].equals("@")
                || matriz[18][17].equals("@")
                || matriz[18][18].equals("@")
                || matriz[17][0].equals("@")
                || matriz[17][1].equals("@")
                || matriz[18][0].equals("@")
                || matriz[18][1].equals("@")) {

            cont++;

        }
        if (cont!=0) {
            b=true;
        }
        return b;
    }

    @Override
    public boolean pierdeelrey(String[][] matriz) {
        boolean b = false;
        int cont=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j].equals("@")) {
                    cont++;
                }
            }
        }
        if (cont!=0) {
            b=true;
        }
        return b;
    }

    @Override
    public boolean comer(String[][] matriz, int nx, int ny) {
        boolean b = false;
        int cont = 0;
       // if (nx > 0 && ny > 0 && nx < matriz.length - 1 && ny < matriz.length - 1) {

        if (matriz[nx + 1][ny].equals("R") && matriz[nx - 1][ny].equals("R")) {
            cont++;
        }

        if (matriz[nx][ny - 1].equals("R") && matriz[nx][ny + 1].equals("R")) {
            cont++;
        }

        if (cont != 0) {
            b = true;
        }

       // }
        return b;
    }

    public boolean comerrey(String[][] matriz, int nx, int ny) {
        boolean b = false;
        int cont = 0;
       // if (nx > 0 && ny > 0 && nx < matriz.length - 1 && ny < matriz.length - 1) {

        if (matriz[nx + 1][ny].equals("R") && matriz[nx - 1][ny].equals("R") && matriz[nx][ny - 1].equals("R") && matriz[nx][ny + 1].equals("R")) {
            cont++;
        }

        if (cont != 0) {
            b = true;
        }

       // }
        return b;
    }

    @Override
    public boolean pierdenrebeldes(String[][] matriz) {
        boolean b=false;
        int cont=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j].equals
                    ("R")) {
                    cont++;
                }
            }
        }
        if (cont!=0) {
            b=true;
        }
        return b;
    }

}
