package Blatt02;
	
	public class Fahrenheit4 {
		
		public static void main(String[] args) {
	
			final int UPPER = 250; 
			final int LOWER =   0; 
			final int STEP  =  25; 
			final int NUM_PER_ROW = 5;
			double i = 0;
			for (int fahrenheit = LOWER; fahrenheit <= UPPER; fahrenheit = fahrenheit + STEP )	{
				int celsius = 5 * (fahrenheit - 32) / 9;
				i++;
				System.out.print(fahrenheit + "°F = " + celsius + "°C       ");
				if (i % NUM_PER_ROW == 0) {
					System.out.println(" ");
				}
			}
		}
	}