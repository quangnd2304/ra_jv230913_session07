package ra.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {
        String regex = "[ABC]....";//Ký tự đầu tiên là A hoặc B hoặc C
        //Cách 1:
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("A Hai");
        boolean result = matcher.matches();
        System.out.println("Kết quả C1: "+result);
        //Cách 2:
        boolean result2 = Pattern.compile(regex).matcher("A Hai").matches();
        System.out.println("Kết quả C2: "+result2);
        //Cách 3:
        boolean result3 = Pattern.matches(regex,"A Hai");
        System.out.println("Kết quả C3: "+result3);
        //x: so khớp 1 ký tự
        System.out.println("x: "+Pattern.matches("Rikkei","Rikkei"));
        //(ab|cd): là ab hoặc cd
        System.out.println("(ab|cd): "+Pattern.matches("(Ri|Ac)....","Rikkei"));
        //[^abc]: bất cứ ký nào khác a và b và c
        System.out.println("[^abc]: "+Pattern.matches("[^abc]...","Java"));
        //[a-z]: ký tự nằm trong khoảng a-z
        System.out.println("[a-z]: "+Pattern.matches("[a-f]...","bcde"));
        //[a-e[m-p]]: nằm trong khoảng a-e hoặc m-p
        System.out.println("[a-e[m-p]]: "+Pattern.matches("[a-e[m-p]].","na"));
        //[a-e&&[c-p]]: nằm trong khoảng giao giữa 2 khoảng: c,d,e
        System.out.println("[a-e&&[c-p]]: "+Pattern.matches("[a-e&&[c-p]]......","dep zai"));
        //d - digit: ký tự số 0-9
        System.out.println("d: "+Pattern.matches("Java[\\d]","Java8"));
        //D - not digit: không phải ký tự số
        System.out.println("D: "+Pattern.matches("Java[\\D]","Java8"));
        //w - word: là một ký tự
        System.out.println("w: "+Pattern.matches("Java[\\w]","Java*"));
        //W - not word: không phải là một ký tự
        System.out.println("W: "+Pattern.matches("Java[\\W]","Java*"));
        //s - space: là 1 khoảng trắng
        System.out.println("s: "+Pattern.matches("......[\\s].......","Rikkei Academy"));
        //S - not space: không phải là khoảng trắng
        System.out.println("S: "+Pattern.matches("......[\\S].......","Rikkei Academy"));
        //p*: là 0, 1 hoặc nhiều ký tự p
        System.out.println("p*: "+Pattern.matches("a*men","men"));
        System.out.println("p*: "+Pattern.matches("a*men","amen"));
        System.out.println("p*: "+Pattern.matches("a*men","aaaaaaamen"));
        //p+: là 1 hoặc nhiều ký tự p
        System.out.println("p+: "+Pattern.matches("a+men","amen"));
        //p?: là 0 hoặc 1 ký tự p
        System.out.println("p?: "+Pattern.matches("a?men","men"));
        //p{n}: có n ký tự p
        System.out.println("p{n}: "+Pattern.matches("a{3}men","aaamen"));
        //p{n,}: có ít nhất n ký tự p
        System.out.println("p{n,}: "+Pattern.matches("a{3,}men","aamen"));
        //p{n,m}: có từ n đến m ký tự p
        System.out.println("p{n,m}: "+Pattern.matches("a{3,5}men","aaaaaamen"));
        //Quy định số điện thoại Việt Nam gồm 10 số bắt đầu 091, 092,098
        String regexPhone = "(090|091|098)[0-9]{7}";
        System.out.println("Result1: "+Pattern.matches(regexPhone,"0355914029"));
        System.out.println("Result2: "+Pattern.matches(regexPhone,"091234567"));
        System.out.println("Result2: "+Pattern.matches(regexPhone,"0912345678"));
    }
}
