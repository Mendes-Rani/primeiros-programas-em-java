package primeirosexercicios;

import java.awt.*;

public class DesafioResolucaoTela {
     static void main(String[] args) {
        //crio o objeto telaResolution e com o metodo a frente, obtenho o tamanho da tela
        Dimension telaResolution = Toolkit.getDefaultToolkit().getScreenSize();

        //obtem largura e altura da tela
        int largura = telaResolution.width;
        int altura = telaResolution.height;

        //Imprimo na tela a resolucao
        System.out.println("Sua tela tem resolução " + largura + " x " + altura);
    }
}
