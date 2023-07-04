/*
 * package com.sample.app.service;
 * 
 * import static org.assertj.core.api.Assertions.assertThat; import static
 * org.mockito.Mockito.mock; import static org.mockito.Mockito.verify; import
 * static org.mockito.Mockito.when;
 * 
 * import java.time.LocalTime; import java.util.ArrayList; import
 * java.util.List; import java.util.Optional; import
 * java.util.stream.Collectors;
 * 
 * import org.junit.jupiter.api.Test; import
 * org.junit.jupiter.api.extension.ExtendWith; import org.mockito.InjectMocks;
 * import org.mockito.junit.jupiter.MockitoExtension;
 * 
 * import com.sample.app.entity.FlightSearchDetails; import
 * com.sample.app.exception.FlightSearchServiceException; import
 * com.sample.app.model.FlightSearchDTO; import
 * com.sample.app.repository.FlightSearchRepository;
 * 
 * @ExtendWith(MockitoExtension.class) class FlightSearchServiceTest {
 * 
 * FlightSearchRepository flightSerachRepo=mock(FlightSearchRepository.class);
 * 
 * @InjectMocks FlightSearchServiceImpl flightSearchService; String origin;
 * String destination;
 * 
 * //@SuppressWarnings("unchecked")
 * 
 * @Test void testFlightListByOriginAndDestination() throws
 * FlightSearchServiceException {
 * 
 * List<FlightSearchDetails> flightDetailList = this.buildTestFlightDetails();
 * flightDetailList = flightDetailList.stream() .
 * filter(f->f.getOrigin().equalsIgnoreCase("LHR") &&
 * f.getDestination().equalsIgnoreCase("BOM")) .collect(Collectors.toList());
 * 
 * when(flightSerachRepo.findAllByOriginAndDestination("LHR",
 * "BOM")).thenReturn(flightDetailList);
 * 
 * List<FlightSearchDTO> flightList =
 * this.flightSearchService.searchFlights("LHR", "BOM", Optional.empty(),
 * Optional.empty()); assertThat(flightList).isNotEmpty() .allMatch(f ->
 * "LHR".equals(f.getOrigin()) && "BOM".equals(f.getDestination()));
 * verify(this.flightSerachRepo).findAllByOriginAndDestination("LHR", "BOM"); }
 * 
 * private List<FlightSearchDetails> buildTestFlightDetails() {
 * List<FlightSearchDetails> flightList = new ArrayList<FlightSearchDetails>();
 * FlightSearchDetails flightDetails = new FlightSearchDetails();
 * flightDetails.setId(1); flightDetails.setFlightNumber("B201");
 * flightDetails.setOrigin("LHR"); flightDetails.setDestination("BOM");
 * flightDetails.setArrivalTime(LocalTime.parse("12:35"));
 * flightDetails.setDepartureTime(LocalTime.parse("19:30"));
 * flightDetails.setPrice(80.0); flightList.add(flightDetails);
 * 
 * 
 * return flightList; } }
 */