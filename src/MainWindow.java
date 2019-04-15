import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
        primaryStage.setTitle("������������ ��������� v.1.0");
        MenuBar mainmenu = new MenuBar();
        
        Menu maintables = new Menu("�������� �������");
        Menu secondarytables = new Menu("�������������� �������");
        Menu studyplan = new Menu ("������� ����");
        Menu examsplan = new Menu("���� ���������");
        Menu studentcard = new Menu("������� ����� ��������");
        
        MenuItem speciality = new MenuItem("�������������");
        MenuItem groups = new MenuItem("������");
        MenuItem students = new MenuItem("��������");
        MenuItem subjects = new MenuItem("��������");
        MenuItem subjOnSpec = new MenuItem("�������� �� �������������");
        MenuItem session = new MenuItem("������");
        
        maintables.getItems().addAll(speciality, groups, students, subjects);
        secondarytables.getItems().addAll(subjOnSpec, session);
        mainmenu.getMenus().addAll(maintables, secondarytables, studyplan, examsplan, studentcard);
        
        speciality.setOnAction(new EventHandler<ActionEvent>() {
        	 
            @Override
            public void handle(ActionEvent event) {
                SpecialityTab specTab = new SpecialityTab();
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
        primaryStage.setScene(new Scene(root, 800, 500));
        primaryStage.show();
    }

}
