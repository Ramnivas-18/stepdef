   package org.base;

	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.text.SimpleDateFormat;
	import java.util.Date;

	/*import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.DateUtil;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;*/
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	import io.github.bonigarcia.wdm.WebDriverManager;


	public class BaseClass {

		public static WebDriver driver;
		public static Actions a;
		public static Robot r;
		
		public static void launchBrowser() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		public static void loadUrl(String url) {
			driver.get(url);
		}
		
		public static void maxBrowser() {
			driver.manage().window().maximize();

		}
		
		public static void pageTitle() {
			System.out.println(driver.getTitle());
		}
		
		public static void pageUrl() {
			System.out.println(driver.getCurrentUrl());

		}
		public static void toQuit() {
			driver.quit();
		}
		
		public static void fill(WebElement element, String userText) {
			element.sendKeys(userText);
		}
		
		public static void btnClick(WebElement element) {
			element.click();
		}
		
		public static String toGetText(WebElement element) {
			String text = element.getText();
			return text;
		}
		
		public static String toGetAttribute(WebElement element) {
			String attribute = element.getAttribute("value");
			return attribute;
		}
		
		public static void toPerformMoveToElement(WebElement element) {
			 a = new Actions(driver);
			 a.moveToElement(element).perform();
		}
		
		public static void toPerformDragAndDrop(WebElement src,WebElement dest) {
			a.dragAndDrop(src, dest).perform();
		}
		
		public static void toPerformDoubleClick(WebElement element) {
			a.doubleClick(element).perform();
		}
		
		public static void toPerformContextClick(WebElement element) {
			a.contextClick(element).perform();
		}
		
		public static void fillInAction(WebElement element, String userText) {
			a.sendKeys(element, userText).perform();
		}
		
		public static void toPerformEnter() throws AWTException {
			 r = new Robot();
			 
			 r.keyPress(KeyEvent.VK_ENTER);
			 r.keyRelease(KeyEvent.VK_ENTER);
		}
		
		public static void toPerformTab() {
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
		}
		
		public static void toCopy() {
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_C);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_C);
		}
		
		public static void toPaste() {
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
		}
		
	 /*	public static String excelRead(int rowNo, int cellNo) throws IOException {
			// File location path

			File f = new File("C:\\Users\\anjali\\eclipse-workspace\\MavenSample\\ExcelSheets\\sample sheet.xlsx");

			// To read the file we need to use FileInputStream Class

			FileInputStream fin = new FileInputStream(f);

			// Workbook-------I--------XSSF Workbook

			Workbook book = new XSSFWorkbook(fin);

			// To get the Sheet from the workbook

			Sheet sh = book.getSheet("Sheet1");

			Row r = sh.getRow(rowNo);

			Cell c = r.getCell(cellNo);

					int value = c.getCellType();

					String type = "";

					if (value == 1) {
						
						type = c.getStringCellValue();
						
					} else if (DateUtil.isCellDateFormatted(c)) {

						Date dd = c.getDateCellValue();
						
						SimpleDateFormat sim = new SimpleDateFormat("dd-mmm-yyyy");
						
						type = sim.format(dd);
						
					} else {
						
						double d = c.getNumericCellValue();

						long l = (long) d;
						type = String.valueOf(l);
					}

					return type;
				}   */
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		



