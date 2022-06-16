import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AdServlet", urlPatterns = "/ads")
public class AdServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        Ads adsDao = DaoFactory.getAdsDao();

        List<Ad> allAds = adsDao.allAds();
        Ad testAd = new Ad(6, 500L, "Test Ad", "This is a test.");
        adsDao.insertAd(testAd);

        req.setAttribute("allAds", DaoFactory.getAdsDao().allAds());
        req.getRequestDispatcher("/ads/index.jsp").forward(req, res);
    }
}