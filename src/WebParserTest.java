package src;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class WebParserTest {

    public static void main (String args[] ) throws IOException {
        String html = "<html><head><title>Sample Title</title></head>"
         + "<body><p>Sample Content</p></body></html>";
        String url = "https://neguse.house.gov";
        Document document = Jsoup.connect(url).get();
        System.out.println(document.title());
    }

    
}