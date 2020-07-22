package class0720.Homework;

/**
 * @time: 2020/7/21 10:05
 * @author: Mr.Right
 * @contact: 348533713@qq.com
 * @file: WriteBackData
 * @desc: ┏┓　　　┏┓+ +
 * 　　　┏┛┻━━━┛┻┓ + +
 * 　　　┃　　　　　　　┃
 * 　　　┃　　　━　　　┃ ++ + + +
 * 　　 ████━████ ┃+
 * 　　　┃　　　　　　　┃ +
 * 　　　┃　　　┻　　　┃
 * 　　　┃　　　　　　　┃ + +
 * 　　　┗━┓　　　┏━┛
 * 　　　　　┃　　　┃
 * 　　　　　┃　　　┃ + + + +
 * 　　　　　┃　　　┃　　　　Codes are far away from bugs with the animal protecting
 * 　　　　　┃　　　┃ + 　　　　神兽保佑,代码无bug
 * 　　　　　┃　　　┃
 * 　　　　　┃　　　┃　　+
 * 　　　　　┃　 　　┗━━━┓ + +
 * 　　　　　┃ 　　　　　　　┣┓
 * 　　　　　┃ 　　　　　　　┏┛
 * 　　　　　┗┓┓┏━┳┓┏┛ + + + +
 * 　　　　　　┃┫┫　┃┫┫
 * 　　　　　　┗┻┛　┗┻┛+ + + +
 */
public class WriteBackData {
    private Integer rowNum;
    private Integer cellNum;
    private String content;

    public WriteBackData() {
    }

    public WriteBackData(Integer rowNum, Integer cellNum, String content) {
        this.rowNum = rowNum;
        this.cellNum = cellNum;
        this.content = content;
    }

    public String getRowNum() {
        return rowNum.toString();
    }

    public void setRowNum(Integer rowNum) {
        this.rowNum = rowNum;
    }

    public String getCellNum() {
        return cellNum.toString();
    }

    public void setCellNum(Integer cellNum) {
        this.cellNum = cellNum;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "WriteBackData{" +
                "rowNum='" + rowNum + '\'' +
                ", cellNum='" + cellNum + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
