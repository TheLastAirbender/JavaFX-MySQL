import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.control.*;

public class MainWindow extends Application{

	public static void main(String[] args) {
		launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Успеваемость студентов v.1.0");
        //Class<?> clazz = new MyClass.class;
        //InputStream input = 
        Image image = new Image("/pics/DB.png");
        ImageView back = new ImageView(image);
        MenuBar mainmenu = new MenuBar();
        
        Menu maintables = new Menu("Основные таблицы");
        Menu secondarytables = new Menu("Второстепенные таблицы");
        Menu studyplan = new Menu ("Учебный план");
        Menu examsplan = new Menu("План экзаменов");
        Menu studentcard = new Menu("Учебная карта студента");
        
        MenuItem speciality = new MenuItem("Специальности");
        MenuItem groups = new MenuItem("Группы");
        MenuItem students = new MenuItem("Студенты");
        MenuItem subjects = new MenuItem("Предметы");
        MenuItem subjOnSpec = new MenuItem("Предметы по специальности");
        MenuItem session = new MenuItem("Сессии");
        
        maintables.getItems().addAll(speciality, groups, students, subjects);
        secondarytables.getItems().addAll(subjOnSpec, session);
        mainmenu.getMenus().addAll(maintables, secondarytables, studyplan, examsplan, studentcard);
        
        /*пример обработчика нажатия:
         button.setOnAction(new EventHandler<ActionEvent>() {
        	 
            @Override
            public void handle(ActionEvent event) {
        	});
        */
        
        speciality.setOnAction(new EventHandler<ActionEvent>() {
        	 
            @Override
            public void handle(ActionEvent event) {
            	SpecTab specTab = new SpecTab();
                Stage arg0 = new Stage();
                try {
					specTab.start(arg0);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            	//label.setText(new Date().toString());
            }
        });
        
        students.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				StudentsTab studTab = new StudentsTab();
				Stage primaryStage = new Stage();
				try {
					studTab.start(primaryStage);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
        	
        });
        
        groups.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				GroupsTab grpTab = new GroupsTab();
				Stage primaryStage = new Stage();
				try {
					grpTab.start(primaryStage);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
        	
        });
        
        subjects.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				SubjTab subjTab = new SubjTab();
				Stage primaryStage = new Stage();
				try {
					subjTab.start(primaryStage);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
        	
        });
        /*Button btn = new Button();
        //btn.setText("Say 'Hello World'");
        //btn.setOnAction(new EventHandler<ActionEvent>() {
 
            //@Override
            //public void handle(ActionEvent event) {
                //NewWindow win = new NewWindow();
                //Stage secondStage = new Stage();
                //secondStage.initModality(Modality.APPLICATION_MODAL);
                //win.open(secondStage);
            	//System.out.println("Hello World!");
            //}
        //});
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();*/
        
        //StackPane root = new StackPane();
        BorderPane root = new BorderPane();
        root.setTop(mainmenu);
        root.setCenter(back);
        primaryStage.setScene(new Scene(root, 800, 500));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

}
