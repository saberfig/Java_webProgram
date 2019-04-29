package com.bupt.client;

import java.io.Closeable;
import java.io.IOException;

public class CloseUtils{

	public static void closeAll(Closeable... able){
		for(Closeable c:able) {
			if(c!=null) {
				try {
					c.close();
					int i=1;
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
