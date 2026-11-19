import java.util.*;
public class Greedy6{
    static class Job{
        int id;
        int deadline;
        int profit;
        public Job(int id,int deadline, int profit)
        {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }
    public static void main(String[] args){
        int jobs[][] = {{4,20}, {1,10}, {1,40}, {1,30}};
        ArrayList<Job> jobList = new ArrayList<>();
        for(int i=0;i<jobs.length;i++){
            jobList.add(new Job(i,jobs[i][0],jobs[i][1]));
        }
        Collections.sort(jobList,(a,b)->b.profit-a.profit);
        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for(int i=0;i<jobList.size();i++){
            Job curr = jobList.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                time++;
            }
        }
        System.out.println("Max number of jobs = " + seq.size());
        for(int i=0;i<seq.size();i++){
            System.out.print(seq.get(i) + " ");
        }
        System.out.println();
    }
}
