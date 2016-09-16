import java.util.Scanner;

public class passerRating {

	public static void main(String[] args) {
		Scanner datainput=new Scanner(System.in);
		//Local Variables
		
		double numOfAttempts;
		double numOfCompletions;
		double passingYards;
		double touchdownPasses;
		double interceptions;
		
		
		//Questions being asked and inputs
			System.out.println("Number of passing attempts:");
			numOfAttempts = datainput.nextDouble();
			
			System.out.println("Number of completed passes:");
			numOfCompletions = datainput.nextDouble();
			
			System.out.println("Number of passing yards:");
			passingYards = datainput.nextDouble();
			
			System.out.println("Number of touchdown passes:");
			touchdownPasses = datainput.nextDouble();
			
			System.out.println("Number of thrown interceptions:");
			interceptions = datainput.nextDouble();
			
		
			//calculations
			double calculation1 = 
					((numOfCompletions/numOfAttempts)-0.3)*5;
			
			double calculation2 = 
					((passingYards/numOfAttempts)-3)*0.25;
			
			double calculation3 = 
					(touchdownPasses/numOfAttempts)*20;
			
			double calculation4 = 
					(2.375-(interceptions/numOfAttempts)*25);
			
			double mainCalculation = 
					((calculation1+calculation2+calculation3+calculation4)/6)*100;
			
			System.out.printf("The passer rating for this quarterback is: %.1f", mainCalculation,"%");
					
					
					


	}

}
