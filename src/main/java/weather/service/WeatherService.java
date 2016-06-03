package weather.service;

import weather.domain.WeatherData;


public interface WeatherService {
	public WeatherData getWeatherData(String location);
}
