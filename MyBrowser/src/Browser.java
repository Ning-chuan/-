import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Browser {

    private Scanner input = new Scanner(System.in);

    public void openBrowser(){
        System.out.println("请输入URL:");
        String url = input.nextLine();
        this.parseURL(url);
    }

    //解析URL的方法
    private void parseURL(String url){
        int colonIndex = url.indexOf(":");
        int slashIndex = url.indexOf("/");
        String ip = url.substring(0,colonIndex);
        int port = Integer.parseInt(url.substring(colonIndex + 1, slashIndex));
        String contentAndParams = url.substring(slashIndex+1);
        this.createSocketAndSendRequest(ip,port,contentAndParams);
    }

    //发送给服务器
    private void createSocketAndSendRequest(String ip,int port,String contentAndParams){
        try {
            //通过ip和port创建Socket对象
            Socket socket = new Socket(ip,port);
            //socket只有字节型输出流 但是字符型输出流更符合我们的需要 所以构建成下面这个样子
            PrintWriter out = new PrintWriter(socket.getOutputStream());
            //将contentAndParams发送给服务器
            out.println(contentAndParams);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
