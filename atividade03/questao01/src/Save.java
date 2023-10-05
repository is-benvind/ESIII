package atividade3.questao01.src;

import java.io.FileWriter;
import java.io.IOException;

public class Save {
    private String filePath;

    public Save(String filePath){
        this.filePath = filePath;
    }

    public void saveToFile(Post post) {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("ID: " + post.getId() + "\n");
            writer.write("Texto: " + post.getTexto() + "\n");
            writer.write("Autor: " + post.getAutor().getNome() + "\n");
            writer.write("Data: " + post.getData() + "\n");
            writer.write("Quantidade de Likes: " + post.getQuantidadeDeLikes() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}