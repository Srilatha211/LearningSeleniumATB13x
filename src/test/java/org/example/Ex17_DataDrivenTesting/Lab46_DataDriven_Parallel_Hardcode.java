package org.example.Ex17_DataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lab46_DataDriven_Parallel_Hardcode {

    @Test(dataProvider = "LoginData")
    public  void test_vwo_login(String username,String password,String ER){
        System.out.println("Running  ");
        System.out.println(username + " - " + password +" - "  +ER);
        System.out.println();
    }
    //here we can give name as Login
    //can do Parallel Exection by adding as "parallel = true

    @DataProvider(name = "LoginData" , parallel = true )
    public Object[][] getData(){
        return new Object[][]{
                new Object[]{"admin@admin.com","pwd123","Expected Result 1"},
                new Object[]{"admin@admin.com","pwd123","Expected Result 2"},
                new Object[]{"admin@admin.com","pwd123","Expected Result 3"}
        };
    }
//Now to read the data from Excel we need to change the @DataProvider function




}