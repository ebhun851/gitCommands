package com.addition;

import org.hamcrest.core.Is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class AdditionLogicTest {

	private AdditioinLogic logic = new AdditioinLogic();
	@Test
	public void getResultOf2Nums(){
		
		assertThat(logic.additionOf2Numbers(3, 2),Is.is(5));
	}
}