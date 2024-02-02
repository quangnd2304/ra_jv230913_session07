package ra.string;

public class Demo {
    public static void main(String[] args) {
        //1. Khai báo chuỗi String literal --> String Pool (Head) --> Imutable
        //Cú pháp: String variableName = value
        String str1 = "Rikkei";
        String str2 = "Rikkei";
        //str1 và str2 cùng trỏ đến 1 vùng nhớ trong String pool: 1000
        str2 = "Academy";
        //String pool tạo ra vùng nhớ mới chứa Academy và str2 trỏ vào vùng nhớ đó: 1001
        String str3 = "Academy";
        //str3 reference đến 1001
        //2. Khai báo chuỗi là 1 đối tượng --> Head
        //String objName = new Constructor_String
        String str4 = new String("Rikkei Academy");
        System.out.println("Giá trị str4: "+str4);

    }
}
