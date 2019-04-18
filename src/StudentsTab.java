import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class StudentsTab extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		//BorderPane root = new BorderPane();
		arg0.setTitle("Список студентов");
		BorderPane root = new BorderPane();
		//root.setPadding(new Insets(10,10,10,10));
		//root.setGridLinesVisible(true);

		GridPane second = new GridPane();
		
		Button add = new Button("Добавить");
		Button edit = new Button("Редактировать");
		Button delete = new Button("Удалить");
		second.setPadding(new Insets(10,10,10,10));
		second.add(add, 0, 0);
		second.add(edit, 1, 0);
		second.add(delete, 2, 0);
		
		//---------------------обработчики для кнопок--------------------------
		add.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				StudentAddTab addTab = new StudentAddTab();
				Stage addStage = new Stage();
				try {
					addTab.start(addStage);
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
				StudentAddTab addTab = new StudentAddTab();
				Stage addStage = new Stage();
				try {
					addTab.start(addStage);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		/*@FXML
		TableView<Student> studentTable;
		
		@FXML
		TableColumn<Student, Integer> id_student;
		*/
		
		/*root.setBottom(add);
		root.setAlignment(add, Pos.BOTTOM_LEFT);
		root.setBottom(edit);
		
		root.setAlignment(edit, Pos.BOTTOM_CENTER);
		root.setBottom(delete);
		root.setAlignment(delete, Pos.BOTTOM_RIGHT);
		GridPane table = new GridPane();
		Pane buttonsarea = new Pane();
		Label first = new Label("First");
		*/
		TableView<Student> studentTable = new TableView();
		TableColumn<Student, Integer> id_student = new TableColumn("id");
		TableColumn<Student, String> name = new TableColumn("Имя");
		TableColumn<Student, String> familyname = new TableColumn("Фамилия");
		studentTable.getColumns().addAll(id_student,name,familyname);
		
		
		
		root.setCenter(studentTable);
		root.setBottom(second);
		
		//root.setAlignment(second, Pos.BOTTOM_RIGHT);
		
		ObservableList<Student> studentsData = FXCollections.observableArrayList();
		
		
		//studentTable.getItems().addAll(new Student(1,"Alex","Clare"));
		studentsData.add(new Student(1,"Alex","Clare"));
		
		id_student.setCellValueFactory(new PropertyValueFactory<Student, Integer>("id_student"));
		name.setCellValueFactory(new PropertyValueFactory<Student, String>("name"));
		familyname.setCellValueFactory(new PropertyValueFactory<Student, String>("familyname"));
		
		studentTable.setItems(studentsData);
		//studentsData.add(new Student(1, "Alex", "Clare"));
		
		//studentsData.add(e)
		//tabel.setItems(value);
		//tabel.getColumns().addAll(elements)
		//root.getChildren().addAll(tabel);
		//table.getColumnConstraints().add(new ColumnConstraints(20));
		//table.getColumnConstraints().add(new ColumnConstraints(150));
		//table.setGridLinesVisible(true);
		//table.getChildren().addAll(first);
		arg0.setScene(new Scene(root, 500, 400));
		arg0.show();
		
		
	}

}
