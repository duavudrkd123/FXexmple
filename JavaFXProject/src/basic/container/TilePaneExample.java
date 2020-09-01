package basic.container;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class TilePaneExample extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		TilePane root = new TilePane();
		root.setPrefTileHeight(100);
		root.setPrefTileWidth(100);
		
		ImageView iv = new ImageView();
		ImageView iv1 = new ImageView();
		ImageView iv2 = new ImageView();
		ImageView iv3 = new ImageView();
		ImageView iv4 = new ImageView();
		
		iv.setPreserveRatio(true);
		iv.setImage(new Image("file:///C:/Users/admin/git/FXexmple/JavaFXProject/src/basic/image/images/fruit1.jpg"));
		iv1.setPreserveRatio(true);
		iv1.setImage(new Image("file:///C:/Users/admin/git/FXexmple/JavaFXProject/src/basic/image/images/fruit2.jpg"));
		iv2.setPreserveRatio(true);
		iv2.setImage(new Image("file:///C:/Users/admin/git/FXexmple/JavaFXProject/src/basic/image/images/fruit4.jpg"));
		iv3.setPreserveRatio(true);
		iv3.setImage(new Image("file:///C:/Users/admin/git/FXexmple/JavaFXProject/src/basic/image/images/fruit3.jpg"));
		iv4.setPreserveRatio(true);
		iv4.setImage(new Image("file:///C:/Users/admin/git/FXexmple/JavaFXProject/src/basic/image/images/fruit5.jpg"));

		HBox hbox = new HBox();
		hbox.setAlignment(Pos.CENTER); //정렬하려면 적으면 된다
		hbox.setSpacing(20);
		
		root.getChildren().add(iv);
		root.getChildren().add(iv1);
		root.getChildren().add(iv2);
		root.getChildren().add(iv3);
		root.getChildren().add(iv4);
		
		Scene scene = new Scene(root); //스테이지(신(컨테이너))
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setTitle("VBox 예제");
	}
	public static void main(String[] args) {
		Application.launch(args);
	}

}
