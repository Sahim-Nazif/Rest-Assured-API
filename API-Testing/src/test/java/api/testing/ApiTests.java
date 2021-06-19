package api.testing;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

import api.user.User;

public class ApiTests {

	@Test
	public void getReponse() {

		/*
		 * facts or Rest Assured Pattern Given : Specify prerequisites When : Describes
		 * the action to be take Then : Describes the expected result
		 */
		String endpoint = "http://dummy.restapiexample.com/api/v1/employees";
		var response = given().when().get(endpoint).then();
		// response.log().body();

	}

	@Test
	public void getUserByID() {

		String endpoint = "http://dummy.restapiexample.com/api/v1/employee";
		var response = given().queryParam("id", 1).when().get(endpoint).then();

		response.log().body();
	}

	// Posting (creating a user)

	@Test
	public void postUser() {

		String endpoint = "http://dummy.restapiexample.com/api/v1/create";
		User user = new User(3, "John", 42222, 38, "");

		var response = given().body(user).when().post(endpoint).then();
		response.log().body();

	}

	// update a user

	@Test
	public void updateUser() {
		String endpoint = "http://dummy.restapiexample.com/public/api/v1/update/21";

		User updateUser = new User();
		updateUser.setEmployee_age(33);
		var response = given().body(updateUser).when().put(endpoint).then();

	}

	// delete a user

	@Test
	public void deleteUser() {
		String endpoint = "https://reqres.in/api/users";
		String body = "";
		var response = given().body(body).when().delete(endpoint).then();
		response.log().body();

	}

}
