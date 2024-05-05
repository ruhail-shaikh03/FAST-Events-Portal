package sample;



import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

public class popup_controller {

    public ScrollPane scrollPane;
    @FXML
    private Label headerLabel;

    @FXML
    private Label textLabel;

    // Method to set the content of the popup
    public void setContent(String header, String text) {
        headerLabel.setText(header);
        textLabel.setText(text);
    }

    // Method to close the popup
    @FXML
    private void closePopup() {
        Stage stage = (Stage) headerLabel.getScene().getWindow();
        stage.close();
    }
}



