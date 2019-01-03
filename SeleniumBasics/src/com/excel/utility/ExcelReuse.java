package com.excel.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReuse {
	File f;
	FileInputStream fir;
	XSSFWorkbook wb;
	XSSFSheet sh1;

	public ExcelReuse(String excelpath) throws Exception {
		
		f = new File(excelpath);
		fir = new FileInputStream(f);
		wb = new XSSFWorkbook(fir);

	}
	public String getData(int sheetno, int row, int column) {
		sh1 = wb.getSheetAt(sheetno);
		String data = sh1.getRow(row).getCell(column).getStringCellValue();
		return data;

	}

	public int getRowCount(int SheetIndex) {
		int row = wb.getSheetAt(SheetIndex).getLastRowNum();
		return row = row + 1;

	}
}