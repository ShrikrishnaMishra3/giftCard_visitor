package com.userregistration.functionalcases;

import static org.mockito.Mockito.when;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.giftCard.Service.VisitorService;
import com.giftCard.Service.VisitorServiceImp;
import com.giftCard.doa.BillRepository;
import com.giftCard.doa.VisitorRepository;
import com.giftCard.model.VisitorModel;

import com.userregistration.utiltestclass.MasterData;

public class TestFunctional {

	static {
		File file = new File("output_revised.txt");
		if (file.exists()) {
			try {
				FileUtils.forceDelete(new File("output_revised.txt"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}
		}
	}

	@Mock
	private VisitorRepository userDao;

	@Mock
	private VisitorModel user;

	@InjectMocks
	private VisitorServiceImp vServiceImp;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testSaveVisitor() throws Exception {
		Boolean value = vServiceImp.save(MasterData.getVisitorDetails());
		File file = new File("output_revised.txt");
		FileUtils.write(file, "\ntestSaveVisitor=" + (value ? true : false), true);
	}

	@Test
	public void testGetUser() throws Exception {
		VisitorModel user = new VisitorModel();
		user.setId(1);
		long Id = user.getId();
		VisitorModel userfromdb = VisitorServiceImp.geId(user.getId());
		File file = new File("output_revised.txt");
		FileUtils.write(file, "\ntestGetUser=" + (Id == 0 ? true : false), true);

	}

	@Test
	public void testDeleteVisitorById() throws Exception {
		Boolean value = VisitorServiceImp.updateVisitorById(MasterData.getVisitorDetails().getId(), user);
		File file = new File("output_revised.txt");
		FileUtils.write(file, "\ntestDeleteUserById=" + (value ? true : false), true);
	}
}
