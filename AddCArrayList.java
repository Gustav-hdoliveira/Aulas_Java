/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList;

/**
 *
 * @author GUSTAVOHENRIQUEDEOLI
 */
public class AddCArrayList {
    public static void main(String[] args) {
        // Criação e inicialização do array
        int[] numeros = {1, 2, 3, 4, 5};

        // Modificando um elemento
        numeros[2] = 10; // O terceiro elemento agora é 10

        // Imprimindo o comprimento do array
        System.out.println("Comprimento do array: " + numeros.length);

        // Iterando sobre o array
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
