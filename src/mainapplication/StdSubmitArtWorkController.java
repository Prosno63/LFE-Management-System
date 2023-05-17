
package mainapplication;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author LENEVO
 */
public class StdSubmitArtWorkController implements Initializable {

    @FXML
    private TextField GroupIdField;
    @FXML
    private TextField TopicIdField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void BackToHomeButtonOnAction(ActionEvent event) throws IOException {
         Parent parent = FXMLLoader.load(getClass().getResource("StdHomePage.fxml"));
         Scene scene = new Scene(parent);
         Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        
         stage.setScene(scene);
         stage.show();
    }

    @FXML
    private void UploadButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void SubmitButtonOnClick(ActionEvent event) {
    }

}

