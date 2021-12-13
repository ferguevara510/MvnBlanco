package uv.mx.sistemasweb;

import static spark.Spark.get;
import static spark.Spark.port;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        port(8080);
        get("/aprobado", (request, response) -> { 
            return 10;
        });
    }
}
