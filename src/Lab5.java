//Matthew Prindle Section C
public class Lab5 {

	public static void main(String[] args) {
		//Declare our variables
		int max = 6;
		int num = 1;
		
		//initialize the loop, make sure it only runs until the number we want, and increment to make sure its not a dead loop
		for (num = 1; num <= max; ++num)
		{
			System.out.print(num);
			//using an if statement we can reset the loop when we reach our max number
			if (num == max)
			{
				//use println to put a line between each loop reset
				System.out.println();
				//we set num back to 0 because of the loop increment
				num = 0; 
				//we decrement our max to not print out to 6 each line
				--max;
			}
		}
	}
}
