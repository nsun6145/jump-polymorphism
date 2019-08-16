
abstract class Shape{

    int sides;

    abstract int getSize();
    abstract int getSides();

}

class Square extends Shape{
   int sides = 4;
   int sideLength;

   public Square(int s){
        sideLength = s;
   }

   public int getSize(){
        return sideLength * sides;
   }

   public int getSides(){
       return sides;
   }
}

class Polymorphism{

    public static void main(String[] args){

    Shape square = new Square(12);

    System.out.println("This shape has " + square.getSides() + " sides and has a perimeter of " + square.getSize() + " units");
    }
}
