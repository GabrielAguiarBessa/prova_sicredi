package localhost.ProjetoApi;

import org.junit.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;

public class TesteAPI {
	@Test
	public void restrição() {
		String url = "http://localhost:8888/v2/api-docs";
		String corpo = "{\"nome\": \"Gabriel\", " + "{\"cpf\": \"97093236014\"," + "{\"email\": \"email@email.com\","

				+ "{\"valor\": \"1200\",\"parcelas\": \"3\"," + "{[\"seguro\": true},";

		 //dado que
		Response response = given().contentType("application/json").body(corpo).
				
			when().post(url);

			response.then().statusCode(200);
		
		System.out.println("retorno =>" + response.body().asString());

	}

}
