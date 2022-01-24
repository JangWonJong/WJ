import java.util.Scanner;

public class LoginDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoginAPP loginAPP = new LoginAPP();
        System.out.println(LoginAPP.website);
        System.out.println("ID : ");
        System.out.println("PW : ");
        System.out.println("Name : ");
        String id = scanner.next();
        String pw = scanner.next();
        String name = scanner.next();
        String result = loginAPP.login(id , pw, name);
        System.out.println(result);
    }
}
