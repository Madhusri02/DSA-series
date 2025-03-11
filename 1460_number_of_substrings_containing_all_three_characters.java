class Solution {
    HashSet<String> str = new HashSet<>();

    public void check(String st){

        int n = st.length();
        for(int i = 0 ; i<=n ; i++){
            for(int j = i+1 ; j<=n ; j++){
                String summa  = st.substring(i,j);
                if(!str.contains(summa) && summa.length()>=3){
                str.add(st.substring(i,j));
                System.out.println(st.substring(i,j));
                }
            }
        }


    }
    public int numberOfSubstrings(String s) {

        int res = 0 , c= 0 ;
        // for(int i =0 ; i < )
        check(s);
        for(String ch : str){
            c = 0;
            if(ch.length()>=3){
                for(int i = 1 ; i<ch.length()-1 ; i++){
                    if(ch.charAt(i-1)!=ch.charAt(i) && ch.charAt(i)!=ch.charAt(i+1) && ch.charAt(i-1)!=ch.charAt(i+1)){
                        c+=3;
                    }
                    if(c==3){
                        // c= 0;
                        res++;
                        break;
                    }
                }
            }
        }

        return res;
        

        
    }
}