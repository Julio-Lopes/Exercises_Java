import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import Classes.Reserva;

public class executer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try{
            System.out.print("Numero do quarto: ");
            int numero = sc.nextInt();
            System.out.println("Data check-in (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next());
            System.out.println("Data check-out (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());

            Reserva reserva = new Reserva(numero, checkIn, checkOut);
            System.out.println("Reserva: " + reserva);

            System.out.println();
            System.out.println("Entre com as datas para atualizar a reserva: ");
            System.out.println("Data check-in (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.println("Data check-out (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            reserva.atualizarDatas(checkIn, checkOut);
            System.out.println("Reserva: " + reserva);
        }catch(ParseException e){
            System.out.println("Data invalida");
        }catch(IllegalArgumentException e){
            System.out.println("Erro na reserva: " + e.getMessage());
        }
        sc.close();
    }
}