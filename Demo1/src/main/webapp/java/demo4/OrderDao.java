package demo4;

public class OrderDao {
    public void add(){
        System.out.println("add");
    }
    public void del(){
        System.out.println("del");
    }
    public String upd(){
        System.out.println("upd");
        return "aaaaaaaaaa";
    }
    public void sel(){
        System.out.println("sel");
        int i=1/0;
    }
}
