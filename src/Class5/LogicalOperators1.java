package Class5;

public class LogicalOperators1 {
    public static void main(String[] args) {

        System.out.println(true||true);
        System.out.println(true||false);
        System.out.println(false||false);

        System.out.println(false||true||false||false);

        boolean boughtCho=false;
        boolean boughtFlowers=false;
        if(boughtCho||boughtFlowers){
            System.out.println("i am happy");
        }else {
            System.out.println("i am sad");
        }
        boolean wifi=true;
        boolean fiveG=true;
        if(wifi||fiveG){
            System.out.println("you are good for browsing the intenet");
        }else {
            System.out.println("either connect to wifi or to 5G");
        }
    }
}
