import edu.model.Iphone;
public class App {
    public static void main(String[] args) throws Exception {
        Iphone meuIphone = new Iphone();
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.parar();
        meuIphone.discar("123456789");
        meuIphone.atender();
        meuIphone.desligar();
        meuIphone.carregarPagina("www.example.com");
        meuIphone.navegarParaTras();
        meuIphone.navegarParaFrente();
    }
}
