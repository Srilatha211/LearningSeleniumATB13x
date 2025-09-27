package Utilities;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;


public class UtilExcel {
    //here we need write the 2d object function
//Static means we use it any where
    //The testdata should always be in the resources bcz maven can read the data easily from resources
    //dont keep in as seaparet folder


    //here first we need to get thefile present
    //Userdir: C:\Users\ashok\IdeaProjects\LearningSeleniumATB13X

    public static String SHEET_PATH = System.getProperty("user.dir") + "\\src\\test\\resources\\TestData.xlsx";
    static Workbook book;
    static Sheet sheet;

    public  static Object[][] getdatafromExcel(String sheetName){
        // Apache POI
        // Read the File - TestData.xlsX
        //  Workbook Create
        // Sheet
        // Row and Cell
        // 2D Object  - getData()


        //HOw do we read a fIle using FileInputStream
        //always advisible wrking with File add the checked Excpetion IO
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(SHEET_PATH);
            book = WorkbookFactory.create(fileInputStream);
            //create means we are not creting it will always create temperory file
            sheet = book.getSheet(sheetName);
//Now from work book will get the sheet name
        } catch (IOException e) {
            System.out.println("File not found");
        }

//here we neet to convert this sheet -- " sheet = book.getSheet(sheetName); to data
        //by fecting the col and rows and put in the data
        Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

        for (int i = 0; i < sheet.getLastRowNum(); i++) {//Here it goes from 0 to 20  which are rows
            for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
//here it goes from 1st col to 2 ==  total 2 col
                // First row email, password -> column name - skip - header
                data[i][j] = sheet.getRow(i + 1).getCell(j).toString();
//i+1 means we dont need the headers znd gives us the first user and pass

            }
        }

        return data;//retun the data in the end
    }

}
