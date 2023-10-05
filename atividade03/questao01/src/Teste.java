package atividade3.questao01.src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Teste {
    private List<String> linhasLidas = new ArrayList<>();

    public static void main(String[] args) {
        Teste teste = new Teste();
        teste.testeInstancia();
        teste.testeEscrita();
        teste.testeLeitura();
    }

    public void testeInstancia() {
        Autor euAutor = new Autor(1, "israel", "israelbenvindo2@gmail.com");
        Post meuPost = new Post(1, "Show", euAutor, new Date());
    }

    public void testeEscrita() {
        try (BufferedReader reader = new BufferedReader(new FileReader("posts.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                linhasLidas.add(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void testeLeitura() {
        for (String linha : linhasLidas) {
            System.out.println(linha);
        }
    }
}
