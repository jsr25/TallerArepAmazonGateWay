package co.escuelaing.edu.arep.amazongatewaylambda.api;

/**
 * Interfaz que proporciona la funcionalidad
 */
public interface Converter  {
    /**
     * metodo para convertir grados farenheit a celcius
     * @param value valor en farenheit
     * @return valor en celcius
     */
    public Double convertir(Double value);
}
