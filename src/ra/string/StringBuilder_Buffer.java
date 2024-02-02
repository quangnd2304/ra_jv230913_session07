package ra.string;

public class StringBuilder_Buffer {
    public static void main(String[] args) {
        //Khai báo chuỗi StringBuilder
        StringBuilder strBuilder = new StringBuilder("Rikkeisoft");
        //Khai báo chuỗi StringBuffer
        StringBuffer strBuffer = new StringBuffer("Rikkei Academy");
        //1.str1.append(str2): Nối 2 chuỗi
        System.out.println("Nối chuỗi: "+strBuilder.append(" - Công ty sản xuất phần mềm"));
        //2. str1.insert(int offset, String str2): chèn chuỗi str2 vào vị trí offset của str1
        System.out.println("Chèn chuỗi: "+strBuffer.insert(0,"Học viện CNTT "));
        //3. str1.delete(int beginIndex, int endIndex): xóa từ beginIndex đến endIndex của chuỗi str1
        System.out.println("Xóa: "+strBuilder.delete(6,10));
        //4. str1.reverse(): đảo ngược chuỗi
        System.out.println("Đảo ngược chuỗi: "+strBuffer.reverse());
    }
}
