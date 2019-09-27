/*
Name: Susan Pinchiaroli
Assignment 3
Problem 4


In this problem, I created three loops, nested inside each other.
The outermost loop iterates through the testers used, starting from 4 up to 7
In this loop, we initiliaze the variables that will be used to accumulate the values used 
to find the average wait and average tester utilization. 

The next loop iterates through the 10 days. In this loop, we set the accumulator 
variables being used in the next loop equal to zero. We set unused testers,
unserved patients, totalpatients, and hours. 

The next loop is for the 8 hours in the day. This loop will first randomize 
the number of patients entering the testing center. then it will test for unused
unserved and total patients. After it completes 8 hours, it will exit this inner
loop and go to the end of the previous loop and accumulate the important variables 
on to totalunserved, totalunused, totaltotalpatients, and totaltotaltesters.
Then, once the 10 days have been completed. the program exits to the end of the 
tester loop and prints out the average from the 10 days. This program contineus until
we get to 7 testers. 



*/






import java.util.Random;
public class Problem4{
	public static void main(String[] args)
	{



		//analyze a lab that eprforms blood tests
		//each hour 1 to 10 patients enter lab\
		//testers are giving blood tests
		//must figure out how many testers should be avaialable per hour
		//one tester can only perform one test per hour
		//if the lab employs 5 testers and 5 patients enter, during that hour,
		//all patients are served, and there are no unused testers
		//If the lab employed 5 testers and 6 patients enter the lab, that one 
		//patient is unserved and is included in next patnens

		//Run 10 different and sistinct days of 8 hours.
		//calculate average wait percentage and tester utilization
		//over the 10 days for a certain number of testers. 


		//I have to pick a random number of patints that walk in per hour
		//then based on this amount calculate wait and utilization percents

		//wait  = unserved/total
		//utilization = used testers/total testers
		int testers=4;//ensure we use right testers
		int unserved;
		Random r = new Random();
		int hours;
		int patients;
		int unused;
		int totalPatients;
		int usedTesters;
		double averageTotalUtility;
		double averageTotalWait;
		double averageForTotalUnserved;
		double averageForTotalPatients ;
		double averageForTotalUsedTesters;
		 double averageForTotalTesters ;
		int otherPatients;
		int days;



		int average;
		int wait;

// i think i have to iterate until all numbers have completed these. Then we will calculate
		//averages. Do for each day as well. 
		
			
		while (testers<=7){
			 days=0;
			 int totalUnserved = 0;
			 int totalTotalPatients = 0;
			 int totalUsedTesters=0;
			 int totalTotalTesters=0;
			 
			

		while (days<10)
		{
			otherPatients=0;
			unserved = 0;
			hours = 0;
			unused = 0;
			totalPatients=0;
			//otherPatients=0;

			while (hours<8)//every hour
			{
				patients = r.nextInt(10)+1;//10 new patients walk in 
				//patients +=unserved;//add to current amount of patients the unserved.
				otherPatients+=patients;


				//create if else statements

				//if testers is greater than patients, then
				//unused amount of testers equapls differnce between testers and patients
				//
				if (testers>=otherPatients)
				{
					unused+=(testers-otherPatients);
					otherPatients = 0;
					//served+=patients
					
				}
				else if (testers<otherPatients)
				{
					unserved += -1*(testers-otherPatients);
					otherPatients -= testers;//this accounts for people being served

				}
				//do something with other patients


				totalPatients += patients; // this is right
				hours+=1;







			}

			 totalUnserved +=unserved;
			  totalTotalPatients +=totalPatients;
			  totalUsedTesters+=(testers*8-unused);
			  totalTotalTesters+=(testers*8);


			 


			days+=1;
			 
			




		}
			

		
		double outputWait = (((double)totalUnserved/totalTotalPatients)*100);
		double outputUtility = ((double)totalUsedTesters/totalTotalTesters)*100;
        // String  finalWait = (outputWait)*10;
         //String finalUtility = String.format("%.2f",(outputUtility)*100);
		

		String finalWait = String.format("%.2f",outputWait);
		String finalUtility = String.format("%.2f",outputUtility);

		System.out.println(testers + " Avg patient wait% "+finalWait +"% Avg tester Utilization: "+ finalUtility +"%");
		

		//System.out.println(testers + " avg patient wait "+ finalWait+ "Avg tester utility: "+ finalUtility);
		testers+=1;
	}
	}
}