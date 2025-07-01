package Taller1.Ejercicios.ejercicio_final_ProyectoIntegrador;
import Taller1.Ejercicios.ejercicio1.Libro;
import Taller1.Ejercicios.ejercicio2.CuentaBancaria;
import Taller1.Ejercicios.ejercicio3.Estudiante;

import java.util.Scanner;

public class maintaller1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Libro
        System.out.println("Ingrese título del libro: ");
        String titulo = sc.nextLine();
        System.out.println("Ingrese autor del libro: ");
        String autor = sc.nextLine();
        System.out.println("Ingrese paginas del libro: ");
        int paginas = sc.nextInt();
        Libro libro = new Libro(titulo, autor, paginas);

        // CuentaBancaria
        System.out.println("Ingrese número de cuenta: ");
        String numeroCuenta = sc.nextLine();
        System.out.println("Ingrese titular de la cuenta: ");
        String titular = sc.nextLine();
        System.out.println("Ingrese saldo inicial: ");
        double saldo = sc.nextDouble();
        sc.nextLine();
        CuentaBancaria cuenta = new CuentaBancaria(numeroCuenta, saldo, titular);

        // Estudiante
        System.out.println("Ingrese nombre del estudiante:");
        String nombre = sc.nextLine();
        System.out.println("Ingrese edad del estudiante:");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese curso del estudiante:");
        String curso = sc.nextLine();
        Estudiante estudiante = new Estudiante(nombre, edad, curso);

        // Mostrar detalles
        System.out.println(libro);
        System.out.println(cuenta);
        System.out.println(estudiante);

        sc.close();
    }
}