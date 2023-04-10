package com.adviters.bootcamp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // ejercicio1();
        // ejercicio2();
        // ejercicio3();
        // ejercicio4();
        // ejercicio5();
        // ejercicio6();
        // ejercicio7();
        // ejercicio8();
        // ejercicio9();

/*        int tateti_zise = 3;
        String[][] tateti = new String[tateti_zise][tateti_zise];
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < tateti_zise; columna++) {
                System.out.print("[" + fila + "][" + columna + "] ");
            }
            System.out.println("");
        }*/

/*        Empleado devOriginal = new Empleado();

        Empleado devCopia1 = devOriginal.setDni(37686822);

        Empleado devCopia2 = devCopia1.setNombre("Gabriel");

        System.out.println(devOriginal.toString());

        System.out.println(devCopia1.toString());

        System.out.println(devCopia2.toString());*/
    }

    /*    1. Escribí un programa que le solicite al usuario un número entero y muestre todos los números correlativos
    entre el 1 y el número ingresado por el usuario.*/
    public static void ejercicio1() {
        System.out.print("Ingrese un número entero mayor a 1: ");
        Integer numeroIngresado = input.nextInt();
        System.out.print("Los números correlaivos entre 1 y " + numeroIngresado + " son: ");
        for (Integer numero = 1; numero <= numeroIngresado; numero++) {
            System.out.print(numero);
            System.out.print((numero < numeroIngresado) ? " - " : ""); // Separación entre números
        }
    }

    /*    2. Pedir ingresar una frase e imprimir sus caracteres.*/
    public static void ejercicio2() {
        System.out.print("Ingrese una frase: ");
        String fraseIngresada = input.nextLine();
        System.out.print("Los frase \"" + fraseIngresada +"\" tiene los caracters: ");
        int longitudDeFrase = fraseIngresada.length();
        for (int posicionDeCaracter = 1; posicionDeCaracter <= longitudDeFrase; posicionDeCaracter++) {
            System.out.print(fraseIngresada.charAt(posicionDeCaracter - 1));
            System.out.print((posicionDeCaracter < longitudDeFrase) ? " - " : ""); // Separación entre letras
        }
    }

    /*    3. Escribí un programa que, dado un número por el usuario, muestre todos sus divisores positivos.
    Recordá que un divisor es aquel que divide al número de forma exacta (con resto 0).*/
    private static boolean esDivisor(int dividendo, int divisor) {
        return dividendo % divisor == 0;
    }

    public static void ejercicio3() {
        System.out.print("Ingrese un número entero: ");
        int numeroIngresado = input.nextInt();
        System.out.print("Los divisores positivos de " + numeroIngresado + " son: ");
        for (int numero = 1; numero <= numeroIngresado; numero++) {
            if (esDivisor(numeroIngresado, numero)) {
                System.out.print(numero);
                System.out.print((numero < numeroIngresado) ? " - " : ""); // Separación entre números
            }
        }
    }

    /*    4. Escribí un programa que, dada una frase por el usuario, la muestre invertida.*/
    public static void ejercicio4() {
        System.out.print("Ingrese una frase: ");
        String fraseIngresada = input.nextLine();
        int longitudDeFrase = fraseIngresada.length();
        String fraseInvertida = "";
        for (int posicionDeCaracter = longitudDeFrase; posicionDeCaracter > 0; posicionDeCaracter--) {
            fraseInvertida += fraseIngresada.charAt(posicionDeCaracter - 1);
        }
        System.out.print("Los frase \"" + fraseIngresada +"\" de forma invertida es: ");
        System.out.println(fraseInvertida);
    }

    /*    5. Leer números enteros de teclado, hasta que el usuario ingrese el 0. Finalmente, mostrar la sumatoria de todos
    los números ingresados.*/
    public static void ejercicio5() {
        int sumatoria = 0;
        boolean finalizar = false;
        do {
            System.out.print("Ingrese un número entero cualquiera o el 0 para terminar: ");
            int numeroIngresado = input.nextInt();
            sumatoria += numeroIngresado;
            finalizar = numeroIngresado == 0;
        } while (!finalizar);
        System.out.println("La sumatoria de los números ingresados es: " + sumatoria);
    }

    /*    6. Leer un número entero positivo desde teclado e imprimir la suma de los dígitos que lo componen.*/
    public static void ejercicio6() {
        System.out.print("Ingrese un número entero positivo: ");
        int numeroIngresado = input.nextInt();
        String cadenaDeNumeros = String.valueOf(numeroIngresado);
        int longitudDeCadena = cadenaDeNumeros.length();
        int sumaDeCifras = 0;
        for (int posicionDeLaCifra = 1; posicionDeLaCifra <= longitudDeCadena; posicionDeLaCifra++) {
            int cifra = Integer.parseInt(String.valueOf(cadenaDeNumeros.charAt(posicionDeLaCifra - 1)));
            sumaDeCifras += cifra;
        }
        System.out.print("Los suma de las cifras del número " + numeroIngresado + " es: " + sumaDeCifras);
    }

    /*    7. Solicitar al usuario el ingreso de una frase y de una letra(que puede o no estar en la frase).
    Recorrer la frase, carácter a carácter, comparando con la letra buscada. Si el carácter no coincide,
    indicar que no hay coincidencia en esa posición(imprimiendo la posición) y continuar.
    Si se encuentra una coincidencia, indicar en qué posición se encontró y finalizar la ejecución.*/
    public static void ejercicio7() {
        System.out.print("Ingrese una frase: ");
        String fraseIngresada = input.nextLine();
        System.out.print("Ingrese una letra: ");
        char letraIngresada = input.nextLine().charAt(0);
        System.out.println("--- Resultado ---");
        int longitudDeFrase = fraseIngresada.length();
        boolean hayCoincidencia = false;
        for (int posicionDeLetra = 1; posicionDeLetra <= longitudDeFrase && !hayCoincidencia; posicionDeLetra++) {
            hayCoincidencia = fraseIngresada.charAt(posicionDeLetra - 1) == letraIngresada;
            String resultado = hayCoincidencia ? "Hay coincidencia" : "No hay coincidencia";
            System.out.println("Posición de letra N°" + posicionDeLetra + " " + resultado);
        }
    }

    /*    8. Crear un programa que solicite el ingreso de números enteros positivos, hasta que el usuario ingrese el 0.
    Por cada número, informar cuántos dígitos pares y cuántos impares tiene. Al finalizar, informar la cantidad de
    dígitos pares y de dígitos impares leídos en total.*/
    private static boolean esPar(int numero) {
        return numero % 2 == 0 && numero != 0;
    }
    public static void ejercicio8() {
        boolean finalizar = false;
        int totalDigitosPares = 0;
        int totalDigitoImpares = 0;
        do {
            System.out.print("Ingrese un número entero positivo o 0 para terminar: ");
            int valorIngresado = input.nextInt();
            if (valorIngresado > 0) {
                int digitosPares = 0;
                int digitosImpares = 0;
                String cadenaDeNumeros = String.valueOf(valorIngresado);
                int longitudDeCadena = cadenaDeNumeros.length();
                for (int posicionDeLaCifra = 1; posicionDeLaCifra <= longitudDeCadena; posicionDeLaCifra++) {
                    int cifra = Integer.parseInt(String.valueOf(cadenaDeNumeros.charAt(posicionDeLaCifra - 1)));
                    if (esPar(cifra)) {
                        digitosPares++;
                        totalDigitosPares++;
                    } else if (cifra != 0){
                        digitosImpares++;
                        totalDigitoImpares++;
                    }
                }
                System.out.println("En número ingresado tiene " + digitosPares + " digitos pares y " + digitosImpares + " digitos impares");
            } else if (valorIngresado < 0){
                System.out.println("¡¡¡ESE NÚMERO NO ES VÁLIDO!!!");
            }
            finalizar = valorIngresado == 0;
        } while(!finalizar);
        System.out.println("Se detecto " + totalDigitosPares + " digitos pares y " + totalDigitoImpares + " digitos impares");
    }

    /*    9. Escribir un programa que solicite el ingreso de una cantidad indeterminada de números mayores que 1,
    finalizando cuando se reciba un cero. Imprimir la cantidad de números primos ingresados.*/
    private static boolean esPrimo(int numero) {
        int cantidadDeDivisoresPositivos = 0;
        for (int divisor = 1; divisor <= numero && cantidadDeDivisoresPositivos < 3; divisor++) {
            if (numero % divisor == 0) {
                cantidadDeDivisoresPositivos++;
            }
        }
        return cantidadDeDivisoresPositivos == 2;
    }
    public static void ejercicio9() {
        boolean finalizar = false;
        int cantidadTotalDePrimos = 0;
        do {
            System.out.print("Ingrese un número entero mayor a 1 o 0 para terminar: ");
            int valorIngresado = input.nextInt();
            if (valorIngresado < 0 || valorIngresado == 1) {
                System.out.println("¡¡¡ESE NÚMERO NO ES VÁLIDO!!!");
            }
            finalizar = valorIngresado == 0;
            if (!finalizar && esPrimo(valorIngresado)) {
                cantidadTotalDePrimos++;
            }

        } while (!finalizar);
        System.out.println("Se ingresaron " + cantidadTotalDePrimos + " números primos.");
    }
}