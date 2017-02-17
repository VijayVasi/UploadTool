package com.hrm.scripts;

import org.testng.annotations.Test;

import com.hrm.base.BaseTest;
import com.hrm.pages.AddEmpPage;
import com.hrm.pages.DashboardPage;
import com.hrm.pages.EmpPersonalDetailsPage;

import generics.Excel;

public class CreateEmployee extends BaseTest {
	 @Test
	 public void testCreateEmployee() throws InterruptedException
	 {
		 int rc=Excel.getRowCount(INPUT_PATH, "CreateEmployee");
		 Thread.sleep(3000);
		 for(int i=1;i<=rc;i++)
		 {
			 String aepURL = Excel.getCellValue(INPUT_PATH, "CreateEmployee", i, 0);
			 String fn = Excel.getCellValue(INPUT_PATH, "CreateEmployee", i, 1);
			 String ln = Excel.getCellValue(INPUT_PATH, "CreateEmployee", i, 2);
			 String vpdURL = Excel.getCellValue(INPUT_PATH, "CreateEmployee", i, 3);
		 
		 //click on PIM
		 DashboardPage dbPage=new DashboardPage(driver);
		 dbPage.clickPIM_Menu();
		 //click on Add Emp
		 Thread.sleep(3000);
		 dbPage.clickAddEmp_Menu();
		 //verify AddEmpPage
		 AddEmpPage aePage=new AddEmpPage(driver);
		 aePage.verifyURLhas(aepURL);
		 //enter valid FN
		 Thread.sleep(3000);
		 aePage.setFirstName(fn);
		 //enter valid LN
		 Thread.sleep(3000);
		 aePage.setLastName(ln);
		 //click on Save
		 Thread.sleep(3000);
		 aePage.clickSave();
		 //verify Emp Personal Details page
	 EmpPersonalDetailsPage epdPage=new EmpPersonalDetailsPage(driver);
		 epdPage.verifyURLhas(vpdURL);
		 Thread.sleep(3000);
		 //verify the FN
		 epdPage.verifyFirstName(fn);
		 }
	 }
}







