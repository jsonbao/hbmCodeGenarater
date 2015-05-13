package test;

import generate.generateThing;
import db.db;

public class test {
	
	
	public static void main(String[] args) throws Exception{
		db.initBruce();
	    //	ConnectServer.init();
//	    String database = "test";
		String tablename = "y_third_login";
		String dir="D://opt//dir222";
//     	generateThing.generateAll(database,dir);
		generateThing.generateOneModle(tablename, dir);
		
		String a = dir.replace("//", "\\");
		System.out.println(a);
		Runtime.getRuntime().exec("explorer "+a);  
		
	}
	
	
}


