import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

import java.io.File;
import java.io.IOException;
// ?????? 什么原因？  写不进去。。。。。。。。。。。。。。。。。。。。。。。。。。。
public class NewWorkBook {
    public static void main(String[] args) throws IOException, WriteException {
        WritableWorkbook workbook = Workbook.createWorkbook(new File("dd.xls"));
        WritableSheet test_sheet = workbook.createSheet("test sheet", 0);
        Label label = new Label(0, 0, "this a cell");
        test_sheet.addCell(label);
        jxl.write.Number number = new jxl.write.Number(1, 1, 129);
        test_sheet.addCell(number);
    }
}
