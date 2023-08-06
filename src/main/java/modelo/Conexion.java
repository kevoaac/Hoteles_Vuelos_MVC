package modelo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    private final String url = "jdbc:postgresql://localhost:5432/Q_APT_Vuelos_Hoteles_Grupal";
    private final String usuario = "root";
    private final String password = "root";
    protected Connection connection = null;

    public  Connection getConnection() {

        if (connection == null) {
            try {
                //cargar driver	
                try {
                    Class.forName("org.postgresql.Driver");

                } catch (ClassNotFoundException e) {
                    System.out.println("Error al conectar a la base: " + e.getMessage());
                }
                //Hacer la coneccion a la base de datos

                connection = DriverManager.getConnection(url, usuario, password);//pasamos los datos de conexion

                boolean valida = connection.isValid(50000);//le doy el tiempo que espero para que se ejecute
                System.out.println(valida ? "Coneccion realizada" : "Coneccion fallida");

            } catch (java.sql.SQLException e) {
                System.out.println("Error SQL: " + e.getErrorCode());

            }
        }

        return connection;
    }
}
