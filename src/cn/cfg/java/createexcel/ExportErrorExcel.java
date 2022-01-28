package cn.cfg.java.createexcel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.HorizontalAlignment;

public class ExportErrorExcel {
	public static void main(String[] args) {
		System.out.println(0);
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet("��èͷ��Ϣ");
		HSSFRow row = sheet.createRow(0);
		HSSFCellStyle style = wb.createCellStyle();
		style.setAlignment(HorizontalAlignment.CENTER);
		System.out.println(1);
		
		
		HSSFCell cell = row.createCell(0);
		System.out.println(2);
		cell.setCellValue("����");
		cell.setCellStyle(style);
		
		cell = row.createCell(1);
		cell.setCellValue("���֤");
		cell.setCellStyle(style);
		
		cell = row.createCell(2);
		cell.setCellValue("����״̬");
		cell.setCellStyle(style);
		
		
		cell = row.createCell(3);
		cell.setCellValue("������Ϣ");
		cell.setCellStyle(style);
		
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\Java_Study\\Java\\errorCondition.xls");
			wb.write(fout);
			fout.close();
			System.out.println("success");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
