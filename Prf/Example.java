import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);

		System.out.print("Input an integer : ");
		int num=input.nextInt();
		int rnum = 0;

		while (num%10 == 0){
			num /= 10;
		}
		while (num !=0 ){
			rnum *= 10;
			rnum += num%10;
			num /=10;
		}
		System.out.print(rnum);
	}
}