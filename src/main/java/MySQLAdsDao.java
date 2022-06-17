import java.sql.*;
import com.mysql.cj.jdbc.Driver;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads{
    private Connection connection;
    private Config config = new Config();

    public MySQLAdsDao() {
        try {
            DriverManager.registerDriver(new Driver());
            this.connection = DriverManager.getConnection(
                    config.getURL(),
                    config.getUsername(),
                    config.getPassword()
            );
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Ad> all() {
        String selectQuery = "SELECT * FROM ads";
        List<Ad> adsList = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectQuery);
            while(resultSet.next()){
                Ad newAd = new Ad(resultSet.getLong("id"), resultSet.getString("title"), resultSet.getString("description"));
                adsList.add(newAd);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }

        return adsList;
    }

    @Override
    public Long insert(Ad ad) {
        return null;
    }

    public static void main(String[] args) throws SQLException {
        MySQLAdsDao mySQLAdsDao = new MySQLAdsDao();

        List<Ad> ads = mySQLAdsDao.all();
        for (Ad ad : ads) {
            System.out.println(ad.getUserId() + " " + ad.getTitle() + " " + ad.getDescription());
        }
    }
}