import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;

/**
 * jxl 的使用，用来读取excel文件
 */
public class WorkBookTest {
    public static void main(String[] args) throws IOException, BiffException {
        Workbook workbook = Workbook.getWorkbook(new File("a.xls"));
        Sheet sheet = workbook.getSheet(0);
        for (int i = 0; i < sheet.getRows(); i++) {
            for (int i1 = 0; i1 < sheet.getColumns(); i1++) {
                // 获取具体的单元格 参数是列 行
                Cell cell = sheet.getCell(i1, i);
                String contents = cell.getContents();
                System.out.println(contents);
            }
        }
        String name = sheet.getName();
        System.out.println(name);
        System.out.println("这是第一列");
        Cell[] column = sheet.getColumn(0);
        for (Cell cell : column) {
            System.out.println(cell.getContents());
        }
        System.out.println("这是第二行");
        Cell[] row = sheet.getRow(1);
        for (Cell cell : row) {
            System.out.println(cell.getContents());
        }

    }
}
