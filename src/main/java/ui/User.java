package ui;

import data.TxtWriterError;

import java.util.Scanner;

public class User {

    public void comenzar() {
        TxtWriterError escribir = new TxtWriterError();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introducir el nombre del archivo: ");
        String archivo = scanner.nextLine();

        System.out.println("Introducir el nombre del nuevo archivo: ");
        String nuevo = scanner.nextLine();


        if (escribir.escribirArchivo(archivo, nuevo) == 1) {
            System.out.println("Archivo guardado correctamente");
        }
        else {
            System.out.println("No se pudo guardar el archivo");
        }
    }
}
