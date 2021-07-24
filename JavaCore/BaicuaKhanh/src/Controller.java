import java.util.List;
import java.util.Scanner;

public class Controller {
    Repository repository = new Repository();
    List<User> users = repository.getData();
    User userOld;
    Scanner sc = new Scanner(System.in);
    public void login(){
        System.out.println( "Ten dang nhap cua ban: ");
        String login = sc.nextLine();
        System.out.println("Mat khau cua ban la: ");
        String pw = sc.nextLine();
        for(User user: users){
            if(user.getUsername().equals(login) && user.getPassword().equals(pw)){
                userOld = user;
                System.out.println("Chao mung " + user.getUsername() + "ban co the su dung cac chuc nang sau: ");
                System.out.println("1 - Thay đổi username");
                System.out.println("2 - Thay đổi email");
                System.out.println("3 - Thay đổi mật khẩu");
                System.out.println("4 - Đăng xuất");
                System.out.println("0 - Thoát chương trình");
                int choose_login = sc.nextInt();
                switch (choose_login){
                    case 1: changeUsername();
                    case 2: changeEmail();
                    case 3: changePassword();
                    case 4: login();
                    case 5: System.exit(0);
                }
            }else if(!user.getUsername().equals(login)){
                System.out.println("Kiem tra lai username");

                login();
            }else if(!user.getPassword().equals(pw)){
                System.out.println("1 - Đăng nhập lại");
                System.out.println("2 - Quên mật khẩu");
                int choose = sc.nextInt();
                switch (choose){
                    case 1: login();
                    case 2: forgotPassword();
                }
            }
        }
    }

    public void changePassword(){
        //Thay đổi mật khẩu
        System.out.print("Nhap mat khau cu: ");
        String passwordOld = Validate.validatePassword(sc.next());

        if (userOld.getPassword().equals(passwordOld)) {
            System.out.print("Nhap mat khau moi: ");
            String passwordNew = Validate.validatePassword(sc.next());

            userOld.setPassword(passwordNew);
            System.out.print("Đổi mật khẩu thành công");
        } else {
            System.out.println("Mat khau cu khong dung");
        }
    }

    public void changeUsername(){
        //Thay đổi username
        System.out.print("Nhap tai khoan: ");
        String username = sc.next();

        userOld.setUsername(username);
        System.out.println("Đổi tên thành công");
    }

    public void changeEmail(){
        //Thay đổi email
        System.out.print("Nhap email: ");
        String email = Validate.validateEmail(sc.next());

        userOld.setEmail(email);
        System.out.print("Đổi email thành công");
    }

    public void forgotPassword(){
        //Quên mật khẩu
        System.out.print("Để cấp lại mật khẩu vui lòng nhập email của bn\nNhap email: ");
        String email = Validate.validateEmail(sc.next());

        if (users.stream().anyMatch(i -> i.getEmail().equals(email))) {
            // changePassword();
            System.out.print("Nhap mat khau moi: ");
            String passwordNew = Validate.validatePassword(sc.next());

            userOld.setPassword(passwordNew);
            System.out.print("Đổi mật khẩu thành công");
            login();
        } else {
            System.out.print("Email này chưa được đăng kí tài khoản.\nBạn muốn đăng ký tài khoản không(Y/N): ");
            String chon = sc.next().charAt(0) + "";
            if (chon.toLowerCase().equals("Y".toLowerCase())) {
                createNewAccount();
            } else if (chon.toLowerCase().equals("N".toLowerCase())) {
                System.out.println("~_~");
            } else {
                System.out.println("Không có lựa chọn này");
            }
        }

    }

    public void createNewAccount(){
        //Tạo tài khoản mới
        System.out.print("Nhap tai khoan: ");
        String username = sc.next();

        if (!users.stream().anyMatch(i -> i.getUsername().equals(username))) {
            System.out.print("Nhap email: ");
            String email = Validate.validateEmail(sc.next());

            if (!users.stream().anyMatch(i -> i.getEmail().equals(email))) {
                System.out.print("Nhap mat khau: ");
                String password = Validate.validatePassword(sc.next());

                users.add(new User(username, email, password));
                System.out.println("Đã tạo tài khoản mới");
            } else {
                System.out.println("Email da ton tai");
            }
        } else {
            System.out.println("Ten tai khoan da ton tai");
        }

        login();
    }
}
