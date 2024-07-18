class Account {
    private static Account a;
    private Account (){
        System.out.println("Object Created");
    }

 public static Account createObject(){
    if(a==null){
        return a = new Account();
    }else{
        System.out.println("Object alredy created");
        
    }
    return a;
 }
}

 class Main{
    public static void main(String[] args) {
        Account.createObject();
        Account.createObject();
    }
 }

