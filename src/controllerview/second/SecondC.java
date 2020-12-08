package controllerview.second;

import controls.QuestionController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class SecondC implements Initializable
{
    private String myData = "";

    QuestionController qC = new QuestionController();

    @FXML
    private TextField question;

    String[] words = {"Softwareentwicklung", "SEW"};

    @FXML
    private TextField answerField;

    public static void show(Stage stage, String greeting)
    {
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader(SecondC.class.getResource("secondV.fxml"));
            Parent root = fxmlLoader.load();

            //send data to MainController
            SecondC ctrl = fxmlLoader.getController();
            ctrl.setMyData(greeting);

            stage.setTitle("Second");
            stage.setScene(new Scene(root, 500, 500));
            stage.show();
        }
        catch (Exception e)
        {
            System.err.println("Something wrong with secondV.fxml: " + e.getMessage());
            e.printStackTrace(System.err);
        }
    }

    public void setMyData(String myData)
    {
        this.myData = myData;
        System.out.println("(MainController) Data received: " + this.myData);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {}

    @FXML
    private void askQuestion()
    {
        boolean outcome = QuestionController.containsWords(question.getText(), words);

        if (outcome)
        {
            answerField.setText(qC.getPositiveAnswer());
        }
        else
            {
                answerField.setText(qC.getNegativeAnswer());
            }
    }
}