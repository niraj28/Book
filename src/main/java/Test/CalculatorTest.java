package Test;

import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import com.controller.Calculator;


//@SpringBootTest
public class CalculatorTest {
	

	@Autowired
	private Calculator controller;

	@Test
	public void contextLoads() throws Exception {
//		assertThat(controller).isNotNull();
	}

}
