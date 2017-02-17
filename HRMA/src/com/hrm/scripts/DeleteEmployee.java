package com.hrm.scripts;

import org.testng.annotations.Test;

import com.hrm.base.BaseTest;
import com.hrm.pages.DashboardPage;
import com.hrm.pages.EmpInfoPage;

import generics.Excel;

public class DeleteEmployee extends BaseTest{

	@Test
	public void testDeleteEmployee() throws InterruptedException{
		int rc = Excel.getRowCount(INPUT_PATH, "DeleteEmployee");
		for(int i=1;i<=rc;i++)
		{
			String eipURL = Excel.getCellValue(INPUT_PATH, "DeleteEmployee", i, 0);
			String fn = Excel.getCellValue(INPUT_PATH, "DeleteEmployee", i, 1);
		//click on PIM
		DashboardPage dbPage=new DashboardPage(driver);
		Thread.sleep(3000);
		dbPage.clickPIM_Menu();
		//verify EMp Info Page
		EmpInfoPage eiPage=new EmpInfoPage(driver);
		eiPage.verifyURLhas(eipURL);
		//select the CB of required employee
		Thread.sleep(3000);
		eiPage.clickEmpCheckBox(fn);
		//click Delete
		Thread.sleep(3000);
		eiPage.clickDelete();
		//click OK
		Thread.sleep(3000);
		eiPage.clickOk();
		//verify employee is deleted
		eiPage.verifyEmpIsNotPresent(fn);
		}
	}
}
