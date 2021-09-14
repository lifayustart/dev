package com.example.excel;


import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileOutputStream;

/**
 *
 *
 */
public class ExcelService {
    public static void main(String[] args) throws Exception {
        writeExcel03();
    }
    public static void writeExcel03() throws Exception {
        //1.创建workbook
        Workbook workbook=new HSSFWorkbook();
        //2.根据workbook创建sheet
        Sheet sheet = workbook.createSheet("会员列表");
        //3.根据sheet创建row
        Row row1 = sheet.createRow(0);
        //4.根据row创建cell
        Cell cell1 = row1.createCell(0);
        //5.向cell里面设置值
        cell1.setCellValue("按键");
        //6.通过输出流写到文件里去
        FileOutputStream fos=new FileOutputStream("/users/fayuli/Documents/others/01.xlsx");
        workbook.write(fos);
        fos.close();
    }

}
