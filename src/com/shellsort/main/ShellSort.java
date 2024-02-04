package com.shellsort.main;

public class ShellSort {
    public static void shellSort(int[] arr) {
        int n = arr.length;

        // Comenzamos con una secuencia de incrementos, en este caso, dividimos n por 2
        for (int increment = n / 2; increment > 0; increment /= 2) {
            // Aplicamos Insertion Sort en subgrupos con el incremento actual
            for (int i = increment; i < n; i++) {
                int temp = arr[i];
                int j;

                // Desplazamos los elementos hacia la derecha dentro del subgrupo
                for (j = i; j >= increment && arr[j - increment] > temp; j -= increment) {
                    arr[j] = arr[j - increment];
                }

                // Colocamos el elemento temporal en su posición correcta en el subgrupo
                arr[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 3, 1, 9, 6, 0, 7, 4, 5, 2};

        System.out.println("Array desordenado:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        shellSort(arr);

        System.out.println("\nArray ordenado:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
