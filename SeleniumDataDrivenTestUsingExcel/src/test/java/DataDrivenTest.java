import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class DataDrivenTest {

    @Test
    public ArrayList<String> DataTest(String testcasename) throws IOException {
        FileInputStream file = new FileInputStream("/home/ankur/Documents/DataDrivenTestData.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        int sheetCount = workbook.getNumberOfSheets();
        ArrayList<String> a = new ArrayList<String>();
        for (int i = 0; i < sheetCount; i++) {
            if (workbook.getSheetName(i).equalsIgnoreCase("sheet1")) {
                XSSFSheet sheet = workbook.getSheetAt(i);
                Iterator<Row> rows = sheet.iterator();
                Row firstRow = rows.next();
                Iterator<Cell> ce = firstRow.cellIterator();
                int k = 0;
                int coloumn = 0;
                while (ce.hasNext()) {
                    Cell value = ce.next();
                    if (value.getStringCellValue().equalsIgnoreCase("testcases"))
                    {
                        coloumn = k;
                    }
                    k++;
                }
                System.out.println(coloumn);
                while (rows.hasNext()) {
                    Row r = rows.next();
                    if (r.getCell(coloumn).getStringCellValue().equalsIgnoreCase("testcasename")) {
                        Iterator<Cell> cv = r.cellIterator();
                        while (cv.hasNext()) {

                            a.add(cv.next().getStringCellValue());
                            System.out.println(cv.next().getStringCellValue());
                        }
                    }

                }

            }

        }
        return a;
    }

}
