import java.util.ArrayList;
import java.util.List;

public class BeanTest {
    public static void main(String[] args) {
        Album album = new Album();
        Author author = new Author();
        Quote quote = new Quote();
        Quote quote2 = new Quote();

        album.setId(1);
        album.setArtist("milli vanilli");
        album.setNameOfAlbum("nameofalbum1");
        album.setSales(53);
        album.setGenre("folk");
        album.setReleaseDate(2022);

        author.setId(1);
        author.setFirstName("jim");
        author.setLastName("smalls");

        quote.setId(1);
        quote.setAuthor("scooter mcgaven");
        quote.setAuthorId(1);
        quote.setContent("THE QUICK BROWN FOX JUMPED OVER THE LAZY DOG'S BACK 1234567890.");

        quote2.setId(2);
        quote2.setAuthor("happy gilmore");
        quote2.setAuthorId(2);
        quote2.setContent("THE QUICK BROWN FOX JUMPED OVER THE LAZY DOG'S BACK 1234567890.");

        ArrayList<Quote> quotes = new ArrayList<>();
        quotes.add(quote);
        quotes.add(quote2);


        for (Quote element : quotes) {
            System.out.println(element.getId());
            System.out.println(element.getAuthor());
            System.out.println(element.getAuthorId());
            System.out.println(element.getContent());
        }
//        for(int i = 0; i<quotes.size(); i++){
//            System.out.println(quotes[i].getArtist()); //<--this does not work but this is the idea
//        }
    }
}
