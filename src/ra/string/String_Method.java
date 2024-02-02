package ra.string;

public class String_Method {
    public static void main(String[] args) {
        String str1 = "Rikkei";
        String str2 = "Rikkei";
        String str3 = new String("Rikkei");
        String str4 = new String("Rikkei");
        //1. boolean objStr1.equals(objStr2): true|false --> so sánh giá trị
        System.out.println("str1 vs str2: " + str1.equals(str2));//true
        System.out.println("str1 vs str3: " + str1.equals(str3));//true
        System.out.println("str3 vs str4: " + str3.equals(str4));//true
        //2. objStr1 == objStr2: true|false --> so sánh giá trị và địa chỉ vùng nhớ
        System.out.println("str1 vs str2: " + str1 == str2);//false
        System.out.println("str1 vs str3: " + str1 == str3);//false
        System.out.println("str3 vs str4: " + str3 == str4);//false
        //3. objStr.length(): độ dài cu chuỗi
        System.out.println("Độ dài của chuỗi str1 là: " + str1.length());
        System.out.println("Ký tự ở chỉ số 2 trong str1 là: " + str1.charAt(2));
        //4. objStr1.concat(objStr2): nối 2 chuỗi
        String str5 = "Academy";
        System.out.println("Nối chuỗi str1 với str5: " + str1.concat(str5));
        //5. objStr.toUpperCase(): viết hoa các ký tự trong chuỗi
        System.out.println("Viết hoa chuỗi str1: " + str1.toUpperCase());
        //6. objStr.toLowerCase(): Viết thường các ký tự trong chuỗi
        System.out.println("Viết thường chuỗi str1: " + str1.toLowerCase());
        //7. objStr.trim(): cắt bỏ các khoảng trắng 2 đầu của chuỗi
        String str6 = "      Rikkei Academy       ";
        System.out.println("Cắt khoảng trắng 2 đầu chuỗi str6: " + str6.trim());
        //8. objStr1.equalsIgnoreCase(objstr2): so sánh 2 chuỗi không phân biệt hoa thường
        //str1 = "Rikkei";
        String str7 = "RiKKei";
        System.out.println("So sánh str1 và str7 với equals: " + str1.equals(str7));//false
        System.out.println("So sánh str1 và str7 với equalsIgnoreCase: " + str1.equalsIgnoreCase(str7));
        //9. objStr1.compareTo(objStr2): bằng nhau trả về 0, khác thì trả về độ lệch của 2 chuỗi
        System.out.println("So sánh compareTo với str1 và str2: " + str1.compareTo(str2));//0
        System.out.println("So sánh compareTo với str1 và str7: " + str1.compareTo(str7));//32
        //10. objStr1.compareToIgnoreCase(objStr2): So sánh không phân biệt hoa thường
        System.out.println("So sánh compareToIgnoreCase với str1 và str7: " + str1.compareToIgnoreCase(str7));
        //11. objStr1.contains(objStr2): Kiểm tra chuỗi objStr2 có trong chuỗi objStr1 hay không: true|false
        String str8 = "Rikkei Academy";
        String str9 = "kke";
        System.out.println("Kiểm tra str9 có trong str8 hay không: " + str8.contains(str9));
        //12. objStr1.indexOf(objStr2): lấy ra chỉ số objStr2 trong chuỗi objStr1
        System.out.println("Chỉ số str9 trong str8: " + str8.indexOf(str9));
        //13. objStr1.replace(String old, String new): thay thế chuỗi new cho old trong objStr1
        System.out.println("Thay thế chuỗi Academy bằng Học viện trong str8: " + str8.replace("Academy", "Học viện"));
        //14. objStr1.startWith(objStr2): Kiểm tra chuỗi objStr1 có bắt đầu là chuỗi objStr2
        System.out.println("Kiểm tra chuỗi str8 có bắt đầu là str1 hay không: " + str8.startsWith(str1));
        //15. objStr1.split(String delimiter): cắt chuỗi objStr1 thành các phần tử theo delimiter
        String str10 = "Rikkei Academy - Học viện đào tạo CNTT";
        String[] arrStr = str10.split(" ");
        for (String str : arrStr) {
            System.out.println(str);
        }
        //16. objStr1.subString(int beginIndex): cắt chuỗi từ vị trí beginIndex đến cuối
        System.out.println("Cắt str10 từ chỉ số 7: "+str10.substring(7));
        //17. objStr1.subString(int beginIndex, int endIndex): cắt chuỗi từ vị trí beginIndex đến endIndex-1
        System.out.println("Cắt str10 từ chỉ số 7 đến 14: "+str10.substring(7,14));
    }
}
