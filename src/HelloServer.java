import java.io.*;
import java.net.*;


public class HelloServer {
    public static void main (String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(9000);
        Socket s = ss.accept();

        System.out.println("client connected");

        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader bf = new BufferedReader(in);

        String str = bf.readLine();

        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(s.getOutputStream())));
        System.out.println();

        out.println("HTTP/1.1 200 OK");
        out.println("Content-Type: text/html");
        out.println("\r\n");
        out.println("<marquee><h1>Hello World2</h1></marquee>");
        out.close();
    }
}

