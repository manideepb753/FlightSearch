package com.sample.app.exception;

public class FlightSearchServiceException extends Exception {

	private static final long serialVersionUID = -470180507998010368L;

	public FlightSearchServiceException() {
		super();
	}

	public FlightSearchServiceException(final String message) {
		super(message);
	}
}
