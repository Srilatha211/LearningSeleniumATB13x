package org.example.Ex17_DataDrivenTesting;

import Utilities.UtilExcel;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lab48_DataDriven_ActualReading_Excel {

    @Test(dataProvider = "getData")
    public  void test_vwo_login(String username,String password){

        System.out.println("Running  ");
        System.out.println(username + " - " + password);
        System.out.println();
    }
    //Now to read the data from Excel we need to change the @DataProvider function


    @DataProvider
    public Object[][] getData(){
        //Read from Excel file
        //Convert this into 2D aray Object
        //return the array
        return UtilExcel.getdatafromExcel("sheet1");

    }

//Need to create the Util Excel class  in resources folder file and
// getdatafromexcel function in Util Excel and call here


}