public class Main
{
    public static void main(String[]args)
    {
        Candy[][] box = new Candy[4][3];
        box[0][1] = new Candy("lime");
        box[1][1] = new Candy("orange");
        box[2][2] = new Candy("cherry");
        box[3][1] = new Candy("lemon");
        box[3][2] = new Candy("grape");
    System.out.println(box);
    BoxOfCandy b = new BoxOfCandy(box);
    System.out.println(b);
   System.out.println(b.moveCandyToFirstRow(0));
   System.out.println(b.moveCandyToFirstRow(1));
    
   Candy[][] jar = new Candy[4][3];
   jar[0][1] = new Candy("lime");
   jar[0][2] = new Candy("cherry");
   jar[1][1] = new Candy("orange");
   jar[3][1] = new Candy("lemon");
   jar[3][2] = new Candy("grape");
   System.out.println(jar);
   BoxOfCandy j = new BoxOfCandy(jar);
   System.out.println(j);
  System.out.println(j.moveCandyToFirstRow(2));

  box= new Candy[3][5];
  box[0][0] = new Candy("lime");
  box[0][1] = new Candy("lime");
  box[0][3] = new Candy("lemon");
  box[1][0] = new Candy("orange");
  box[1][3] = new Candy("lime");
  box[1][4] = new Candy("lime");
  box[2][0] = new Candy("cherry");
  box[2][2] = new Candy("lemon");
  box[0][4] = new Candy("orange");
  System.out.println(box);
  BoxOfCandy c = new BoxOfCandy(box);
 System.out.println(c.removeNextByFlavor("cherry"));
System.out.println(c);
System.out.println(c.removeNextByFlavor("lime"));
System.out.println(c);
System.out.println(c.removeNextByFlavor("grape"));

    }
}
