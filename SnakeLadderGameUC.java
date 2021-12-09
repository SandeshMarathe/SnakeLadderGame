public class SnakeLadderGameUC
{
	public static void main(String args[])
	{
		int singlePlayer=0;

		System.out.println("Single Player at Start Position "+singlePlayer);

		int dieRoll = (int) (Math.random()*6)+1;

		System.out.println("Roll The Die Between 1 to 6 is ="+dieRoll);
	}
}
