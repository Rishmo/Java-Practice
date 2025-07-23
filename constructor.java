class Room
{
 int length;
 int width;
 Room(int x,int y)
 {
     length=x;
     width=y;
 }
 Room(int x)
 {
     length=width=x;
 }
 int area()
 {
 return(length * width);
 }
}

 public class constructor
 {
	public static void main(String[] args) {
		Room room1=new Room(20,10);
		int area1=room1.area();
		System.out.println("Area= "+area1);
	}
}