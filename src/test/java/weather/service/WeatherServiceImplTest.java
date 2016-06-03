package weather.service;

import org.junit.Test;

import weather.controller.BaseWebApplicationContextTests;

public class WeatherServiceImplTest extends BaseWebApplicationContextTests {

	@Test
	public void test() {
		weatherService.getWeatherData("Mumbai");
	}

}
