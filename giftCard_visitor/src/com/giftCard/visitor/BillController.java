package com.giftCard.visitor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.giftCard.Service.BillService;
import com.giftCard.model.BillModel;

@RestController
public class BillController {

	@Autowired
	private BillService service;

	@RequestMapping("/bill")
	public ModelAndView home() {

		ModelAndView mav = new ModelAndView("billPage");

		List<BillModel> listbill = service.listAll();

		mav.addObject("listbill", listbill);
		System.out.println(listbill);

		return mav;
		
	
	}
}
