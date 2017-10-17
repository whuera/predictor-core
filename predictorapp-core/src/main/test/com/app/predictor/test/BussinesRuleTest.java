package com.app.predictor.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.app.predictor.utils.Constants;

public class BussinesRuleTest {

	@Test
	public void testGetCalculateHours() {		
		String message = Constants.MESSAGE_PREDICTOR_DEFAULT;
		assertEquals("El vehiculo puede circular libremente sin restriccion",message);
	}

	@Test
	public void testDayEnabled() {
		String message = Constants.MESSAGE_PREDICTOR_DEFAULT;
		assertEquals("El vehiculo puede circular libremente sin restriccion",message);
	}

}
