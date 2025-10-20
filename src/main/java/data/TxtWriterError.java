package data;

import service.TxtErrorService;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class TxtWriterError {

    TxtErrorService txtErrorService = new TxtErrorService();

    public int escribirArchivo(String archivo, String nuevoArchivo){
        int escrito = 0;
        var contenido = txtErrorService.encontrarErrores(archivo);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nuevoArchivo))) {

            bw.write(contenido.toString());
            escrito = 1;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return escrito;
    }

}
