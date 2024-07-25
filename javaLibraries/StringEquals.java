package javaLibraries;

public class StringEquals {
	String brand = "Benz";
	public static void main(String[] args) {
		StringEquals se = new StringEquals();
		StringEquals se1 = new StringEquals();
		
		System.out.println(se.equals(se1));
		
	
	}
	public boolean equals(Object ob) {
		StringEquals o=(StringEquals)ob;   //dwncasting and 
		System.out.println(o.brand);
		return brand.equals(o.brand);
	}
}
	