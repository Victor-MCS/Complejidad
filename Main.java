public class Main {

    public static void main(String[] args) {
        Complejidad c = new Complejidad();

        int ejecuciones = 20;

        int resultados[][] = new int[ejecuciones][20];

        for (int renglon = 0; renglon < ejecuciones; renglon++) {

            int n = (renglon + 1) * 1;

            resultados[renglon][0] = n;

            resultados[renglon][1] = c.lineal(n);

        }
        imprimir(resultados);

        //Se reinicia la matriz por error en rellenado

        System.out.println("\t");

        for (int renglon = 0; renglon < ejecuciones; renglon++) {

            resultados[renglon][0] = 0;

            resultados[renglon][1] = 0;


        }

        for (int renglon = 0; renglon < 6; renglon++) {
            int n = (renglon + 1) * 1;

            resultados[renglon][0] = n;

            resultados[renglon][1] = c.cuadratica(n);

        }
        imprimir(resultados);

        for (int renglon = 0; renglon < ejecuciones; renglon++) {
            resultados[renglon][0] = 0;
            resultados[renglon][1] = 0;
        }


        for (int renglon = 0; renglon < ejecuciones; renglon++) {
            int n = (renglon + 1) * 100;
            resultados[renglon][0] = n;
            resultados[renglon][1] = c.log(n);

        }
        imprimir(resultados);
    }


    private static void imprimir(int[][] resultado) {

        int impresion[][] = new int[50][50];

        for (int renglon = 0; renglon < resultado.length; renglon++) {
            int aux = 0;
            for (int veces = 0; veces < resultado[renglon][1]; veces++) {
                impresion[renglon][aux] = 1;
                aux++;
            }
        }

        for (int fila = 49; fila >= 0; fila--) {
            for (int columna = 0;columna  < 50; columna++) {
                System.out.print(" ");

                if (impresion[columna][fila] == 0) {
                    System.out.print(" ");
                }
                if (impresion[columna][fila] == 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
            }
        }

}
