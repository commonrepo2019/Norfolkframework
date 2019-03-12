package y.util;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.HttpURLConnection;
import java.net.URL;

public class ResponseCode {

public static int responseCode(String link) throws IOException {
    URL url=new URL(link);
    HttpURLConnection connection=(HttpURLConnection)url.openConnection();
    connection.connect();
    connection.setConnectTimeout(10);

    return connection.getResponseCode();
}
}
