/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sendsms;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

/**
 *
 * @author thami
 */
public class Sendsms {

    /**
     * @param args the command line arguments
     */
  
          public static void main(String[] args) {
        try {
            // Define the API endpoint and parameters
            String token = "2478|7WlmsJihUzB7rcpHR9hfQmrFfpefNgpDUrkiFbFy";
            String to = "0762555196";
            String from = "SendTest";
            String message = "Hello\nLochana";

            // URL encode the message
            String encodedMessage = URLEncoder.encode(message, "UTF-8");

            // Construct the URL
            String apiUrl = "https://send.lk/sms/send.php?token=" + token +
                            "&to=" + to +
                            "&from=" + from +
                            "&message=" + encodedMessage;

            // Create a URL object
            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

            // Get the response
            int responseCode = conn.getResponseCode();
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // Print the response
            System.out.println("Response Code: " + responseCode);
            System.out.println("Response: " + response.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
