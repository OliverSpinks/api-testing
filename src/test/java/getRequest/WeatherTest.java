package getRequest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;


public class WeatherTest {

    @Test
    public void testResponseCode() {
        String apiKey = System.getenv("API_KEY");
        System.out.println(apiKey);
        Response resp =  RestAssured.get("https://api.openweathermap.org/geo/1.0/direct?q=London&limit=1&appid=" + apiKey );
        int statusCode = resp.getStatusCode();
        System.out.println("Status code is "+statusCode);
        Assert.assertEquals(statusCode,200);
    }


}