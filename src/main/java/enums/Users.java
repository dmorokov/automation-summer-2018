package enums;

/**
 * Created by Danila_Morokov on 5/25/2018.
 */
public enum Users {

    PITER_CHAILOVSKII("PITER CHAILOVSKII", "epam", "1234");

    public String name;
    public String login;
    public String password;

    Users(String name, String login, String password) {
        this.name = name;
        this.login = login;
        this.password = password;
    }
}
