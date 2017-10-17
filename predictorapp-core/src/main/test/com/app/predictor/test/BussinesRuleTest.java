package com.app.predictor.test;

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import java.util.Calendar;
import javax.xml.parsers.ParserConfigurationException;
import org.junit.BeforeClass;
import org.junit.Test;
import org.xml.sax.SAXException;
import com.app.predictor.model.PicoPlacaForm;
import com.app.predictor.service.IPredictorPicoPlaca;
import com.app.predictor.service.ServicePredictorPicoPlaca;
import com.app.predictor.utils.Constants;

/**
 * The Class BussinesRuleTest.
 */
public class BussinesRuleTest {
	
	/** The predictor pico placa. */
	private static IPredictorPicoPlaca predictorPicoPlaca;

	/**
	 * Inits the bussines rule.
	 */
	@BeforeClass
	public static void initBussinesRule(){
		predictorPicoPlaca = new ServicePredictorPicoPlaca();
	}

	/**
	 * Test get calculate hours.
	 */
	@Test
	public void testGetCalculateHours() {				
		Calendar dateInput = Calendar.getInstance();
		PicoPlacaForm picoPlacaForm = new PicoPlacaForm();
		picoPlacaForm.setDateQuestion(dateInput);
		picoPlacaForm.setNumber("PCD407");
		picoPlacaForm.setParamTime("16:59");
		String message = null;
		try {
			message = predictorPicoPlaca.dayEnabled(picoPlacaForm);
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		assertEquals(Constants.MESSAGE_PREDICTOR_DEFAULT,message);
	}

	/**
	 * Test day enabled.
	 */
	@Test
	public void testDayEnabled() {
		String message = Constants.MESSAGE_PREDICTOR_DEFAULT;
		assertEquals("El vehiculo puede circular libremente sin restriccion",message);
	}

}
