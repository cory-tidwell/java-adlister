import java.util.ArrayList;
import java.util.List;

public class ListAdsDao implements Ads {
    private List<Ad> allAds;

//    @Override
//    public List<Ad> allAds() {
//        return null;
//    }

    public List<Ad> allAds() {
        if (allAds == null) {
            allAds = generateAds();
        }
        return allAds;
    }

    private List<Ad> generateAds() {
        List<Ad> allAds = new ArrayList<>();
        allAds.add(new Ad(
                1,
                1,
                "PS5 for sale",
                "Never been open! Used for home defense!"
        ));
        allAds.add(new Ad(
                2,
                1,
                "Frog Jerky",
                "As title states!"
        ));
        allAds.add(new Ad(
                3,
                2,
                "Beef Flavored Mountain Dew",
                "Unreleased Mountain Dew beef flavor. Case of 24."
        ));
        allAds.add(new Ad(
                4,
                2,
                "Hitman",
                "Point me in the right direction!"
        ));
        return allAds;
    }

    public void insertAd(Ad newAd) {
        this.allAds.add(newAd);
    }

    public static void main(String[] args) {

//        Ads adsDao = DaoFactory.getAdsDao();
//
//        List<Ad> allAds = adsDao.allAds();
//        Ad testAd = new Ad(6, 500L, "Test Ad", "This is a test.");
//        adsDao.insertAd(testAd);
//        for ( Ad ad : allAds) {
//            System.out.println(ad.getTitle() + " " + ad.getDescription());
//        }

    }


}
