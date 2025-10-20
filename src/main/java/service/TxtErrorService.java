package service;

import models.Error;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TxtErrorService implements TxtService {

    @Override
    public List<String> encontrarErrores(String archivo) {

        var salida = new ArrayList<String>();


        try(BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            var contenido = br.lines();

            contenido.forEach(line -> {

                if (line.contains("ERROR")) {
                    Error error = new Error();
                    error.setMsg(line);
                    salida.add(error.getMsg());
                }
            });
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return salida;
    }


}
