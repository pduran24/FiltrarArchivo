package service;

import models.Error;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class TxtErrorService implements TxtService {


    @Override
    public Map<Error, String> encontrarErrores(String archivo) {

        var salida = new HashMap<Error, String>();


        try(BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            var contenido = br.lines();

            contenido.forEach(line -> {

                if (line.contains("ERROR")) {
                    Error error = new Error();
                    error.setMsg(line);
                    salida.put(error, error.getMsg());
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
