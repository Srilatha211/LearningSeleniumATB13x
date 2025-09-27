package org.example.Ex17_DataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lab45_DataDriven_Hardcode {
    //Here we are fecting the data
    //We are just harcoding and not reading data from Excel
    //In jave we have 2 dimentinal object
    //If u mark it as Data provider then only
    // TestNG  will Know that data is present here

    //The work & advantage of using dataprvider
    // is not required any loop in case of huge data
    @DataProvider
    public Object[][] getdata(){

        return new Object[][]{
               new Object[]{"admin@gmail.com","pass123"},
                new Object[] {"admin@123gmail.com","pass123"},
                new Object[] {"admin@145gmail.com","pass123"}
        };
    }//Now we need to mention (dataProvider = "getdata") in Test


    @Test(dataProvider = "getdata")
    public void login(String Email, String Password)//why we are using this arguments
          //  e.g u have 100 emails & Pass this fun will run 100 times
    //To run this we need to fetch some data using function
    {
        System.out.println(Email + " "+ Password);//Just printing

    }
}
