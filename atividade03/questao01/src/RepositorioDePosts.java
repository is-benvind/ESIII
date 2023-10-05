package atividade3.questao01.src;
import java.util.List;

public class RepositorioDePosts {
    private List<Post> posts;
    private Save save;

    public RepositorioDePosts(String path){
        posts= new java.util.ArrayList<Post>();
        save = new Save(path);
    }
    public void adicionarPost(Post post){
        posts.add(post);
    }
    public void excluirPost(Post post){
        posts.remove(post);
    }
    public void salvarPost(){
        for(Post post: posts){
            save.saveToFile(post);
        }
    }
}
