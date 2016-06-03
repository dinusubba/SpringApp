package weather.service;

import java.util.List;

import weather.domain.Location;
import weather.domain.WeatherData;


public interface WeatherService {
	
	public WeatherData getWeatherData(String location);
	
	public List<Location> getLocations();
}
