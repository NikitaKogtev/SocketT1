import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {

        String host = "localhost";
        int port = 8881;

        try (Socket socket = new Socket(host,port);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))){

            out.println("KogtevPC");

            System.out.println(in.readLine());

        }catch (IOException e) {
            e.printStackTrace();
        }


    }
}
