import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class Exercise2 {
    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect("https://pogoda.onet.pl/prognoza-pogody/prudnik-336481").get();
        System.out.println(document.getElementsByClass("temp").get(0).text());

    }
}
