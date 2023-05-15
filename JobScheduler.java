public class JobScheduler{
	public static void main(String[] args) {
		
	}
private record Job(int start_time, int end_time, int profit) implements Comparable<Job> {
        @Override
            public int compareTo(Job o) {
                return this.end_time - o.end_time;
            }
        }
}

