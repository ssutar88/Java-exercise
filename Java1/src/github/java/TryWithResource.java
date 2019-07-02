package github.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource {
	
	public static void main(String[] args) throws Exception {
		
		// Since Java 7 it closes resource br
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {	
			br.readLine();
		} 
		}

}
