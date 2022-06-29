package d1703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;

public class ChatServer {
	
	private ArrayList<TongXinThread> list = 
			new ArrayList<>();
	
	public void launch() {
		//启动服务线程
		new Thread() {
			@Override
			public void run() {
				try {
					ServerSocket ss = new ServerSocket(8000);
					System.out.println("聊天室服务器已启动");
					while(true) {
						Socket s = ss.accept();
						TongXinThread t = 
						 new TongXinThread(s);
						t.start();
					}
				} catch (Exception e) {
					System.out.println(
					 "服务无法在 8000 端口上启动，或服务已经停止");
				}
			}
		}.start();
	}
	
	class TongXinThread extends Thread {
		Socket s;
		BufferedReader in;
		PrintWriter out;
		private String name;
		public TongXinThread(Socket s) {
			this.s = s;
		}
		
		public void send(String msg) {
			out.println(msg);
			out.flush();
		}
		
		public void sendAll(String msg) {
			synchronized (list) {
				for (TongXinThread t : list) {
					t.send(msg);
				}
			}
		}
		
		@Override
		public void run() {
			try {
				s.setSoTimeout(5000);
				
				//UTF-8, 换行
				in = new BufferedReader(new InputStreamReader(s.getInputStream(), "UTF-8"));
				out = new PrintWriter(new OutputStreamWriter(s.getOutputStream(),"UTF-8"));					
				//接收客户端的昵称
				this.name = in.readLine();
				//把当前通信线程实例，加入集合
				synchronized (list) {
					list.add(this);
				}
				//发送欢迎信息
				send("欢迎进入激情聊天室");
				//群发上线消息
				sendAll(name+"进入了聊天室，在线人数："+list.size());
				
				int count = 0; //超时计数
				String line;
				while(true) {
					try {
						line = in.readLine();
						if(line == null) {
							break;
						}
						count = 0;
					} catch (SocketTimeoutException e) {
						if(count == 3) {
							send("您已经被踢出激情聊天室");
							s.close();//断开连接
							break;
						}
						count++;
						send("请积极参与聊天("+count+"/3)");
						continue;
					}
					
					sendAll(name+"说："+line);
				}
				//断开
			} catch (Exception e) {
				//断开
			}
			//删除当前通信线程实例
			synchronized (list) {
				list.remove(this);
			}
			//群发离线消息
			sendAll(name+"离开了聊天室，在线人数："+list.size());
			
			
		}
	}
	
	
	
	
	public static void main(String[] args) {
		ChatServer s = new ChatServer();
		s.launch();
	}
}
