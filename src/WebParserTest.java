package src;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class WebParserTest {

    public static void main (final String args[]) throws IOException {
        String url = "https://neguse.house.gov";
        final Document document = Jsoup.connect(url).get();
        System.out.println(document.title());
    }
}