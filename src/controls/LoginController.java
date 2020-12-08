package controls;

public class LoginController
{
    String username = "user";
    String userpassword = "passwort";

    public boolean isCorrectLogin(String name, String password)
    {
        boolean loginData = false;

        if (name.equals(username) && password.equals(userpassword))
            loginData = true;

        return loginData;
    }
}