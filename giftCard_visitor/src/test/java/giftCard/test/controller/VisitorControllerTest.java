package giftCard.test.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import com.giftCard.Service.VisitorService;
import com.giftCard.controller.VisitorController;

public class VisitorControllerTest {

@InjectMocks
	private VisitorController visitorController;

	private MockMvc mockMvc;

	@Autowired
	private VisitorService Service;

	@Before
	public void setup() {
		System.out.println("Before Every method....");
		MockitoAnnotations.initMocks(this);
		this.mockMvc = MockMvcBuilders.standaloneSetup(visitorController).build();
	}

	@Test
	public void testNewVisitor() throws Exception {
	this.mockMvc.perform(get("/new")).andExpect(status().isOk()).
		andExpect(view().name("new_visitor"));
}
	@Test
	public void testsaveVisitor() throws Exception {
	this.mockMvc.perform(get("/save")).andExpect(status().isOk()).
		andExpect(view().name("bill"));
}

}
