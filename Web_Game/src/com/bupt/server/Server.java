package com.bupt.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
	public static List<MyChannel> list=new ArrayList<MyChannel>();
	public static void main(String[] args) throws IOException {
		System.out.println("----------服务器端已开启----------");
		//创建ServerSocket对象
		ServerSocket server=new ServerSocket(8080);
		//监听是否有客户端连接
		while(true) {
			Socket socket=server.accept();
			//创建线程类对象
			MyChannel channel=new MyChannel(socket);
			//添加到集合中
			list.add(channel);
			//启动线程
			channel.start();
		}
	}
}
