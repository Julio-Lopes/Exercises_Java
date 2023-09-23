package Classes;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Post {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date momento;
    private String titulo;
    private String conteudo;
    private Integer like;

    private List<Comentarios> comentarios = new ArrayList<>();

    public Post(){}

    public Post(Date momento, String titulo, String conteudo, Integer like) {
        this.momento = momento;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.like = like;
    }
    
    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }

    public List<Comentarios> getComentarios() {
        return comentarios;
    }

    public void addComentario(Comentarios comentario){
        comentarios.add(comentario);
    }

    public void remComentario(Comentarios comentario){
        comentarios.remove(comentario);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(titulo + "\n");
        sb.append(like);
        sb.append("Likes - ");
        sb.append(sdf.format(momento) + "\n");
        sb.append(conteudo + "\n" );
        sb.append("Comentarios:\n");
        for (Comentarios c : comentarios){
            sb.append(c.getTexto() + "\n");
        }
        return sb.toString();
    }
    
}