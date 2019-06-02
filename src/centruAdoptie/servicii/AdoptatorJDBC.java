package centruAdoptie.servicii;

import centruAdoptie.adoptatori.Adoptator;

import java.sql.*;

public class AdoptatorJDBC {
    private static AdoptatorJDBC ourInstance = new AdoptatorJDBC();

    public static AdoptatorJDBC getInstance() {
        return ourInstance;
    }

    private AdoptatorJDBC() {
    }

    public void CreeazaTabelaAdoptator(){

        ServiciuAudit.getInstance().writeLogLine("Creeaza tabela Adoptator JDBC");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC",
                    "root", "admin");
            Statement statement = connection.createStatement();

            statement.executeUpdate("CREATE TABLE `sys`.`Adoptator` (\n" +
                    "  `nume` VARCHAR(45) NOT NULL,\n" +
                    "  `prenume` VARCHAR(45) NOT NULL,\n" +
                    "  `varsta` INTEGER(3) NOT NULL,\n" +
                    "  PRIMARY KEY (`nume`));");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void AdaugaAdoptator(Adoptator adoptator){

        ServiciuAudit.getInstance().writeLogLine("Adauga Adoptator JDBC");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC",
                    "root", "admin");
            PreparedStatement preparedStatement = null;

            String comanda = "INSERT INTO Adoptator(nume, prenume, varsta) values(?,?,?)";

            preparedStatement = connection.prepareStatement(comanda);
            preparedStatement.setString(1, adoptator.getNume());
            preparedStatement.setString(2, adoptator.getPrenume());
            preparedStatement.setInt(3, adoptator.getVarsta());

            preparedStatement.executeUpdate();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void UpdateAdoptator(String update, String nume, String prenume, int varsta){

        ServiciuAudit.getInstance().writeLogLine("Update Adoptator JDBC");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC",
                    "root", "admin");
            PreparedStatement preparedStatement = null;

            String comanda = "UPDATE Adoptator SET nume = ?, prenume = ?, varsta = ? WHERE nume = ?";
            preparedStatement = connection.prepareStatement(comanda);
            preparedStatement.setString(1, nume);
            preparedStatement.setString(2, prenume);
            preparedStatement.setInt(3, varsta);
            preparedStatement.setString(4, update);

            preparedStatement.executeUpdate();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void CitesteAdoptator(){

        ServiciuAudit.getInstance().writeLogLine("Citeste Adoptator JDBC");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC",
                    "root", "admin");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * from Adoptator");

            while (resultSet.next()) {
                System.out.println("nume=" + resultSet.getString(1)
                        + ", prenume=" + resultSet.getString(2)
                        + ", varsta=" + resultSet.getInt(3));
            }



        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public void StergeAdoptator(String nume){

        ServiciuAudit.getInstance().writeLogLine("Sterge Adoptator JDBC");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC",
                    "root", "admin");
            PreparedStatement preparedStatement = null;

            String comanda = "DELETE from Adoptator WHERE nume = ?";

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
