def JobScheduling(arr):
    n=len(arr)

    #To Get Number of Jobs to Schedule
    x=[]
    for i in range(len(arr)):
        x.append(arr[i][1])
    t=len(set(x))

    #To Sort array in Decreasing order According to profit
    for i in range(n):
        for j in range(n-1-i):
            if arr[j][2] < arr[j+1][2]:
                arr[j],arr[j+1]=arr[j+1],arr[j]
    #Find a free slot for each job
    for i in range(n):
        for j in range(min(t-1,arr[i][1]-1),-1,-1):
            if job_id[j] == -1:
                job_id[j] = arr[i][0]
                job_profit[j] = arr[i][2]
                break
    print(len(job_id))
    print(sum(job_profit)) 
