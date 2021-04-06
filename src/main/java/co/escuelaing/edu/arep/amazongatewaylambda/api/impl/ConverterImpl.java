package co.escuelaing.edu.arep.amazongatewaylambda.api.impl;

import co.escuelaing.edu.arep.amazongatewaylambda.api.Converter;

public class ConverterImpl implements Converter {

    @Override
    public Double convertir(Double value) {
        return (value-32.0)*(5.0/9.0);
    }

}
