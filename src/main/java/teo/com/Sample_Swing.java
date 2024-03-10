package teo.com;

import jdepend.swingui.JDepend;

public class Sample_Swing {
	public static void main(String[] args)  throws Exception{
		JDepend db = new JDepend();
		db.addDirectory("T:\\DoGiaHuy_KTrPhM_04\\Library-Assistant");
		db.analyze();
		System.out.println("Done");
	}
}
