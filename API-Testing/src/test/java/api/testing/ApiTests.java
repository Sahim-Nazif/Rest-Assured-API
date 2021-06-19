package api.testing;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

public class ApiTests {

	@Test
	public void getReponse() {

		/*
		 * facts or Rest Assured Pattern Given : Specify prerequisites When : Describes
		 * the action to be take Then : Describes the expected result
		 */
		String endpoint = "https://reqres.in/api/users";
		var response = given().when().get(endpoint).then();
		// response.log().body();

	}

	@Test
	public void getUserByID() {

		String endpoint = "https://reqres.in/api/users";
		var response = given().queryParam("id", 2).when().get(endpoint).then();

		response.log().body();
	}

	// Posting (creating a user)
	@Test
	public void postUser() {

		String endpoint = "https://reqres.in/api/users";

		String body = "";
		var response = given().body(body).when().post(endpoint).then();
		response.log().body();

	}

	// update a user
	@Test
	public void updateUser() {
		String endpoint = "https://reqres.in/api/users";

		String body = "";
		var response = given().body(body).when().put(endpoint).then();

	}

	// delete a user
	@Test
	public void deleteUser() {
		String endpoint = "https://reqres.in/api/users";
		String body = "";

	}
}
