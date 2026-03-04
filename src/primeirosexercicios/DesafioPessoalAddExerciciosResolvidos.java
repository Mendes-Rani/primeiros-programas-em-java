//Nesse desafio, apenas juntei o conhecimento até o momento adquirido
//Ao rodar o programa, deve ser mostrada uma mensagem de boas vindas ao usuário e APRESENTAR SEU NOME
//Tal como apresentar a hora do sistema, o idioma setado e a resolucao utilizada, apenas para preencher os conhecimentos e adicionar uma info a mais
package primeirosexercicios;

import java.awt.*;
import java.util.Date;
import java.util.Locale;

public class DesafioPessoalAddExerciciosResolvidos {
     static void main(String[] args) {

        //pegar o nome de usuário do Sistema
        String username = System.getProperty("user.name"); //instanciando o objeto username

        //pegar a hora do sistema
        Date hora = new Date(); //instanciando o objeto hora

        //pegar o idioma do Sistema
        Locale locale = Locale.getDefault(); //instanciando o objeto locale

        //pegar a resolucao de tela do usuário
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize(); //instanciando o objeto dimension
        int largura = dimension.width; //pegando a largura da tela
        int altura = dimension.height; //pegando a altura da tela

        //imprimir todo resultado na tela
        System.out.println("Bem vindo, " + username);
        System.out.println("Seu horário atual: " + hora);
        System.out.println("Seu Sistema está configurado em: " +  locale.getDisplayName());
        System.out.println("Resolução da tela em " + largura + " x " + altura + "px");

    }
}
