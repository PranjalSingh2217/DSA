class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue <int[]> q=new ArrayDeque<>();
        int time=0;
        for(int 
        i=0;i<tickets.length;i++){
            q.add(new int[]{i,tickets[i]});
        }
        while(!q.isEmpty()){
            int[] person=q.remove();
            int index=person[0];
            int numberTicket=person[1];
             numberTicket--;
             time++;
             if(index==k && numberTicket==0){
                return time;
             }

             if(numberTicket>0){
                q.add(new int[]{index,numberTicket});
             }

        }
        return time;
    }
}