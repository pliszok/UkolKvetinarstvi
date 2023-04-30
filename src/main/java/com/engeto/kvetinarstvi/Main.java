package com.engeto.kvetinarstvi;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kvetinarstvi","zahradnik","Heslo123");
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("select*from flowers");
        while (resultSet.next())
            System.out.println(resultSet.getString("name"));

//        statement.executeUpdate("insert into flowers (name) values ('Bledule')");
//        statement.executeUpdate("insert into flowers (name) values ('Kopretina')");

//        statement.executeUpdate("update flowers set poisonous=0");
//
//        "sloupec pooisonous jsem měl jako varchar, aby šel změnit na boolean, musel jsem tam nejdříve nastavit hodnotu.
//        Implicitně tam bylo null a to házelo chybu."

//        statement.executeUpdate("update flowers set description='Pozor na cibulku - obsahuje největší koncentraci jedu!' where name='Bledule'");

//        statement.executeUpdate("update flowers set colour='bílá' where name='Bledule'");

//        statement.executeUpdate("update flowers set colour='bílá', description='z čeledi hvězdnicovitých' where name='Kopretina'");

//        statement.executeUpdate("update flowers set poisonous='1' where name='Bledule'");

        statement.executeUpdate("delete from flowers where poisonous='1'");
    }
}