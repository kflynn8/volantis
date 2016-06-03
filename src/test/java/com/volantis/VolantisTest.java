package com.volantis;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VolantisTest 
{
	@Test
	public void panda()
	{
		assertTrue(Volantis.panda().contains("panda"));
	}
}
