package sendsms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

/**
 * A simple class to send SMS using the Send.lk API.
 * 
 * Note: Replace the placeholder values with your actual credentials
 *       securely (e.g., via environment variables or configuration file).
 */
public class Sendsms {

    public static void main(String[] args) {
        try {
            // API credentials and message details
            String token = System.getenv("SENDLK_API_TOKEN"); // Use environment variable
            String to = "076XXXXXXX"; // Replace with recipient number
            String from = "SendTest";
            String message = "Hello\nThamindu";

            // URL encode the message
            String encodedMessage = URLEncoder.encode(message, "UTF-8");

            // Construct the API URL
            String apiUrl = String.format(
                "https://send.lk/sms/send.php?token=%s&to=%s&from=%s&message=%s",
                token, to, from, encodedMessage
            );

            // Send the HTTP GET request
            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            // Read the API response
            int responseCode = conn.getResponseCode();
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();
            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // Output response
            System.out.println("Response Code: " + responseCode);
            System.out.println("Response: " + response);

        } catch (Exception e) {
            System.err.println("Error sending SMS: " + e.getMessage());
            e.printStackTrace();
        }
    }
}