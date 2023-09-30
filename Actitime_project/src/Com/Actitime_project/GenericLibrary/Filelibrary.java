package Com.Actitime_project.GenericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This class is a generic class which contains non static to read data from property and excel file;.
 * @author Lenovo
 */

public class Filelibrary {
	/**
	 * this method is a non static method used to read data from property file.
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String readdatafrompropertyfile(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./testdata/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
	}
	/**
	 * this is a non static method we used to read the data from excel file.
	 * @param sheet
	 * @param row
	 * @param col
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readdatafromexcelsheet(String sheet,int row,int col) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./testdata/BANKING INFO.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String value = wb.getSheet(sheet).getRow(row).getCell(col).getStringCellValue();
		return value;
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		Filelibrary f=new Filelibrary();
		f.readdatafromexcelsheet("Sheet1", 1, 1);
	}

}
