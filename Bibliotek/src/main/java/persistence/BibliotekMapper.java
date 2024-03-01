package persistence;

import entities.Laaner;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BibliotekMapper {

    private Database database;

    public BibliotekMapper(Database database) {
        this.database = database;
    }

    public List<Laaner> getSpecificLaaner() {

        List<Laaner> memberList = new ArrayList<>();

        String sql = "select * " +
                "from laaner " +
                "where laaner_id = 2";

        try (Connection connection = database.connect()) {
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    String  navn = rs.getString("navn");
                    String  adresse = rs.getString("adresse");
                    int lanner_id = rs.getInt("laaner_id");
                    int postnr = rs.getInt("postnr");
                    memberList.add(new Laaner(navn, adresse, postnr, lanner_id));
                }
            } catch (SQLException throwables) {
                // TODO: Make own throwable exception and let it bubble upwards
                throwables.printStackTrace();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return memberList;
    }
}