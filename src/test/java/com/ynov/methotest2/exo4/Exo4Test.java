package com.ynov.methotest2.exo4;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class Exo4Test {
	
	@Mock
	IExo4Logic mockLogic;
	
	@Test
	public void testAverageKoAndActualKo() {
		float[] temps = {20f, 20f, 20f, 20f, 20f, 20f, 20f};
		Mockito.when(mockLogic.getActualTemp()).thenReturn(25f);
		Mockito.when(mockLogic.getLastDaysTemps()).thenReturn(temps);
		
		new Exo4(mockLogic).manageHeater();
		
		Mockito.verify(mockLogic, Mockito.times(1)).getActualTemp();
		Mockito.verify(mockLogic, Mockito.times(1)).getLastDaysTemps();
		Mockito.verify(mockLogic, Mockito.times(1)).setHeater(Mockito.eq(false));
		Mockito.verify(mockLogic, Mockito.times(0)).setHeater(Mockito.eq(true));
	}
	
	@Test
	public void testAverageOkAndActualKo() {
		float[] temps = {21f, 21f, 21f, 21f, 21f, 21f, 21f};
		Mockito.when(mockLogic.getActualTemp()).thenReturn(25f);
		Mockito.when(mockLogic.getLastDaysTemps()).thenReturn(temps);
		
		new Exo4(mockLogic).manageHeater();
		
		Mockito.verify(mockLogic, Mockito.times(1)).getActualTemp();
		Mockito.verify(mockLogic, Mockito.times(1)).getLastDaysTemps();
		Mockito.verify(mockLogic, Mockito.times(1)).setHeater(Mockito.eq(false));
		Mockito.verify(mockLogic, Mockito.times(0)).setHeater(Mockito.eq(true));
	}
	
	@Test
	public void testAverageKoAndActualOk() {
		float[] temps = {20f, 20f, 20f, 20f, 20f, 20f, 20f};
		Mockito.when(mockLogic.getActualTemp()).thenReturn(26f);
		Mockito.when(mockLogic.getLastDaysTemps()).thenReturn(temps);
		
		new Exo4(mockLogic).manageHeater();
		
		Mockito.verify(mockLogic, Mockito.times(1)).getActualTemp();
		Mockito.verify(mockLogic, Mockito.times(1)).getLastDaysTemps();
		Mockito.verify(mockLogic, Mockito.times(1)).setHeater(Mockito.eq(false));
		Mockito.verify(mockLogic, Mockito.times(0)).setHeater(Mockito.eq(true));
	}
	
	@Test
	public void testAverageOkAndActualOk() {
		float[] temps = {21f, 21f, 21f, 21f, 21f, 21f, 21f};
		Mockito.when(mockLogic.getActualTemp()).thenReturn(26f);
		Mockito.when(mockLogic.getLastDaysTemps()).thenReturn(temps);
		
		new Exo4(mockLogic).manageHeater();
		
		Mockito.verify(mockLogic, Mockito.times(1)).getActualTemp();
		Mockito.verify(mockLogic, Mockito.times(1)).getLastDaysTemps();
		Mockito.verify(mockLogic, Mockito.times(1)).setHeater(Mockito.eq(true));
		Mockito.verify(mockLogic, Mockito.times(0)).setHeater(Mockito.eq(false));
	}
	
}
