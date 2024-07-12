import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {
    public Moneda buscaMoneda(String monedaBase, String monedaObjetivo){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/769289c86de74b9e5b008b87/pair/"+monedaBase+"/"+monedaObjetivo);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();

        try{
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        }
        catch (Exception e){
            throw new RuntimeException("No encontre la moneda ");
        }
    }
}
