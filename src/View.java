import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class View  extends GridPane {
    private final Controller controller;
    private Label label;
    public View() {
        controller = new Controller(this);
        HBox hbox = new HBox();
        System.out.println("View is ready for rendering");
        Button btn = new Button("Click");
        btn.setId("Btn1");
        label = new Label("Empty");
        hbox.getChildren().addAll(btn,label);
        getChildren().add(hbox);
        btn.setOnAction(controller::onClick);
    }

    public void setLabel(String t) {
        label.setText(t);
    }
}