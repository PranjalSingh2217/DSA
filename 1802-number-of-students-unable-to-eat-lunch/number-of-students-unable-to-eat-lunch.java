class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> stu=new LinkedList<>();
        Queue<Integer> sand=new LinkedList<>();
        for(int i=0;i<students.length;i++){
            stu.add(students[i]);
            sand.add(sandwiches[i]);
        }

    while(true){
                boolean target=false;
           for(int n:stu){
            if(sand.size()==0){
                return 0;
            }
            else if(sand.peek()==n){
                target=true;
                break;
            }
        }
        if(!target){
            return stu.size();
        }

        if(sand.peek()==stu.peek()){
            sand.remove();
            stu.remove();
        }
        else{
            int val=stu.peek();
            stu.remove();
            stu.add(val);        }

    }

    }
}