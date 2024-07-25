package javaLibraries;

public class HashCode {
	public static void main(String[] args) {
		HashCode h = new HashCode();
		System.out.println(h.hashCode()); //Returns a hash code value for the object.
	}
 public int hashCode() { //Override
	 return 234;
 }
}
