import java.util.ArrayList;
import java.util.List;

interface Publicavel {
    void exibir();

    Perfil getAutor();
}

public class Perfil {
    private int id;
    private String nomeUsuario;

    public Perfil(int id, String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
        this.id = id;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    // Outros métodos
}

class Postagem implements Publicavel {
    private String id;
    private Perfil autor;
    private String conteudo;
    private List<Reacao> reacoes;
    private List<Comentario> comentarios;

    public Postagem(String id, Perfil autor, String conteudo) {
        this.id = id;
        this.autor = autor;
        this.conteudo = conteudo;
        this.reacoes = new ArrayList<>();
        this.comentarios = new ArrayList<>();
    }

    public void exibir() {
        System.out.println("Postagem [" + id + "] de " + autor.getNomeUsuario() +
                ": " + conteudo);
    }

    public String getId() {
        return id;
    }

    public String getConteudo(){
        return conteudo;
    }

    @Override
    public Perfil getAutor() {
        return autor;
    }

    // outros métodos
}

class Reacao implements Publicavel {
    private Postagem postagem;
    private String tipoReacao;

    public Reacao(String id, Perfil autor, String conteudo, String tipoReacao) {
        this.postagem = new Postagem(id, autor, conteudo);
        this.tipoReacao = tipoReacao;
    }

    @Override
    public void exibir() {
        System.out.println("Reação [" + tipoReacao + "] de " +
                getAutor().getNomeUsuario() + " na postagem " + getId());
    }

    private String getId() {
        return null;
    }

    public Perfil getAutor() {
        return postagem.getAutor();
    }

    // outros métodos
}

class Comentario implements Publicavel {
    private Postagem postagem;
    private Postagem postagemOriginal;

    public Comentario(String id, Perfil autor, String conteudo, Postagem postagemOriginal) {
        this.postagem = new Postagem(id, autor, conteudo);
        this.postagemOriginal = postagemOriginal;
    }

    @Override
    public void exibir() {
        System.out.println("Comentário de " + getAutor().getNomeUsuario() + " em resposta a postagem ["
                + postagemOriginal.getId() + "]: " + conteudo);
    }
    // outros métodos

    @Override
    public Perfil getAutor() {
        return postagem.getAutor();
    }
}