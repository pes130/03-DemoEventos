package es.cursojavafx.demoeventos.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;

public class ActionDemoControllerFXML02 {

	private int contador = 0;
	@FXML
	private Button btnSumar;

	@FXML
	private Button btnReiniciar;

	@FXML
	private Label lblContador;

	@FXML
	void incrementarContador(ActionEvent event) {
		this.contador++;
		this.lblContador.setText(String.valueOf(this.contador));
	}

	@FXML
	void incrementarFuente(MouseEvent event) {
		this.lblContador.setFont(new Font(30));
	}

	@FXML
	void reestablecerFuente(MouseEvent event) {
		this.lblContador.setFont(new Font(11));
	}

	@FXML
	void reiniciarContador(ActionEvent event) {
		this.contador = 0;
		this.lblContador.setText(String.valueOf(this.contador));
	}
}
