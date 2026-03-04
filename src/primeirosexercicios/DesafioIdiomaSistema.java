package primeirosexercicios;

import java.util.Locale;

public class DesafioIdiomaSistema {
     static void main(String[] args) {
        Locale locale = Locale.getDefault(); //instanciei meu objeto
        System.out.printf("Seu sistema está em " + locale.getDisplayLanguage() + "\n"); //usei o método getDisplayLanguage para retornar a linguagem do Sistema
    }
}
