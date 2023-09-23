package Classes;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {
    private Integer numeroQuarto;
    private Date checkIn;
    private Date checkOut;
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    public Reserva(Integer numeroQuarto, Date checkIn, Date checkOut) {
        if(!checkOut.after(checkIn)){
            throw new IllegalArgumentException("Check-Out deve ser maior que data de Check-In");
        }
        this.numeroQuarto = numeroQuarto;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(Integer numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long duracao(){
        long dif = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(dif, TimeUnit.MILLISECONDS);
    }

    public void atualizarDatas(Date checkIn, Date checkOut){
        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)){
            throw new IllegalArgumentException("Atualizações de reservas devem ser feitas com datas futuras");
        }if(!checkOut.after(checkIn)){
            throw new IllegalArgumentException("Check-Out deve ser maior que data de Check-In");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Quarto: " + numeroQuarto + ", check-In: " + sdf.format(checkIn) + ", check-Out: " + sdf.format(checkOut) + ", " + duracao() + " noites";
    }
}
