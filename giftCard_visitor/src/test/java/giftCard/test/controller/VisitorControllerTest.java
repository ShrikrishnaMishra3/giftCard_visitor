package giftCard.test.controller;


import com.giftCard.model.BillModel;
import com.giftCard.model.VisitorModel;
import com.giftCard.visitor.VisitorController;

import com.giftCard.test.config.TestConfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class})


public class VisitorControllerTest {

	@Autowired
	private VisitorController vController;

	@Test
	public void validateVisitor_Test_Positive() {
		Map params = new HashMap();
		params.put("name", "krishna");
		params.put("email", "krishna@iiht.com");
		ResponseEntity result = vController.validate(new Gson().toJson(params));
		assertNotNull(result);
		assertEquals(result.getStatusCode(), HttpStatus.OK);
	}

	@Test public void visitorDetails_Test() {
  
  ResponseEntity> result = vController.vDetails(); assertNotNull(result);
  assertTrue(result.getBody().size() > 0); }

}
