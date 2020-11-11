/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author Domingo Martinez
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int respuesta;
         Scanner entrada = new Scanner(System.in);
         
        
        System.out.println("Bienvenido ");
        System.out.println(" 1) Ejercicio de suma");
        System.out.println(" 2) Ejercicio de identidad");
        System.out.println(" 3) Ejercicio de rellenar");
        System.out.println(" 4) Ejercicio de triangular");
        respuesta= entrada.nextInt();
        
        switch (respuesta) {
            case 1:
                suma1();
                break;
            case 2:
                identidad3();
                break;
            case 3:
                rellenar2();
                break;
            case 4:
                triangular4();
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
    }

    public static void suma1() {

        Scanner entrada = new Scanner(System.in);
        int colum, colum1, fil1, colum2, fil2, colum3, fil3, fila, fil, columna;

        int matriz[][];
        int matriz1[][];
        int matrizR[][];
        int matrizM[][];
        int matrizResultante[][];

        System.out.println("Ingrese el numero de columnas");
        colum1 = entrada.nextInt();
        System.out.println("Ingrese el numero de filas");
        fil1 = entrada.nextInt();

        System.out.println("Ingrese el numero de columnas");
        colum2 = entrada.nextInt();
        System.out.println("Ingrese el numero de filas");
        fil2 = entrada.nextInt();

        matriz = new int[colum1][fil1];
        matriz1 = new int[colum2][fil2];
        matrizR = new int[matriz.length][matriz.length];
        if ((colum1 == colum2) && (fil1 == fil2)) {

            System.out.println("rellenar matriz: ");
            for (int i = 0; i < colum1; i++) {
                for (int j = 0; j < fil1; j++) {
                    matriz[i][j] = entrada.nextInt();
                }
            }
            System.out.println("rellenar segunda matriz: ");
            for (int i = 0; i < colum2; i++) {
                for (int j = 0; j < fil2; j++) {
                    matriz1[i][j] = entrada.nextInt();

                }

            }

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    matrizR[i][j] = matriz[i][j] + matriz1[i][j];
                }
            }

            System.out.println("Declara la matriz para multiplicar: ");
            System.out.println("Ingrese el numero de columnas");
            colum3 = entrada.nextInt();
            System.out.println("Ingrese el numero de filas");
            fil3 = entrada.nextInt();

            matrizM = new int[fil3][colum3];
            fil = matrizR[0].length;
            colum = matrizR[0].length;
            fila = matrizM[0].length;
            columna = matrizM[0].length;

            matrizResultante = new int[fil][colum3];
            if (colum3 != fil) {

                System.out.println("Recuerde que el numero de columnas debe ser igual al numero de filas que tendra la otra matriz");
            } else {
                System.out.println("rellenar matriz: ");
                for (int i = 0; i < colum3; i++) {
                    for (int j = 0; j < fil; j++) {
                        matrizM[i][j] = entrada.nextInt();
                    }
                }
                for (int i = 0; i < fil; i++) {
                    for (int j = 0; j < colum; j++) {
                        for (int k = 0; k < columna; k++) {

                            matrizResultante[i][j] = matrizR[i][k] * matrizM[k][j];
                        }

                    }
                }
            }

            System.out.println("Resultado de la suma de matrices");
            for (int i = 0; i < colum1; i++) {
                for (int j = 0; j < fil1; j++) {
                    System.out.print(matrizR[i][j] + "\t");
                }
                System.out.println();

            }
            System.out.println("Resultado de la multiplicacion ");
            for (int i = 0; i < colum3; i++) {
                for (int j = 0; j < fil; j++) {
                    System.out.println(matrizResultante[i][j] + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("No se puede efectuar la suma dado que las dimensiones de las matrices no son iguales");
        }
    }

    public static void identidad3() {

        Scanner entrada = new Scanner(System.in);
        //Declaramos las variables
        int filas, col, identidad = 1;
        int Matriz[][];

        System.out.println("Ingrese el numero de filas: ");
        filas = entrada.nextInt();
        System.out.println("Ingrese el numero de columnas: ");
        col = entrada.nextInt();

        Matriz = new int[filas][col];

        System.out.println("Rellene la matriz");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < col; j++) {

                Matriz[i][j] = entrada.nextInt();
            }
        }
        if (filas == col && filas == 1 && col == 1) {
            System.out.println("Es una matriz identidad");
        } else {
            System.out.println("No es una matriz identidad");
            for (int x = 0; x < filas; x++) {
                for (int z = 0; z < col; z++) {
                    if (filas == col) {
                        Matriz[filas][col] = identidad;
                    } else {
                        Matriz[filas][col] = 0;
                    }
                }
            }
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(Matriz[filas][col] + "\t");
            }
            System.out.println();
        }
    }

    public static void rellenar2() {

        Scanner entrada = new Scanner(System.in);

        int filas, col, aux;
        int Matriz[][] ;

        
        
        System.out.println("Ingrese el numero de filas: ");
        filas = entrada.nextInt();
        System.out.println("Ingrese el numero de columnas: ");
        col = entrada.nextInt();

        Matriz = new int [filas][col];
        
        System.out.println("Rellene la matriz");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < col; j++) {
                 
                i = (23 * i) * (23 * i) * (23 * i) * (23 * i) +  (20 * j) * (20 * j) * (20 * j) -3 ;
                j = (23 * i) * (23 * i) * (23 * i) * (23 * i) +  (20 * j) * (20 * j) * (20 * j) -3 ;
                
                
                Matriz[i][j] = entrada.nextInt();
            }
        }
         System.out.println("Matriz");
            for (int i = 0; i < col; i++) {
                for (int j = 0; j < filas; j++) {
                    System.out.print(Matriz[i][j] + "\t");
                }
                System.out.println();
        
        
            } 
    }

    public static void triangular4() {
        Scanner entrada = new Scanner(System.in);

        int filas, col;
        int Matriz[][];

        System.out.println("Ingrese el numero de filas: ");
        filas = entrada.nextInt();
        System.out.println("Ingrese el numero de columnas: ");
        col = entrada.nextInt();

        Matriz = new int[filas][col];
        System.out.println("Rellene la matriz");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < col; j++) {

                Matriz[i][j] = entrada.nextInt();
            }
        }

        for (int i = 0; i < filas; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (Matriz[i][j] != 0) {
                    System.out.println("No es una matriz triangular inferior");
                } else {
                    System.out.println("Es una matriz triangular inferior");
                }
            }
        }

    }
}
