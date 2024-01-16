import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class JavaClient {
    public static void main(String[] args) {
        try {
            // Connect to the Python server
            Socket socket = new Socket("localhost", 8888);
            // Set up input stream to receive data from Python server
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            while (true) {
                // Receive the size of the incoming frame
                int frameSize = dataInputStream.readInt();
                // Receive the frame data
                byte[] frameData = new byte[frameSize];
                dataInputStream.readFully(frameData);
                // Process the frame data as needed (you may want to use JavaFX to display it)
                // For simplicity, this example does not show image processing in Java
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
