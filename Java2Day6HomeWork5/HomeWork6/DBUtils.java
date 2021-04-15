package HomeWork6;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtils {
      private static DBUtils instance;
      private Connection connection;

      private DBUtils(){
          Properties properties = new Properties();
          try {
              properties.load(DBUtils.class.getResourceAsStream("/dbCOnfig.properties"));
              String diver = properties.getProperty("driver");
              String url = properties.getProperty("url");
              String userName = properties.getProperty("userName");
              String password = properties.getProperty("password");

              Class.forName(diver);
              connection = DriverManager.getConnection(url, userName, password);
          } catch (ClassNotFoundException | SQLException | IOException e) {
               e.printStackTrace();
          }
      }
    public Connection getConnection() {
          return connection;
    }
    public static DBUtils getInstance() throws SQLException {
            if (instance == null || instance.getConnection().isClosed()) {
              instance = new DBUtils();
            }
            return instance;
    }
}
