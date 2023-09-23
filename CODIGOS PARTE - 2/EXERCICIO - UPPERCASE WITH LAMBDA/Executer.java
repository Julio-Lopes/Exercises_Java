import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import Class.Product;


public class Executer {
    public static void main(String[] Args){
        Locale.setDefault(Locale.US);
        
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 80.90));

        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

        names.forEach(System.out::println);
    }
}