package com.sample.app.service;

import java.util.List;

import com.sample.app.dto.FlightSearchDTO;
import com.sample.app.exception.FlightSearchServiceException;

public interface FlightSearchService {

	public List<FlightSearchDTO> searchFlights(String origin, String destination,
			String price, String duration) throws FlightSearchServiceException;
}
