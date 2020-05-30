package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.Pane;

public class MainController {
	@FXML
	private Pane paneText;
	
	@FXML
	private Label text;
	
	@FXML
	private Slider slV;
	
	@FXML
	private Slider slH;
	
	public void horizontal() {
		//text.setX(slH.getValue() * paneText.getWidth() / slH.getMax());
		text.setTranslateX(slH.getValue() * paneText.getWidth() / slH.getMax());
	}
	
	public void vertical() {
		//text.setY(slV.getHeight() - (slV.getValue() * paneText.getHeight() / slV.getMax()));
		text.setTranslateY(slV.getHeight() - (slV.getValue() * paneText.getHeight() / slV.getMax()));
	}
}
