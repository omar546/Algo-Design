public class JobScheduler{
	public static void main(String[] args) {
		
	}
	private record Job(int start_time, int end_time, int profit) implements Comparable<Job> {
        @Override
            public int compareTo(Job o) {
                return this.end_time - o.end_time;
            }
        }
	public static int maximiseProfit(int i, TreeMap<Integer, Integer> map, Job[] jobs){
        if (i < 0) return 0;
        Job j = jobs[i];
        int profit = Math.max(maximiseProfit(i - 1, map, jobs), map.get(map.floorKey(j.start_time)) + j.profit);
        map.put(j.end_time, profit);
        return profit;
    }
}
