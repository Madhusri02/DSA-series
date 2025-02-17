class Solution {

    public void back( HashSet<String> res, boolean check[] , String cur , String tiles){

        res.add(cur);
        // check[]
        for(int i = 0 ; i<tiles.length() ; i++){
            if(!check[i]){
                check[i] = true;
                 back(res, check  , cur+ tiles.charAt(i)  , tiles);
                 check[i]= false;
            }
        }
    }

    public int numTilePossibilities(String tiles) {
        HashSet<String> res = new HashSet<>();
        boolean check[] = new boolean[tiles.length()+1];
        // ArrayList<String> seq = new ArrayList<>();
        String cur = "";
        back(res , check  , cur , tiles);
        return res.size()-1;
    }
}