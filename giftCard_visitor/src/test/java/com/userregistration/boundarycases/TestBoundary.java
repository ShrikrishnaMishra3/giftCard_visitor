package com.userregistration.boundarycases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import com.giftCard.model.VisitorModel;

import com.userregistration.utiltestclass.MasterData;

public class TestBoundary {

	static {
		File file = new File("output_boundary_revised.txt");		
		if (file.exists()) {
			try {
				FileUtils.forceDelete(new File("output_boundary_revised.txt"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}
		}
	}
	
	@Test
	public void testVisitorNameLength() throws Exception {
		VisitorModel visitor = MasterData.getVisitorDetails();
		visitor.getName();
		int maxChar = 5;
		boolean visitornameLength = ((visitor.getName().length()) >= maxChar);
		File file = new File("output_boundary_revised.txt");
		FileUtils.write(file, "\ntestVisitorrNameLength=" + (visitornameLength ? true : false), true);
	}

	@Test
	public void testEmailLength() throws Exception {
		VisitorModel visitor = MasterData.getVisitorDetails();
		visitor.getEmail();
		int passwordLength = 40;
		File file = new File("output_boundary_revised.txt");
		FileUtils.write(file, "testPasswordLength=" + (passwordLength == 10 ? true : false), true);
	}

	@Test
	public void testActiveUser() throws Exception {
		VisitorModel visitor = MasterData.getVisitorDetails();
		visitor.isActive();
		boolean result = true;
		File file = new File("output_boundary_revised.txt");
		FileUtils.write(file, "\ntestActiveUser=" + (result ? true : false), true);
	}
}