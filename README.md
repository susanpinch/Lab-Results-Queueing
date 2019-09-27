# Lab-Results-Queueing
This problem will analyze the queueing problem for a lab that performs blood tests.
Question posed by professor:
The lab is trying to determine how many testers should be available each hour. 
Each hour 1 to 10 patients enter the lab. A tester can perform only one test per hour. 
If the lab employs  5 testers and 5 patients enter the lab  during the hour, then all patients are served, 
and there are no unused testers.  . If the lab employs  5 testers and 6 patients enter the lab , then one patient is 
unserved, and is included in the patients for the next hour.
We want to calculate the % of people who had to wait and the % of testers utilized.
For this day, 35 people entered the lab and 12 had to wait for 12/35 or 34%. The test utilization was 35 used testers over an 8 hour period for 35/40 or 88%. Use this data to test your program.

The analysis is to run 10 different and distinct days of 8 hours (only  1 day (timespan of 8 hours) is shown above) for 3  testers .
Calculate the average patient weight percentage and tester utilization defined above across the 10 days (8 hours as above)  
for a certain number of testers.  Each day will give you the 2 percentages above. Calculate the average for 4,5,6,7 testers. 
Your output format is:

3 testers  Avg  patient wait%:   xx.xx%    Avg. Tester Utilization:  xx.xx%
4 testers  Avg  patient wait%:   xx.xx%    Avg. Tester Utilization:  xx.xx%
5 testers  Avg  patient wait%:   xx.xx%    Avg. Tester Utilization:  xx.xx%
6 testers  Avg  patient wait%:   xx.xx%    Avg. Tester Utilization:  xx.xx%
7 testers  Avg  patient wait%:   xx.xx%    Avg. Tester Utilization:  xx.xx%

Start each day with no unserved patients. Any patients waiting to be served after your day (8 hours) ends, are counted as unserved, 
but are redirected to another lab at the end of the day.

Look at your results and see if they make sense. For instance the more testers you have, the less the test utilization will be.
