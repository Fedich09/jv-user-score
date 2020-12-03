package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        String[] emails = new String[]{"user@yahoo.com:1", "testEmail@gmail.com:100",
                "second-user@gmail.com:20"};
        UserService userService = new UserService();
        System.out.println(userService.getUserScore(emails, "testEmail@gmail.com"));
    }
}
