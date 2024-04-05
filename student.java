class basketball{
    String name;
    String color;

    double price;

    public void  basketballInfo(){
        System.out.println(this.name);
        System.out.println(  this.color);
        System.out.println(  this.price + "$");
    }
    basketball(String name,String color, double price){
        this.name= name;
        this.color=color;
        this.price=price;
    }

}


public class student {
    public static void main(String[] args) {
        basketball b1 = new basketball("Spaulding","orange",42.99);
        basketball b2 = new basketball("S-Mart","red",12.99);
        b1.basketballInfo();
        b2.basketballInfo();


    }
}