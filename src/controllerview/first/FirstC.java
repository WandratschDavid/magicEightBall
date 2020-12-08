package controllerview.first;

import controllerview.second.SecondC;
import controls.LoginController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class FirstC implements Initializable
{
    private Stage stage;

    @FXML
    private TextField name;

    @FXML
    private TextField password;

    LoginController loginController = new LoginController();

    public static void show(Stage stage)
    {
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader(FirstC.class.getResource("firstV.fxml"));
            Parent root = fxmlLoader.load();

            //get controller which is connected to this fxml file
            FirstC ctrl = fxmlLoader.getController();
            ctrl.stage = stage;

            stage.setTitle("Magic 8 Ball - Login");
            stage.setScene(new Scene(root, 400, 400));
            stage.show();
        }
        catch (IOException e)
        {
            System.err.println("Something went wrong with firstV.fxml: " + e.getMessage());
            e.printStackTrace(System.err);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {}

    @FXML
    private void doLogin()
    {
        if (loginController.isCorrectLogin(name.getText(), password.getText()))
        {
            //navigate from login screen to question screen
            System.out.println("User logged in ...");

            SecondC.show(new Stage(),"Switched to question window!");
            stage.close();
        }
        else
            {
                System.out.println("Wrong userdata input!!!");
                System.out.println("Please enter the correct credentials!");
        }
    }
}