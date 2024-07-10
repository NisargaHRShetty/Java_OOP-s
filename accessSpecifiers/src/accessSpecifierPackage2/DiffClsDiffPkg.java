package accessSpecifierPackage2;
import accessSpecifierPackage1.*;

public class DiffClsDiffPkg extends SameClsSamePkg{
  public static void main(String[] args) {
//	SameClsSamePkg obj = new SameClsSamePkg();
//	obj.publicMethod();
	DiffClsDiffPkg obj1=new DiffClsDiffPkg();
	obj1.protectedMethod();
	obj1.publicMethod();
}
}
