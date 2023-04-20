import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main (String [] args){
        System.out.println("ВВедите строку");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        Pattern p = Pattern.compile("((25[0-5]\\.)|(2[0-4]\\d\\.)|(1\\d\\d\\.)|(\\d\\d\\.)|(\\d\\.)){3}((25[0-5])|(2[0-4]\\d)|(1\\d\\d)|(\\d\\d)|(\\d))");
        Matcher m = p.matcher(id);
        if (m.find()){
            System.out.println("Ваш ip:");
            System.out.println(id.substring(m.start(), m.end()));
        }
        else{
            System.out.println("ip не найден");
        }
    }
}