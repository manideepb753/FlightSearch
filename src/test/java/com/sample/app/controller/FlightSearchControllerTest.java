/*
 * package com.sample.app.controller;
 * 
 * import static org.junit.jupiter.api.Assertions.assertEquals; import static
 * org.junit.jupiter.api.Assertions.assertTrue; import static
 * org.mockito.Mockito.mock; import static
 * org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
 * import static
 * org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
 * import static
 * org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
 * import static
 * org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
 * 
 * import javax.validation.ConstraintViolationException;
 * 
 * import org.junit.jupiter.api.Test; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
 * import org.springframework.boot.test.context.SpringBootTest; import
 * org.springframework.test.web.servlet.MockMvc; import
 * org.springframework.test.web.servlet.ResultActions; import
 * org.springframework.test.web.servlet.request.MockMvcRequestBuilders; import
 * org.springframework.test.web.servlet.result.MockMvcResultMatchers; import
 * org.springframework.web.bind.MissingServletRequestParameterException;
 * 
 * import com.sample.app.constant.SortEnum; import
 * com.sample.app.exception.FlightSearchServiceException; import
 * com.sample.app.service.FlightSearchService;
 * 
 * import ch.qos.logback.core.status.Status;
 * 
 * @SpringBootTest
 * 
 * @AutoConfigureMockMvc class FlightSearchControllerTest {
 * 
 * @Autowired private MockMvc mockMvc;
 * 
 * FlightSearchService flightSerachService=mock(FlightSearchService.class);
 * 
 * @Test void retrieveFlightDetailsByOriginAndDestination() throws Exception {
 * 
 * ResultActions response = mockMvc
 * .perform(MockMvcRequestBuilders.get("/flightSearch").param("origin",
 * "LHR").param("destination", "BOM"));
 * response.andExpect(MockMvcResultMatchers.status().isOk());
 * response.andDo(print()).andExpect(status().isOk()).andExpect(content().
 * contentType("application/json")) .andExpect(jsonPath("$.*").exists()); }
 * 
 * @Test void testSortPriceAsc() throws Exception {
 * 
 * ResultActions response =
 * mockMvc.perform(MockMvcRequestBuilders.get("/flightSearch").param("origin",
 * "LHR") .param("destination", "BOM").param("priceSort",
 * SortEnum.ASC.toString()));
 * 
 * response.andExpect(MockMvcResultMatchers.status().isOk());
 * response.andDo(print()).andExpect(status().isOk()).andExpect(content().
 * contentType("application/json")) .andExpect(jsonPath("$.*").exists()); }
 * 
 * @Test void testSortingPriceDES() throws Exception {
 * 
 * ResultActions response =
 * mockMvc.perform(MockMvcRequestBuilders.get("/flightSearch").param("origin",
 * "LHR") .param("destination",
 * "BOM").param("priceSort",SortEnum.DES.toString()));
 * 
 * response.andExpect(MockMvcResultMatchers.status().isOk());
 * response.andDo(print()).andExpect(status().isOk()).andExpect(content().
 * contentType("application/json")) .andExpect(jsonPath("$.*").exists()); }
 * 
 * @Test void testSortDurationASC() throws Exception {
 * 
 * ResultActions response =
 * mockMvc.perform(MockMvcRequestBuilders.get("/flightSearch").param("origin",
 * "LHR") .param("destination", "BOM").param("durationSort",
 * SortEnum.ASC.toString()));
 * 
 * 
 * response.andExpect(MockMvcResultMatchers.status().isOk());
 * response.andDo(print()).andExpect(status().isOk()).andExpect(content().
 * contentType("application/json")) .andExpect(jsonPath("$.*").exists()); }
 * 
 * @Test void testSortDurationDES() throws Exception {
 * 
 * ResultActions response =
 * mockMvc.perform(MockMvcRequestBuilders.get("/flightSearch").param("origin",
 * "LHR") .param("destination", "BOM").param("durationSort",
 * SortEnum.DES.toString()));
 * 
 * response.andExpect(MockMvcResultMatchers.status().isOk());
 * response.andDo(print()).andExpect(status().isOk()).andExpect(content().
 * contentType("application/json")) .andExpect(jsonPath("$.*").exists()); }
 * 
 * @Test void testMissingParam() throws Exception {
 * mockMvc.perform(MockMvcRequestBuilders.get("/flightSearch").param("origin",
 * "LHR")) .andExpect(MockMvcResultMatchers.status().isBadRequest())
 * .andExpect(result -> assertTrue( result.getResolvedException() instanceof
 * MissingServletRequestParameterException)) .andExpect(result -> assertEquals(
 * "Required request parameter 'destination' for method parameter type String is not present"
 * , result.getResolvedException().getMessage()));
 * 
 * }
 * 
 * @Test void testEmptyRequiredFileldDestinationParam() throws Exception {
 * mockMvc.perform(MockMvcRequestBuilders.get("/flightSearch").param("origin",
 * "LHR")) .andExpect(MockMvcResultMatchers.status().isBadRequest())
 * .andExpect(result -> assertTrue( result.getResolvedException() instanceof
 * MissingServletRequestParameterException)).andReturn();
 * 
 * } }
 */