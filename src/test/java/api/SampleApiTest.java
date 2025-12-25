package api;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class SampleApiTest {

    @Test
    public void getUser() {
        given()
            .baseUri("https://reqres.in")
        .when()
            .get("/api/users/2")
        .then()
            .statusCode(200);
    }
}
