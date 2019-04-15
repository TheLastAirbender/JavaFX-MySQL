import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SpecialityAddTab extends Application{

	@Override
	public void start(Stage addStage) throws Exception {
		// TODO Auto-generated method stub
		addStage.setTitle("Добавить/изменить студента");
		GridPane root = new GridPane();
		root.setGridLinesVisible(true);
		Label l1 = new Label("Имя");
		Label l2 = new Label("Фамилия");
		Button saveButton = new Button("Сохранить");
		Button cancelButton = new Button("Отменить");
		TextField nameField = new TextField("");
		TextField familynameField = new TextField("");
		
		root.add(l1, 0, 0);
		root.add(l2, 0, 1);
		root.add(nameField, 1, 0);
		root.add(familynameField, 1, 1);
		root.add(saveButton, 0, 2);
		root.add(cancelButton, 1, 2);
		
		addStage.setScene(new Scene(root,300,100));
		addStage.show();
	}

}
