# Algo-Design
Assignment for the Algorithm design course @fcds


## Job Scheduling Algorithm
This repository contains code for a job scheduling algorithm implemented in two different programming languages: Java and Python.

### Java Implementation
The Java implementation uses the Job class and a TreeMap data structure. The Job class represents a job with its start time, end time, and profit. The jobs are sorted based on their end times using the compareTo method. The maximiseProfit method recursively calculates the maximum profit by considering each job and the profits obtained by including or excluding it. The main method demonstrates the usage of the algorithm by providing sample input and printing the maximum profit achieved.

### Python Implementation
The Python implementation defines the JobScheduling function that takes an array of jobs as input. The algorithm works as follows:

It determines the number of jobs to be scheduled by counting the unique end times.
The array of jobs is sorted in decreasing order based on their profit.
Two lists, job_id and job_profit, are initialized to store the job IDs and profits for the scheduled jobs.
The algorithm finds a free slot for each job by iterating through the sorted array and checking for an available slot starting from the job's end time. If a free slot is found, the job is scheduled by updating the respective lists.
Finally, the number of scheduled jobs and the sum of their profits are printed.
Please note that the Python implementation uses Python 3 syntax.

Usage
To use either of the implementations, follow these steps:

Clone the repository.
Open the desired file (algorithm_design.java for Java or job_scheduling.py for Python) in your preferred development environment.
Provide input if necessary (in the code or through user input).
Run the program.
The output will be displayed, showing the maximum profit achieved and additional information, depending on the implementation.