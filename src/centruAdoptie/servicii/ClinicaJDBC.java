package centruAdoptie.servicii;

import centruAdoptie.clinici.Clinica;

import java.sql.*;

public class ClinicaJDBC {
    private static ClinicaJDBC ourInstance = new ClinicaJDBC();

    public static ClinicaJDBC getInstance() {
        return ourInstance;
    }

    private ClinicaJDBC() {
    }

    public void CreeazaTabelaClinica(){

        ServiciuAudit.getInstance().writeLogLine("Creeaza tabela Clinica JDBC");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC",
                    "root", "admin");
            Statement statement = connection.createStatement();

            statement.executeUpdate("CREATE TABLE `sys`.`Clinica` (\n" +
                    "  `nume` VARCHAR(45) NOT NULL,\n" +
                    "  `tip` VARCHAR(45) NOT NULL,\n" +
                    "  PRIMARY KEY (`nume`));");



        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void AdaugaClinica(Clinica clinica){

        ServiciuAudit.getInstance().writeLogLine("Adauga Clinica JDBC");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC",
                    "root", "admin");
            PreparedStatement preparedStatement = null;

            String comanda = "INSERT INTO Clinica(nume, tip) values(?,?)";


            preparedStatement = connection.prepareStatement(comanda);
            preparedStatement.setString(1, clinica.getNume());
            preparedStatement.setString(2, clinica.getTip());

            preparedStatement.executeUpdate();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void UpdateClinica(String update, String nume, String tip){

        ServiciuAudit.getInstance().writeLogLine("Update Clinica JDBC");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC",
                    "root", "admin");
            PreparedStatement preparedStatement = null;

            String comanda = "UPDATE Clinica SET nume = ?, tip = ? WHERE CNP = ?";
            preparedStatement = connection.prepareStatement(comanda);
            preparedStatement.setString(1, nume);
            preparedStatement.setString(2, tip);
            preparedStatement.setString(3, update);

            preparedStatement.executeUpdate();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void CitesteClinica(){

        ServiciuAudit.getInstance().writeLogLine("Citeste Clinica JDBC");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC",
                    "root", "admin");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * from Clinica");

            while (resultSet.next()) {
                System.out.println("nume=" + resultSet.getString(1)
                        + ", tip=" + resultSet.getString(2));
            }



        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public void StergeClinica(String nume){

        ServiciuAudit.getInstance().writeLogLine("Sterge Clinica JDBC");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC",
                    "root", "admin");
            PreparedStatement preparedStatement = null;

            String comanda = "DELETE from Clinica WHERE nume = ?";

            preparedStatement = connection.prepareStatement(comanda);

            preparedStatement.setString(1, nume);

            preparedStatement.executeUpdate();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
