package db;

public class DbExcpetion extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public DbExcpetion(String msg){
        super(msg);
    }
}
