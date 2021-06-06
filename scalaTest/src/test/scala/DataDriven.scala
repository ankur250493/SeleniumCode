import org.apache.poi.ss.usermodel.CellType
import org.apache.poi.ss.util.NumberToTextConverter
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import java.util._
import java.io.FileInputStream


object DataDriven{
  /*@throws[IOException]*/
  /*def extractData(testCaseName: String): Unit = {
    val file: FileInputStream = new FileInputStream("/home/ankur/Documents/DataDrivenTestData.xlsx")
    val workbook: HSSFWorkbook = new HSSFWorkbook(file)
    val a = new util.ArrayList[String]
    val sheets: Int = workbook.getNumberOfSheets

    for (i <- 0 until sheets) {
      if (workbook.getSheetName(i).equalsIgnoreCase("Sheet1")) {
        val sheet = workbook.getSheetAt(i)
        val rows = sheet.iterator
        val firstRow = rows.next
        val ce = firstRow.cellIterator
        var k = 0
        var column = 0
        while ( {
          ce.hasNext
        }) {
          val value = ce.next
          if (value.getStringCellValue.equalsIgnoreCase("TestCases")) column = k
          k += 1
        }
        println(column)
        while ( {
          rows.hasNext
        }) {
          val r = rows.next
          if (r.getCell(column).getStringCellValue.equalsIgnoreCase(testCaseName)) {
            val cv = r.cellIterator
            while ( {
              cv.hasNext
            }) {
              val c = cv.next
              if (c.getCellType eq CellType.STRING) a.add(cv.next.getStringCellValue)
              else a.add(NumberToTextConverter.toText(cv.next.getNumericCellValue))
            }
          }
        }
      }
    }
  }*/



  def extractData(testSheetName: String, testCaseName: String, fieldName: String):ArrayList[String] = {
    val file = new FileInputStream("/home/ankur/Documents/Selenium 4.0/scalaTest/Data/LoginData.xlsx")
    val workbook = new XSSFWorkbook(file)
    //val a = ArrayBuffer[String]()
    val a = new ArrayList[String]
    val sheets = workbook.getNumberOfSheets
    for (i <- 0 until sheets) {
      if (workbook.getSheetName(i).equalsIgnoreCase(testSheetName)) {
        val sheet = workbook.getSheetAt(i)
        val rows = sheet.iterator
        val firstRow = rows.next
        val ce = firstRow.cellIterator
        var k = 0
        var column = 0
        while ( {
          ce.hasNext
        }) {
          val value = ce.next
          if (value.getStringCellValue.equalsIgnoreCase(fieldName)) column = k
          k += 1
        }
        while ( {
          rows.hasNext
        }) {
          val r = rows.next
          if (r.getCell(column).getStringCellValue.equalsIgnoreCase(testCaseName)) {
            val cv = r.cellIterator
            while ( {
              cv.hasNext
            }) {
              val c = cv.next
              if (c.getCellType eq CellType.STRING) a.add(c.getStringCellValue)
              else a.add(NumberToTextConverter.toText(c.getNumericCellValue))
            }
          }
        }
      }
    }
    a
  }


}