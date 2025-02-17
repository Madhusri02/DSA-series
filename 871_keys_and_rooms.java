class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        // ArrayList<Integer>[] grp = new ArrayList[rooms.size()];
        // for(int i = 0 ; i<rooms.size() ; i++){
        //     grp[i] = new ArrayList<>();
        // }
        boolean check[] = new boolean[rooms.size()];
        Queue<Integer> qu = new LinkedList<>();
        // int min = Integer.MAX_VALUE;
        // for(int i=0 ; i<rooms.size() ; i++){
        //     for(int j = 0 ; j<rooms.get(i).size() ; j++){
        //         grp[i].add(rooms.get(i).get(j)); 
               
        //         // min = Math.min(min , rooms[i][j]);
        //     }
        // }

        qu.add(0);
        while(!qu.isEmpty()){
            int rem = qu.poll();
            
            if(check[rem]!=true){
                check[rem] = true;
            for(int num : rooms.get(rem)){
                System.out.println("rem : " + rem +" the num : " + num);;
                // check[num] = true;
                qu.add(num);
            }
            }
        }

        for(boolean num : check){
            if(num==false) return false;
            
        }

        return true;
        
    }
}