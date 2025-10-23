package chapter1;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Plant plant1 = new Plant();
        /*
         
          this is a 
         
        */
        plant1.name="papaya"; //write
        plant1.setBranch(100);
        System.out.println(plant1.name); //read syntax
        System.out.println(plant1.getBranch());
        //create and instance of a Toy class = Toy object

        /*   this
        *    is a
        * multiline 
        *comment
*/
        Toy toy1 = new Toy();
        toy1.name ="Rage pink";
        toy1.brand = "Lab Vuvu";
        toy1.price = 4500;
        toy1.quantity = 12;
        System.out.println();
        Random r = new Random();
        System.out.println(r.nextInt(100));
        ArrayList al = new ArrayList<>();
        Date date1 = new Date();
    }
}

/**
 * Plant class creates a Plant object
 * that has a property branch,name, and leaves
 */
class Plant{
    int branch;
    String name;
    int leaves;
    /**
     * setBranch modifies the number of leaves
     */
    void setBranch(int leaves){
        this.leaves=leaves;
    }
    int getBranch() {
        return branch;
    }
}

