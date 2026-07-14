class Solution {
    public int maximumWealth(int[][] accounts) {
      
        int highestWealth=0;
        for(int i=0;i<accounts.length;i++){
              int tot=0;
            for(int j=0;j<accounts[i].length;j++){
                tot+=accounts[i][j] ;
                  
                      }
                       if(tot>highestWealth){
                        highestWealth=tot;
                }
    
        }
        return highestWealth;
    }
}