package homework_06;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) 
    {
        System.out.println("\nВыбор ноутбука:");
        Set<Notebook> set = new HashSet<>();
        set.add(new Notebook
        ("001", 16, "Windows", 1024, "Samsung"));
        set.add(new Notebook
        ("002", 4, "Windows", 1024, "Lenovo"));
        set.add(new Notebook
        ("003", 8, "linux", 256, "Asus"));
        set.add(new Notebook
        ("004", 8, "Mac", 512, "Apple"));
        set.add(new Notebook
        ("005", 16, "Windows", 512, "Lenovo"));
        set.add(new Notebook
        ("006", 16, "Mac", 1024, "Apple"));        
        Operation operation = new Operation(set);
        operation.start();        

    }
}
