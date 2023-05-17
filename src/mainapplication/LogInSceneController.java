
package mainapplication;

import java.io.FileInputStream;
import java.lang.UnsupportedOperationException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author LENEVO
 */
public class LogInSceneController implements Initializable {

    @FXML
    private TextField idField;
    @FXML
    private PasswordField passwordField;
    
    String userType;
    User x;
    @FXML
    private ComboBox<String> comboBoxType;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        comboBoxType.getItems().addAll("Student","Faculty"
            ,"Monitor","Local Guide","Venue Manager");
        comboBoxType.setValue("Choose you type");
    }

    @FXML
    private void LogInbuttonOnAction(ActionEvent event) {
        
        System.out.println("login Pressed");
        ObjectInputStream ois=null;
        
        
         try {
            ois = new ObjectInputStream(new FileInputStream("UserObjects.bin"));
            while(true){
                x = (User) ois.readObject();
               
                if (x.getId().equals(idField.getText())){
                    if (x.getPassword().equals(passwordField.getText())){
                        if(x.getType().equals(comboBoxType.getValue())){
                            userType = comboBoxType.getValue();
                        System.out.println("Successful");
                        System.out.println(userType);
                            goToScene(userType,event);
                            break;
                        }
                    }
                }
            }
                       
        } catch (IOException | ClassNotFoundException ex ) {
             System.out.println(ex);
             
                Alert a = new Alert(Alert.AlertType.ERROR); 
                a.setContentText("Login Failed");
                a.showAndWait();
            try {
                if(ois!=null)
                    ois.close();

            } catch (IOException ex1) {
                Alert e = new Alert(Alert.AlertType.ERROR); 
                e.setContentText("Login Failed");
                e.showAndWait();            
            }           
        }                
    }
    
    private void goToScene(String userType, ActionEvent event) throws IOException {
            switch (userType) {
            case "Student":
                {
                        FXMLLoader loader = new FXMLLoader();
                        loader.setLocation(getClass().getResource("StdHomePage.fxml"));
                        Parent parent = loader.load();
                        Scene scene = new Scene(parent);
                        StdHomePageController controller = loader.getController();
                        controller.data(x);
                        
                        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                        window.setScene(scene);
                        window.show();
                    break;
                }

            case "Admin":
                {
                        FXMLLoader loader = new FXMLLoader();
                        loader.setLocation(getClass().getResource("AdmHomePage.fxml"));
                        Parent parent = loader.load();
                        Scene scene = new Scene(parent);
                        AdmHomePageController controller = loader.getController();
                        
                        controller.data(x);
                        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                        window.setScene(scene);
                        window.show();
                    break;
                }                
                default:
                    break;                
            }
    }    

    @FXML
    private void exitBtnOnClick(MouseEvent event) {
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.close();        
    }
    
    
}
