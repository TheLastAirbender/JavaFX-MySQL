import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class StudentAddTab extends Application{

	@Override
	public void start(Stage addStage) throws Exception {
		// TODO Auto-generated method stub
		addStage.setTitle("Добавить/изменить студента");
		GridPane root = new GridPane();
		//root.setGridLinesVisible(true);
		Label l1 = new Label("Имя");
		Label l2 = new Label("Фамилия");
		Label l3 = new Label("Идентификатор студента");
		Button saveButton = new Button("Сохранить");
		Button cancelButton = new Button("Отменить");
		TextField nameField = new TextField("");
		TextField familynameField = new TextField("");
		TextField idstud = new TextField("");
		
		saveButton.setOnAction(new EventHandler<ActionEvent>() {
       	 
            @Override
            public void handle(ActionEvent event) {
            	
            }
        });
		
		cancelButton.setOnAction(new EventHandler<ActionEvent> () {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				addStage.close();
			}
			
		});
		
		root.add(l3, 0, 0);
		root.add(l1, 0, 1);
		root.add(l2, 0, 2);
		root.add(idstud, 1, 0);
		root.add(nameField, 1, 1);
		root.add(familynameField, 1, 2);
		root.add(saveButton, 0, 3);
		root.add(cancelButton, 1, 3);
		
		addStage.setScene(new Scene(root,300,100));
		addStage.setResizable(false);
		addStage.show();
	}

}
