package mst.automation.utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import mst.automation.constant.Constant;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DataUtils {
	
	public static FileInputStream inputStream;
	public static XSSFSheet sheet = null;
	public static XSSFRow row = null;
	public static XSSFCell cell = null;
	
	// To open the excel file before fetched data
	public static void openStream() throws Throwable {
		File file = new File(Constant.DATAFILEPATH);
		inputStream = new FileInputStream(file);
		FileInputStream inputStrem = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(inputStrem);
		
	}

	// To close the input stream after fetched data
	public static void closeStream() throws IOException {
		inputStream.close();
	}

	// To read the data from the concerned cell
	public static String readExcelData(String sheetName, String columnName, String rowName) {
		String cellValue = "";

		try {
			File file = new File(Constant.DATAFILEPATH);
			FileInputStream fis = new FileInputStream(file);
			Workbook workbook = new XSSFWorkbook(fis);
			Sheet sheet = workbook.getSheet(sheetName);

			int rowIndex = 0;
			int colIndex = 0;

			Row headerRow = sheet.getRow(0);
			for (Cell cell : headerRow) {
				if (cell.getStringCellValue().equals(columnName)) {
					colIndex = cell.getColumnIndex();
					break;
				}
			}

			for (Row row : sheet) {
				Cell cell = row.getCell(0);
				if (cell.getStringCellValue().equals(rowName)) {
					rowIndex = row.getRowNum();
					break;
				}
			}

			if (rowIndex != -1 && colIndex != -1) {
				Row dataRow = sheet.getRow(rowIndex);
				Cell dataCell = dataRow.getCell(colIndex);
				if (dataCell.getCellType() == Cell.CELL_TYPE_STRING) {
					cellValue = dataCell.getStringCellValue();
				} else {
					// cellValue = String.valueOf(dataCell.getNumericCellValue());
					DataFormatter formatter = new DataFormatter();
					String val = formatter.formatCellValue(dataCell);
					return val;
				}

			} else {
				System.out.println("Data not found");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return cellValue;
	}
}


