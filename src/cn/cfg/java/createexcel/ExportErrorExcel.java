package cn.cfg.java.createexcel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
		HSSFSheet sheet = wb.createSheet("熊猫头信息");
		HSSFRow row = sheet.createRow(0);
		System.out.println("row:"+row);
		HSSFCellStyle style = wb.createCellStyle();
		style.setAlignment(HorizontalAlignment.CENTER);
		System.out.println(1);
		
		
		HSSFCell cell = row.createCell(0);
		System.out.println(2);
		cell.setCellValue("姓名");
		cell.setCellStyle(style);
		
		cell = row.createCell(1);
		cell.setCellValue("身份证");
		cell.setCellStyle(style);
		
		cell = row.createCell(2);
		cell.setCellValue("错误状态");
		cell.setCellStyle(style);
		
		
		cell = row.createCell(3);
		cell.setCellValue("错误信息");
		cell.setCellStyle(style);
		
		
		
		

		
		List<ErrorCondition> list = ExportErrorExcel.getErorCondition();
		System.out.println("list2:	"+list);
		for(int i = 0;i<list.size();i++) {
			System.out.println("list.size	"+list.size());
			System.out.println("i:	"+i);
			ErrorCondition errorcondition = list.get(i);
			HSSFRow row1 = sheet.createRow(1);
			System.out.println("row:	"+row1);
			row1.createCell(0).setCellValue(errorcondition.getName());
			row1.createCell(0).setCellValue("熊猫");
			System.out.println(5);
			row1.createCell(1).setCellValue(errorcondition.getIdcard());
			System.out.println(errorcondition.getIdcard());
			row1.createCell(2).setCellValue(errorcondition.getStatus());
			row1.createCell(3).setCellValue(errorcondition.getErrormessage());
			System.out.println("end");
		}
		
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
	
	
	public static List<ErrorCondition> getErorCondition(){
		System.out.println("3");
		List<ErrorCondition> list = new ArrayList<ErrorCondition>(); 
		ErrorCondition r1 = new ErrorCondition("熊猫头","440002","L","长度错误");
		list.add(r1);
		System.out.println("4");
		System.out.println(r1);
		return list;
	}
	
}
