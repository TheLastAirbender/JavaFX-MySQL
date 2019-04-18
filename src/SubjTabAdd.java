import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SubjTabAdd extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Добавить/изменить группу");
		GridPane root = new GridPane();
		Label l1 = new Label("Идентификатор предмета");
		Label l2 = new Label("Название предмета");
		TextField idField = new TextField("");
		TextField nameField = new TextField("");
		Button saveButton = new Button("Сохранить");
		Button cancelButton = new Button("Отменить");
		
		saveButton.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		cancelButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				primaryStage.close();
			}
			
		});
		
		root.add(l1,0,0);
		root.add(idField, 1, 0);
		root.add(l2, 0, 1);
		root.add(nameField, 1, 1);
		root.add(saveButton, 0, 2);
		root.add(cancelButton, 1, 2);
		primaryStage.setScene(new Scene(root,300,100));
		primaryStage.setResizable(false);
		primaryStage.show();
	}

}
