package service;

import models.Error;

import java.util.List;
import java.util.Map;

public interface TxtService {

    public Map<Error,String> encontrarErrores(String archivo);
}
