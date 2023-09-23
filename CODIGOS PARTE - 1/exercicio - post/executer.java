import java.text.ParseException;
import java.text.SimpleDateFormat;

import Classes.Comentarios;
import Classes.Post;

public class executer {
    public static void main(String[] args) throws ParseException {

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

            Comentarios c1 = new Comentarios("Tenha uma boa viagem");
            Comentarios c2 = new Comentarios("que legal!");

            Post p1 = new Post(sdf.parse("21/06/2023 13:40:22"), "Traveling for another country", "It's my dream!", 12);

            p1.addComentario(c1);
            p1.addComentario(c2);

            System.out.println(p1);
        
    }
}