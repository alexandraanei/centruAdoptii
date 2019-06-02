package centruAdoptie.servicii;

import centruAdoptie.formulare.FormularPlata;
import java.sql.*;

public class FormularPlataJDBC {
    private static FormularPlataJDBC ourInstance = new FormularPlataJDBC();

    public static FormularPlataJDBC getInstance() {
        return ourInstance;
    }

    private FormularPlataJDBC() {
    }

    public void CreeazaTabelaFormularPlata(){

        ServiciuAudit.getInstance().writeLogLine("Creeaza tabela FormularPlata JDBC");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC",
                    "root", "admin");
            Statement statement = connection.createStatement();

            statement.executeUpdate("CREATE TABLE `sys`.`FormularPlata` (\n" +
                    "  `CNP` VARCHAR(45) NOT NULL,\n" +
                    "  `cost` INTEGER(5) NOT NULL,\n" +
                    "  `descriere` VARCHAR(45) NOT NULL,\n" +
                    "  PRIMARY KEY (`CNP`));");



        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void AdaugaFormularPlata(FormularPlata formular){

        ServiciuAudit.getInstance().writeLogLine("Adauga FormularPlata JDBC");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC",
                    "root", "admin");
            PreparedStatement preparedStatement = null;

            String comanda = "INSERT INTO FormularPlata(CNP, cost, descriere) values(?,?,?)";


            preparedStatement = connection.prepareStatement(comanda);
            preparedStatement.setString(1, formular.getCNP());
            preparedStatement.setInt(2, formular.getCost());
            preparedStatement.setString(3, formular.getDescriere());

            preparedStatement.executeUpdate();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void UpdateFormularPlata(String update, String CNP, int cost, String descriere){

        ServiciuAudit.getInstance().writeLogLine("Update FormularPlata JDBC");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC",
                    "root", "admin");
            PreparedStatement preparedStatement = null;

            String comanda = "UPDATE FormularPlata SET CNP = ?, cost = ?, descriere = ? WHERE CNP = ?";
            preparedStatement = connection.prepareStatement(comanda);
            preparedStatement.setString(1, CNP);
            preparedStatement.setInt(2, cost);
            preparedStatement.setString(3, descriere);
            preparedStatement.setString(4, update);

            preparedStatement.executeUpdate();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void CitesteFormularPlata(){

        ServiciuAudit.getInstance().writeLogLine("Citeste FormularPlata JDBC");


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC",
                    "root", "admin");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * from FormularPlata");

            while (resultSet.next()) {
                System.out.println("CNP=" + resultSet.getString(1)
                        + ", cost=" + resultSet.getInt(2)
                        + ", descriere=" + resultSet.getString(3));
            }



        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public void StergeFormularPlata(String CNP){

        ServiciuAudit.getInstance().writeLogLine("Sterge FormularPlata JDBC");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC",
                    "root", "admin");
            PreparedStatement preparedStatement = null;

            String comanda = "DELETE from FormularPlata WHERE CNP = ?";

            preparedStatement = connection.prepareStatement(comanda);

            preparedStatement.setString(1, CNP);

            preparedStatement.executeUpdate();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
