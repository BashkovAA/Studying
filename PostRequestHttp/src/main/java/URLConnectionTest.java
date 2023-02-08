import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionTest {
    public static void main(String[] args) {
        String urlAddress = "http:\\www.google.com";
        URLConnection urlConnection;
        URL url;
        InputStreamReader isR = null;
        BufferedReader bfR = null;

        try {
            url = new URL(urlAddress);
            urlConnection = url.openConnection();
            isR = new InputStreamReader(urlConnection.getInputStream());
            bfR = new BufferedReader(isR);

            System.out.println(bfR.readLine());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                isR.close();
                bfR.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
