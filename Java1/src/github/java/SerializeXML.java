package github.java;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializeXML {
	
	public static void main(String[] args) throws Exception {
		Student s1= new Student();
		s1.setId(1);
		s1.setName("Sup");
		Student s2= new Student();
		s2.setId(2);
		s2.setName("Sutar");
		
		List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		
		College c = new College();
		c.setStudents(list);
		
		XMLEncoder enc = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("college.txt")));
		enc.writeObject(c);
		enc.close();
		
		XMLDecoder dec =new XMLDecoder(new BufferedInputStream(new FileInputStream("college.txt")));
		College clg = (College) dec.readObject();
		List<Student> slist = clg.getStudents();
		for(Student s : slist) {
			System.out.println(s);
			
		}
	}
	

}
