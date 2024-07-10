package accessSpecifierPackage1;

public class SameClsSamePkg {
	    public int publicField=10;
	    private int privateField = 20;
	    protected int protectField = 30;
	    int defaultField = 40;

	    public void publicMethod(){
	        System.out.println("This is a public method = "+ publicField);
	    }

	    private void privateMethod(){
	        System.out.println("This is a private method = "+ privateField);
	    }

	    protected void protectedMethod(){
	        System.out.println("This is a protect method = "+ protectField);
	    }

	     void defaultMethod(){
	        System.out.println("This is a default method = "+ defaultField);
	    }
	    
	      public static void main(String[] args) {
	        SameClsSamePkg obj = new SameClsSamePkg();
	        obj.privateMethod();
	        obj.publicMethod();
	        obj.defaultMethod();
	        obj.protectedMethod();
	        
	        System.out.println(obj.privateField);
	    }
	 }

	 