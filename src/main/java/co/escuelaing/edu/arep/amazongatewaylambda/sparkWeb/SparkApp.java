package co.escuelaing.edu.arep.amazongatewaylambda.sparkWeb;

import co.escuelaing.edu.arep.amazongatewaylambda.api.impl.ConverterImpl;
import com.google.gson.Gson;

import static spark.Spark.*;

public class SparkApp {

    public static void main(String[] args) {
        port(getPort());

        get("/converter",(req,res)-> {
            ConverterImpl converter = new ConverterImpl();
            Double result =converter.convertir(Double.parseDouble(req.queryParams("value")));
            String json = "{\"result\":"+result+"}";
            return new Gson().toJson(json);
        });
    }

    private static int getPort() {
        if(System.getenv("PORT")!= null){
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 8080;
    }
}
