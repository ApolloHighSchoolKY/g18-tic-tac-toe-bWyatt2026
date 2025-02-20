//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{	
		//Make sure to populate in default constructor
		mat = new char[3][3];
		mat[0][0] = 'X';
		mat[0][1] = 'X';
		mat[0][2] = 'O';
		mat[1][0] = 'X';
		mat[1][1] = 'O';
		mat[1][2] = 'X';
		mat[2][0] = 'X';
		mat[2][1] = 'O';
		mat[2][2] = 'X';
	}

	public TicTacToe(String game)
	{
		int checkChar = 0;
		//Row major order happens here

		for(int row = 0; row<mat.length; row++)
		{
		  for(int col = 0; col<mat[row].length; col++)
		  {
			mat[row][col] = game.charAt(checkChar);
		  }
		}

	}

	public String getWinner()
	{

		//Check if first letter is same as second, then check if second is same as third
		//		a=b, b=c, therefore a=c
		//9 level if statement

		//row win Checks
		if(mat[0][0] == mat[0][1] && mat[0][1] == mat[0][2])
		{
			return "Winner is: " + mat[0][0];
		}
		if(mat[1][0] == mat[1][1] && mat[0][1] == mat[1][2])
		{
			return "Winner is: " + mat[1][0];
		}
		if(mat[2][0] == mat[0][1] && mat[2][1] == mat[2][2])
		{
			return "Winner is: " + mat[2][0];
		}
		//Column win checks
		if(mat[0][0] == mat[1][0] && mat[1][0] == mat[2][0])
		{
			return "Winner is: " + mat[0][0];
		}
		if(mat[0][1] == mat[1][1] && mat[1][0] == mat[2][1])
		{
			return "Winner is: " + mat[0][1];
		}
		if(mat[0][2] == mat[1][2] && mat[1][2] == mat[2][2])
		{
			return "Winner is: " + mat[0][2];
		}
		//Diagonal win checks
		if(mat[0][0] == mat[1][1] && mat[1][1] == mat[2][2])
		{
			return "Winner is: " + mat[0][0];
		}
		if(mat[0][2] == mat[1][1] && mat[1][1] == mat[2][0])
		{
			return "Winner is: " + mat[0][2];
		}
		else
		{
			return "There has been a tie";
		}
	}

	public String toString()
	{
		String output="";

		for(int row = 0; row<mat.length; row++)
		{
			for(int col = 0; col<mat[row].length; col++)
			{
				output += mat[row][col];
			}
		  output += "\n";
		}


		return output+"\n\n";
	}
}