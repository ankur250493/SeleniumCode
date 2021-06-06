import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class DataDriver {

    @Test
    public ArrayList<String> getData(String testSheetName,String testCaseName,String fieldName) throws IOException {
        FileInputStream file = new FileInputStream("/home/ankur/Documents/DataDrivenTestData.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        ArrayList<String> a = new ArrayList<>();
        int sheets = workbook.getNumberOfSheets();
        for (int i = 0; i < sheets; i++) {
            if (workbook.getSheetName(i).equalsIgnoreCase(testSheetName)) {
                XSSFSheet sheet = workbook.getSheetAt(i);
                Iterator<Row> rows = sheet.iterator();
                Row firstRow = rows.next();
                Iterator<Cell> ce = firstRow.cellIterator();

                int k = 0;
                int column = 0;
                while (ce.hasNext()) {
                    Cell value = ce.next();
                    if (value.getStringCellValue().equalsIgnoreCase(fieldName)) {

                        column = k;
                    }
                    k++;
                }
                System.out.println(column);
                while (rows.hasNext()) {
                    Row r = rows.next();
                    if (r.getCell(column).getStringCellValue().equalsIgnoreCase(testCaseName)) {
                        Iterator<Cell> cv = r.cellIterator();
                        while (cv.hasNext()) {
                            Cell c = cv.next();

                            if(c.getCellType() == CellType.STRING){
                            a.add(c.getStringCellValue());
                        }
                            else {

                               a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
                            }
                    }

                }
            }

        }}
        return a;
    }
}
