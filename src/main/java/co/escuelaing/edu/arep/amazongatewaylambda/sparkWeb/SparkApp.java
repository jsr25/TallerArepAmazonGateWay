package co.escuelaing.edu.arep.amazongatewaylambda.sparkWeb;

import co.escuelaing.edu.arep.amazongatewaylambda.api.impl.ConverterImpl;
import com.google.gson.Gson;

import static spark.Spark.*;

/**
 * Controlardor web para el uso del los
 * metodso HTTP
 */
public class SparkApp {

    /**
     * Ejecuta la aplicacion
     * @param args parametro opcional
     */
    public static void main(String[] args) {
        port(getPort());

        get("/converter",(req,res)-> {
            ConverterImpl converter = new ConverterImpl();
            Double result =converter.convertir(Double.parseDouble(req.queryParams("value")));
            String json = "{\"result\":"+result+"}";
            return new Gson().toJson(json);
        });
    }

    /**
     * Metodo para obetener el puerto si existe
     * uno en configuracion
     * @return retorna el numero del puerto que se debe usar
     */
    private static int getPort() {
        if(System.getenv("PORT")!= null){
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 8080;
    }
}
