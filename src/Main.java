import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.InputMismatchException;
import java.util.Scanner;

// 按两次 Shift 打开“随处搜索”对话框并输入 `show whitespaces`，
// 然后按 Enter 键。现在，您可以在代码中看到空格字符。
public class Main {
    public static void main(String[] args) throws Exception{
        ServerSocket server=new ServerSocket(8080);
        System.out.println("Listening for connection on port 8080...");
        while (true){
             Socket clientSocket=server.accept();
            InputStreamReader isr=new InputStreamReader(clientSocket.getInputStream());
            BufferedReader reader=new BufferedReader(isr);
            String line=reader.readLine();
            while (!line.isEmpty()){
                System.out.println(line);
                line=reader.readLine();
            }
        }
    }
}