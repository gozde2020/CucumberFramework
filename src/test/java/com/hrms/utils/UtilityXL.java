package com.hrms.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//encapsulation sample in Java Interview question
public class UtilityXL {

	private static Workbook wbook;
	private static Sheet sheet;

	public static void openExcel(String filePth, String sheetName) {
		try {

			FileInputStream fis = new FileInputStream(filePth);
			wbook = new XSSFWorkbook(fis);
			sheet = wbook.getSheet(sheetName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getCellData(int rowIndex, int cellIndex) {
		return sheet.getRow(rowIndex).getCell(cellIndex).toString();
	}
}
