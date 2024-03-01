import entities.Laaner;
import persistence.Database;
import persistence.BibliotekMapper;

import java.util.List;

public class Main {

    private final static String USER = "postgres";
    private final static String PASSWORD = "postgres";
    private final static String URL = "jdbc:postgresql://localhost:5432/Bib?serverTimezone=CET&useSSL=false&allowPublicKeyRetrieval=true";

    public static void main(String[] args) {
        Database db = new Database(USER, PASSWORD, URL);
        BibliotekMapper memberMapper = new BibliotekMapper(db);
        List<Laaner> laaners = memberMapper.getSpecificLaaner();
        System.out.println("Låner hvis ID = 2");
        laaners.forEach(System.out::println);
    }
}
