package accessSpecifierPackage1;

class DiffClsSamePkg {
 public static void main(String[] args) {
SameClsSamePkg obj = new SameClsSamePkg();
    obj.publicMethod();
    obj.protectedMethod();
    obj.defaultMethod();
    System.out.println(obj.publicField);

}
}
