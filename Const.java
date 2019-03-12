class Const{
    int x;
    Const(){

        System.out.println("constructor invoked");
        x=100;
    }
    public static void main(String[] args){
        Const call=new Const();
        System.out.println(call.x);
    }
}