class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        int m = goal.length();

        for(int i = 0;i<n;i++){
            StringBuilder str = new StringBuilder();
            for(int j = 1;j<n;j++){
                str.append(s.charAt(j));
            }
            str.append(s.charAt(0));
            if(str.toString().equals(goal)){
                return true;
            }

            s = new String(str);
        }

        return false;
    }
}