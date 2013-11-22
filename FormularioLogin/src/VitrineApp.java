import javafx.application.Application;
import javafx.stage.Stage;

public class VitrineApp extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {

	}

	public class ItensProperty {
		private SimpleStringProperty produto;
		private SimpleDoubleProperty preco;
		
		private ItensProperty(String produto, double preco){
			this.produto = new SimpleStringProperty(produto);
			this.preco = new SimpleDoubleproperty(preco);
		}
		
		public String getProduto(){
			return produto.get();
		}
		
		public void setProduto(String produto){
			this.produto.set(produto);
		}
		
		public Double getPreco(){
			return preco.get();
		}
		
		public void setPreco(double preco){
			this.double.set(preco);
		}
	}

}
