package hust.soict.dsai.javafx;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.RadioButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PainterController {
	@FXML
	private Pane drawingAreaPane;
	
	@FXML
	void clearButtonPressed(ActionEvent event) {
		drawingAreaPane.getChildren().clear();
	}
	
	@FXML
	void drawingAreaMouseDragged(MouseEvent event) {
		Circle newCircle = new Circle(event.getX(), event.getY(), 4, Color.BLACK);
		drawingAreaPane.getChildren().add(newCircle);
	}
	
	@FXML private Canvas canvas;
	
	@FXML private RadioButton rbPen;
	
	@FXML private RadioButton rbEraser;
	
	private GraphicsContext gc;
	
	@FXML
	public void initialize() {
	    gc = canvas.getGraphicsContext2D();

	    rbPen.setSelected(true);

	    setupDrawing();
	}
	
	private void setupDrawing() {

	    canvas.setOnMousePressed(e -> {
	        gc.beginPath();
	        gc.moveTo(e.getX(), e.getY());
	        gc.stroke();
	    });

	    canvas.setOnMouseDragged(e -> {

	        if (rbPen.isSelected()) {
	            gc.setStroke(Color.BLACK);  
	            gc.setLineWidth(2);
	        }

	        if (rbEraser.isSelected()) {
	            gc.setStroke(Color.WHITE);  
	            gc.setLineWidth(10);        
	        }

	        gc.lineTo(e.getX(), e.getY());
	        gc.stroke();
	    });
	}
}
