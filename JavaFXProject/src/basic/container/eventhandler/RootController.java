package basic.container.eventhandler;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.text.Font;

// 이벤트 처리 하는 클래스
public class RootController implements Initializable {
	@FXML Label label;
	@FXML Slider slider;
	

	@Override
	public void initialize(URL location, ResourceBundle resource) {
		slider.valueProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> obervable, Number startValue, Number endValue) {
				System.out.println("starValue: " + startValue.doubleValue());
				System.out.println("endValue: " + endValue.doubleValue());
				label.setFont(new Font(endValue.doubleValue()));
				
			}
			
		});
		
	}

}
