import net.bytebuddy.implementation.bind.annotation.Super;

public class SuperDemoChild extends SuperDemoParent{

   String name = "Numebr";
    public void getStringData(){
        System.out.println(name);
        System.out.println(super.name);
    }

    public static void main(String[] args){
        SuperDemoChild cd = new SuperDemoChild();

        cd.getStringData();
       

    }
}
