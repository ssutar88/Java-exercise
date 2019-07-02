package github.java;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileDemo {
	public static void main(String[] args) throws Exception {
		File f = new File("demo.txt");
		FileOutputStream fout = new FileOutputStream(f);
		DataOutputStream dout = new DataOutputStream(fout);
		dout.writeUTF("Supriya Sutar");
		
		FileInputStream fin = new FileInputStream(f);
		DataInputStream din = new DataInputStream(fin);
		System.out.println(din.readUTF());
	}
}	
