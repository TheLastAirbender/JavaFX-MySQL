

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GroupsTab extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Список специальностей");
		BorderPane root = new BorderPane();
		//root.setPadding(new Insets(10,10,10,10));
		//root.setGridLinesVisible(true);

		GridPane second = new GridPane();
		
		TableView groupsTable = new TableView();
		TableColumn id_group= new TableColumn("Идентификатор группы");
		
		groupsTable.getColumns().addAll(id_group);
		
		Button add = new Button("Добавить");
		Button edit = new Button("Редактировать");
		Button delete = new Button("Удалить");
		second.setPadding(new Insets(10,10,10,10));
		second.add(add, 0, 0);
		second.add(edit, 1, 0);
		second.add(delete, 2, 0);
		
		//------------обработчики нажатий----------------
				add.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						GroupAddTab addTab = new GroupAddTab();
						Stage primaryStage = new Stage();
						try {
							addTab.start(primaryStage);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
				});
				
				edit.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						GroupAddTab addTab = new GroupAddTab();
						Stage primaryStage = new Stage();
						try {
							addTab.start(primaryStage);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
				});		
		
		root.setCenter(groupsTable);
		root.setBottom(second);
		
		primaryStage.setScene(new Scene(root, 500,400));
		primaryStage.show();
	}

}
