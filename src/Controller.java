import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class Controller {
    private final Model model;
    public Controller(View view) {
    	this.model = new Model(view);
        System.out.println("Controller is ready to receive actions");
    }

    public void onClick(ActionEvent event) {
        Button source = (Button)event.getSource();
        model.setSMth( source.getId());
    }
}