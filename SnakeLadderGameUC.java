public class SnakeLadderGameUC
{
	public static final int NO_PLAY = 0 ;
	public static final int LADDER = 1 ;
	public static final int SNAKE = 2 ;

	public int getInput()
	{
		int startPosition=0;
		int newPosition=0;
		int winPosition=100;
		int count=0;

		while (startPosition<winPosition)
		{
			int dieRoll = (int) (Math.random()*6)+1;
			int checkOption = (int) (Math.random()*3);
			count++;
			switch (checkOption)
			{
				case NO_PLAY :
					newPosition = 0;
					break;
				case LADDER :
					newPosition = dieRoll ;
					break;
				case SNAKE :
					newPosition = -dieRoll ;
					break;
			}

			startPosition = startPosition + newPosition;

			if (startPosition<0)
			{
				startPosition = 0;
			}
			else if (startPosition>100)
			{
				startPosition=newPosition;
			}
			System.out.println("Your are Now at "+startPosition+"th"+" Position");

		}
		System.out.println("\nCongratulation You are Win! \nAfter Die Rolled "+ count+" Times");
		return count;
	}

	public static void main(String[] args)
	{
		System.out.println("Welcome to the Snake and Ladder Game");


		SnakeLadderGameUC snl = new SnakeLadderGameUC();
		int firstPlayer=snl.getInput();
		int secondPlayer=snl.getInput();

		System.out.println("First Player ="+firstPlayer);
		System.out.println("Second Player ="+secondPlayer);

		if (firstPlayer<secondPlayer)
		{
			System.out.println("First Player Win..! After Die Rolled = "+firstPlayer);
		}
		else
		{
			System.out.println("Second Player Win..! After Die Rolled = "+secondPlayer);
		}
	}
}
