package teo.com;

import java.io.PrintWriter;

import jdepend.xmlui.*;

public class Samp_XML {
	public static void main(String[] args) throws Exception{
		JDepend db = new JDepend(new PrintWriter("report.xml"));
		db.addDirectory("T:\\DoGiaHuy_KTrPhM_04\\Library-Assistant");
		db.analyze();
		System.out.println("DOne");
	}
	
}
