class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> stu=new LinkedList<>();
        Queue<Integer> sand=new LinkedList<>();
        for(int i=0;i<students.length;i++){
            stu.add(students[i]);
            sand.add(sandwiches[i]);
        }
        int count=0;
        while(!stu.isEmpty() && count<stu.size()){
            if(sand.peek()==stu.peek()){
                sand.remove();
                stu.remove();
                count=0;
            }
            else{
                stu.add(stu.remove());
                count++;
            }
        }
    return count;
}
}