package d1702;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public void launch() {
		new Thread() {
			@Override
			public void run() {
				try {
					ServerSocket ss = new ServerSocket(8000);
					System.out.println("服务已在 8000 端口上启动");
					while(true) {
						System.out.println("等待下一个客户端连接");
						Socket s = ss.accept();
						System.out.println("客户端已连接");
						TongXinThread t = new TongXinThread(s);
						t.start();
					}
				} catch (Exception e) {
					System.out.println(
					 "无法在 8000 端口上启动服务，或服务已停止");
				}
			}
		}.start();
	}
	
	
	class TongXinThread extends Thread {
		Socket s;
		public TongXinThread(Socket s) {
			this.s = s;
		}
		@Override
		public void run() {
			/*
			 * 通信协议，流程和格式
			 * UTF-8编码的字符串，
			 * 每段字符串末尾添加换行
			 * 
			 * BR--ISR--网络输入流
			 * PW--OSW--网络输出流
			 */
			
			try {
				BufferedReader in = 
				 new BufferedReader(
				 new InputStreamReader(
				 s.getInputStream(), "UTF-8"));
				PrintWriter out = 
				 new PrintWriter(
				 new OutputStreamWriter(
				 s.getOutputStream(),"UTF-8"));
				String line;
				while((line = in.readLine()) != null) {
					out.println(line);
					out.flush();
				}
				//断开
			} catch (Exception e) {
				//断开
			}
		    
			System.out.println("一个客户端端已断开");
			
		}
	}
	
	
	public static void main(String[] args) {
		EchoServer s = new EchoServer();
		s.launch();
	}
}
