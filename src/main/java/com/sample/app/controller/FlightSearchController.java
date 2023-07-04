package com.sample.app.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.sample.app.dto.FlightSearchDTO;
import com.sample.app.exception.FlightSearchServiceException;
import com.sample.app.service.FlightSearchService;

@RestController
public class FlightSearchController {

	@Autowired
	private FlightSearchService flightSearchService;

    @GetMapping(value = "/flightSearch")
	@ResponseStatus(value = HttpStatus.OK)
	public List<FlightSearchDTO> searchFlights(@RequestParam(value="origin",required = true) String origin,
			@RequestParam(value="destination",required = true)  String destination,
			@RequestParam(required = false) String price,
			@RequestParam(required = false) String duration) throws FlightSearchServiceException {

		return flightSearchService.searchFlights(origin, destination, price, duration);
	}
}
