package github.java;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

public class QRCodeGenerator {
	public static void main(String[] args) throws IOException {
		String details = "Pravin i love u";
		ByteArrayOutputStream str = QRCode.from(details).to(ImageType.JPG).stream();
		File f = new File("C:\\Java\\MyName.jpg");
		FileOutputStream out = new FileOutputStream(f);
		out.write(str.toByteArray());
		out.flush();
	}

}
