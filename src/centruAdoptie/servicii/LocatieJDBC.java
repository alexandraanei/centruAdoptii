package centruAdoptie.servicii;

import centruAdoptie.modele.Locatie;

import java.sql.*;

public class LocatieJDBC {
    private static LocatieJDBC ourInstance = new LocatieJDBC();

    public static LocatieJDBC getInstance() {
        return ourInstance;
    }

    private LocatieJDBC() {
    }

    public void CreeazaTabelaLocatie(){

        ServiciuAudit.getInstance().writeLogLine("Creeaza tabela Locatie JDBC");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC",
                    "root", "admin");
            Statement statement = connection.createStatement();

            statement.executeUpdate("CREATE TABLE `sys`.`locatie` (\n" +
                    "  `oras` VARCHAR(45) NOT NULL,\n" +
                    "  `judet` VARCHAR(45) NOT NULL,\n" +
                    "  `strada` VARCHAR(45) NOT NULL,\n" +
                    "  `numar` VARCHAR(45) NOT NULL,\n" +
                    "  PRIMARY KEY (`strada`));");



        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void AdaugaLocatie(Locatie locatie){

        ServiciuAudit.getInstance().writeLogLine("Adauga locatie JDBC");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC",
                    "root", "admin");
            PreparedStatement preparedStatement = null;

            String comanda = "INSERT INTO locatie(oras, judet, strada, numar) values(?,?,?,?)";


            preparedStatement = connection.prepareStatement(comanda);
            preparedStatement.setString(1, locatie.getOras());
            preparedStatement.setString(2, locatie.getJudet());
            preparedStatement.setString(3, locatie.getStrada());
            preparedStatement.setString(4, locatie.getNumar());


            preparedStatement.executeUpdate();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void UpdateLocatie(String update, String oras, String judet, String strada, String numar){

        ServiciuAudit.getInstance().writeLogLine("Update locatie JDBC");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC",
                    "root", "admin");
            PreparedStatement preparedStatement = null;

            String comanda = "UPDATE locatie SET oras = ?, judet = ?, new_strada = ?, numar = ? WHERE strada = ?";
            preparedStatement = connection.prepareStatement(comanda);
            preparedStatement.setString(1, oras);
            preparedStatement.setString(2, judet);
            preparedStatement.setString(3, strada);
            preparedStatement.setString(4, numar);
            preparedStatement.setString(5, update);

            preparedStatement.executeUpdate();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void CitesteLocatie(){

        ServiciuAudit.getInstance().writeLogLine("Citeste locatie JDBC");


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC",
                    "root", "admin");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * from locatie");

            while (resultSet.next()) {
                System.out.println("oras=" + resultSet.getString(1)
                        + ", judet=" + resultSet.getString(2)
                        + ", strada=" + resultSet.getString(3)
                        + ", numar=" + resultSet.getString(4));

            }



        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public void StergeLocatie(String strada){

        ServiciuAudit.getInstance().writeLogLine("Sterge locatie JDBC");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC",
                    "root", "admin");
            PreparedStatement preparedStatement = null;

            String comanda = "DELETE from locatie WHERE strada = ?";

            preparedStatement = connection.prepareStatement(comanda);

            preparedStatement.setString(1, strada);


            preparedStatement.executeUpdate();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
