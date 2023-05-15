import java.util.Arrays;
import java.util.TreeMap;

public class JobScheduler{
	private record Job(int start_time, int end_time, int profit) implements Comparable<Job> {
        @Override
            public int compareTo(Job o) {
                return this.end_time - o.end_time;
	    }
	}
	
	public static void main(String[] args) {
        	int [][] input = {{1, 6, 6}, {2, 5, 5}, {5, 7, 5}, {6, 8, 3}};
        	Job[] jobs = new Job[input.length];
        	for (int i = 0; i < jobs.length; i++) jobs[i] = new Job(input[i][0], input[i][1], input[i][2]);

        	Arrays.sort(jobs);

        	TreeMap<Integer, Integer> map = new TreeMap<>();
        	map.put(0, 0);

        	System.out.println(maximiseProfit(jobs.length - 1, map, jobs));
    	}
	
	public static int maximiseProfit(int i, TreeMap<Integer, Integer> map, Job[] jobs){
        	if (i < 0) return 0;
        	Job j = jobs[i];
        	int profit = Math.max(maximiseProfit(i - 1, map, jobs), map.get(map.floorKey(j.start_time)) + j.profit);
        	map.put(j.end_time, profit);
        	return profit;
    	}
}
