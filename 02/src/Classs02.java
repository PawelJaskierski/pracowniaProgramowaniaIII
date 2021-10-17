
public class Classs02 {
    public static void main (String[] args){
    /*Books a = new Books();
    a.name = "something";
    a.genre = "thing";
    a.pageCount = 12;
    a.isHardcover = true;
    System.out.println(a.checkIfHardcover());
    a.describe();*/
    /*Lamp a1 = new Lamp();
    Lamp a2 = new Lamp();
    a2.switchOf();
    a1.switchOn();
    a1.chekIfOn();
    a2.chekIfOn();*/
    /*Rectangle r1 = new Rectangle();
    Rectangle r2 = new Rectangle();
    r1.height = 8;
    r2.height = 7;
    r1.width = 7;
    r2.width = 8;
    r1.displayDimensions();
    System.out.println(r1.givePerimeter());
    System.out.println(r1.giveSurface());*/
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        for(int i = 0; i<3; i++){
            c1.increaseByOne();
            c1.increaseByTen();
        }
        c1.decreaseByTen();
        for(int i = 0; i < 5; i++ ){
            c2.decreaseByTen();
            c2.increaseByOne();
        }

        c2.decreaseByOne();
        c2.decreaseByOne();
        System.out.println(c1.startingPoint);
        System.out.println(c2.startingPoint);
    }

}
