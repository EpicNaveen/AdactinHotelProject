
package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;

	public static void getDriver(String browserType) {

		switch (browserType) {
		case "Chrome":

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\NAVEEN\\eclipse-workspace\\TestNGFrameWork\\chromedriver.exe");
			driver = new ChromeDriver();

			break;
		case "Edge":

			System.setProperty("webdriver.Edge.driver",
					"C:\\Users\\NAVEEN\\eclipse-workspace\\JunitFramework\\msedgedriver.exe");
			driver = new EdgeDriver();

			break;

		default:
			System.out.println("InValid Browser Type");
			break;
		}
	}

	public static void getUrl(String url) {
		driver.get(url);

	}

	public static void windMax() {
		driver.manage().window().maximize();

	}

	public static void selectMethod(WebElement obj, String text) {

		Select s = new Select(obj);
		s.selectByVisibleText(text);
	}

	public static void textSendBasedOnJS(String txtInput, WebElement password) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + txtInput + "')", password);
	}

	public static String excelRead(int rownum, int cellnum) throws IOException {

		File file = new File("C:\\Users\\NAVEEN\\Documents\\Excel doc\\Hotel.xlsx");

		FileInputStream stream = new FileInputStream(file);

		Workbook book = new XSSFWorkbook(stream);

		Sheet sheet = book.getSheet("sheet1");

		Row row = sheet.getRow(rownum);

		Cell cell = row.getCell(cellnum);

		CellType cellType = cell.getCellType();
		String value = null;
		switch (cellType) {
		case STRING:
			value = cell.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat simple = new SimpleDateFormat("dd/MM/yyyy");
				value = simple.format(dateCellValue);

			} else {
				double numericCellValue = cell.getNumericCellValue();
				long l = (long) numericCellValue;
				BigDecimal valueOf = BigDecimal.valueOf(l);
				value = valueOf.toString();

			}
			break;

		default:

			break;
		}
		return value;

	}

}
