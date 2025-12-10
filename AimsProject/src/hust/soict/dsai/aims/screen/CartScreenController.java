package hust.soict.dsai.aims.screen;

import hust.soict.dsai.aims.cart.Cart;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.media.Media;

public class CartScreenController {
	private Cart cart;
	 
	@FXML
	private Tableview<Media> tblMedia;
	
	@FXML
	private	TableColumn<Media, String> colMediaTitle;
	
	@FXML
	private TableColumn<Media, String> colMediacategory;
	
	@FXML
	private TableColumn<Media, Float> colMediacost;
	
	public CartScreenController(Cart cart) {
		super();
		this.cart = cart;
	}
	
	@FXML
	private void initialize() {
		
		colMediaTitle.setCellValueFactory(
				new PropertyValueFactory<Media, String>("title"));
		colMediaTitle.setCellValueFactory(
				new PropertyValueFactory<Media, String>("category"));
		colMediaTitle.setCellValueFactory(
				new PropertyValueFactory<Media, String>("cost"));
		tblMedia.setItems(this.cart.getItemsOrdered());
		
	}
}
