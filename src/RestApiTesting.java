
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.mapper.DataToDeserialize;
import io.restassured.mapper.ObjectMapperDeserializationContext;
import io.restassured.mapper.ObjectMapperSerializationContext;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.mapper.factory.GsonObjectMapperFactory;
import io.restassured.mapper.factory.JAXBObjectMapperFactory;
import io.restassured.mapper.factory.Jackson1ObjectMapperFactory;
import io.restassured.mapper.factory.Jackson2ObjectMapperFactory;

public class RestApiTesting {
	public void apiGet()
	{

		/*Response response = RestAssured.get("https://jsonplaceholder.typicode.com/posts");
		int code=response.getStatusCode();
		System.out.println(code);
		if(code==200)
		{
			System.out.println("Status code:"+code);
		}*/
		//Arrange
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city/";
	    String city="Hyderabad";
	    
	//ACT
	    RequestSpecification httpRequest=RestAssured.given();
	    
	    Response response = httpRequest.request(Method.GET, city);
	    WeatherModel responseBody = response.getBody().as(WeatherModel.class);
	    //WeatherModel responseBody = response.getBody().WeatherModel.class;

	    int code = response.getStatusCode();
	    
	    //AsSERT
	    if(code != 200)
	    	System.out.println("fail");
	    
	    if(responseBody != null)
		{
	    	if(responseBody.City == "Hyderabad")
	    	{
	    		System.out.println("passed");
	    	}
	    	if(responseBody.Temperature == "31.02 Degree celsius")
	    	{
	    		System.out.println("passed");
	    	}
		}
	    
	    
		}
	
	
	public static void main(String [] args)
	{
		RestApiTesting obj = new RestApiTesting();
		obj.apiGet();

	}

}
