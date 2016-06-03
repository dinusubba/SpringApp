package weather.service;

import javax.inject.Named;

import weather.domain.WeatherData;

@Named("weatherService")
public class WeatherServiceImpl implements WeatherService {

	public WeatherData getWeatherData(String location) {
		return new WeatherData();
	}

}
