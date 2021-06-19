package api.testing;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

public class ApiTests {

	@Test
	public void getReponse() {

		String endpoint = "https://reqres.in/api/users";
		var response = given().when().get(endpoint).then();
		response.log().body();

	}

}
