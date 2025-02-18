class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean check[] = new boolean[n];
        Queue<Integer> qu = new LinkedList<>();
        int c = 0;
        qu.add(0);
        while(!qu.isEmpty()){
            int rem = qu.poll();
            if(check[rem]!=true){
                check[rem] = true;
                c++;
                for(int num : rooms.get(rem)){
                    qu.add(num);
                }
            }
        }

        return c==n;

        // for(boolean num : check){
        //     if(num==false) return false;
            
        // }

        // return true;
        
    }
}