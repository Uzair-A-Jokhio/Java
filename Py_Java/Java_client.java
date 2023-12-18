import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Java_client {
    public static void main(String[] args) {
        try {
            // Connect to the Python server
            Socket socket = new Socket("localhost", 8888);

            // Read data from the Python server
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String receivedData = reader.readLine();

            // Print the received data
            System.out.println("Received from Python: " + receivedData);

            // Close the connection
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
