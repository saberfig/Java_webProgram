package com.bupt.game;

import java.io.IOException;
import java.net.Socket;

public class Client {
	public static void main(String[] args) throws IOException{
		//创建Socket对象
		Socket client=new Socket("localhost",8080);
		//创建发送的线程类对象
		Send send=new Send(client);
		//创建接收的线程类对象
		Receive receive=new Receive(client);
		//启动线程
		send.start();
		receive.start();
	}
}
