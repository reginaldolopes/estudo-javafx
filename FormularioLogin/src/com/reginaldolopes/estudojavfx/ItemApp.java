package com.reginaldolopes.estudojavfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ItemApp extends Application {

	private AnchorPane pane;
	private ImageView imgItem;
	private Label lbPreco, lbDescricao;
	private Button btAddCarrinho;
	private static Stage stage;
	private static Produto produto;

	@Override
	public void start(Stage stage) throws Exception {
		
		pane = new AnchorPane();
		pane.setPrefSize(600, 400);
		
		lbPreco = new Label();
		lbDescricao = new Label();
		
		btAddCarrinho = new Button();
		
		imgItem = new ImageView(new Image(""));

		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.setTitle("Vitrine - GolFX");
		stage.show();
	}

	public static Stage getStage() {
		return stage;
	}

	public static Produto getProduto() {
		return produto;
	}

	public static void setProduto(Produto produto) {
		ItemApp.produto = produto;
	}

}
