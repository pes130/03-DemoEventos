package es.cursojavafx.demoeventos;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class ActionsDemo01 extends Application {
	
	private int contador = 0;
	
	@Override
	public void start(Stage primaryStage) {
		VBox vbox = new VBox();
		Button btnSumar = new Button("Sumar");
		Button btnReiniciar = new Button("Reiniciar");
		Label lblResultado = new Label("0");	
		vbox.getChildren().addAll(btnSumar, btnReiniciar, lblResultado);
		
		// Asociar evento con lambda expression
		btnSumar.setOnAction( event -> {
			contador++;
			lblResultado.setText(String.valueOf(contador));
		});
		
		// ASociar evento con clase anónima
		btnReiniciar.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				contador = 0;
				lblResultado.setText(String.valueOf(contador));	
			}	
		});
		
		// Añadimos un evento al label para cuando pasemos el ratón por encima
		lblResultado.setOnMouseEntered(event -> {
			lblResultado.setFont(new Font(20));
		});
		
		lblResultado.setOnMouseExited(event -> {
			lblResultado.setFont(new Font(11));
		});
		
		
		
		
		Scene scene = new Scene(vbox, 150, 150);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
