import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherModel {
   String City;
   String Temperature;
   String Humidity;
   String WeatherDescription;
   String WindSpeed;
   String WindDirectionDegree;
   
  public WeatherModel() {}
    
   public WeatherModel(String city, String temperature, String humidity,
		   String wd, String ws, String wdd) {
        
       this.City = city;
       this.Temperature = temperature;
       this.Humidity = humidity;
       this.WeatherDescription = wd;
       this.WindSpeed = ws;
       this.WindDirectionDegree = wdd;
   
   //City": "Hyderabad",
   //"Temperature": "31.02 Degree celsius",
   //"Humidity": "74 Percent",
   //"WeatherDescription": "light rain",
   //"WindSpeed": "4.1 Km per hour",
   //"WindDirectionDegree": "230 Degree"
}
}
