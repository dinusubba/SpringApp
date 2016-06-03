package weather.service;

import java.util.List;

import javax.inject.Named;

import weather.domain.Location;
import weather.domain.WeatherData;
import weather.repo.WeatherRepo;

@Named("weatherService")
public class WeatherServiceImpl implements WeatherService {

	WeatherRepo weatherRepo = new WeatherRepo();
	
	public WeatherData getWeatherData(String location) {
		return new WeatherData();
	}

	@Override
	public List<Location> getLocations() {
		return weatherRepo.getLocations();
	}

}
