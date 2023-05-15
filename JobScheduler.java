import java.util.Arrays;
import java.util.TreeMap;

public class JobScheduler{
       /**
    	* Job record is intended to organise the primitive-values in an object for easier access later
     	* and in oder to implement Comparable to ease the sorting process.
     	* @param start_time
     	* @param end_time
     	* @param profit
     	*/
	private record Job(int start_time, int end_time, int profit) implements Comparable<Job> {
        @Override
            public int compareTo(Job o) {
                return this.end_time - o.end_time;
	    }
	}
	
	public static void main(String[] args) {
        	int [][] input = {{1, 6, 6}, {2, 5, 5}, {5, 7, 5}, {6, 8, 3}};
		// take primitive values array and make a job array out of them
        	Job[] jobs = new Job[input.length];
		
        	for (int i = 0; i < jobs.length; i++) jobs[i] = new Job(input[i][0], input[i][1], input[i][2]);
       		// sort the jobs array according to job end times
        	Arrays.sort(jobs);

        	// TreeMap makes it faster to make the best possible sequence
        	TreeMap<Integer, Integer> map = new TreeMap<>();
        	map.put(0, 0);

        	System.out.println(maximiseProfit(jobs.length - 1, map, jobs));
    	}

       /**
     	* A recursive function that finds the maximum profit we could gain by finding the best sequence
     	*/
	public static int maximiseProfit(int i, TreeMap<Integer, Integer> map, Job[] jobs){
		// stopping condition 
        	if (i < 0) return 0;

        	Job j = jobs[i];
        	int profit = Math.max(maximiseProfit(i - 1, map, jobs), map.get(map.floorKey(j.start_time)) + j.profit);
        	map.put(j.end_time, profit);
        	return profit;
    	}
}
