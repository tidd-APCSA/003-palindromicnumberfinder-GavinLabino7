

public class PalindromicNumberFinder {
    private int num;

    // constructor
    public PalindromicNumberFinder(int num){
        this.num = num;
    }

    // accessor/getter method
    public int getNum(){
        return this.num;
    }

    // // this method should find the next palindromic number
    public int searchForPalindromicNum(int num){
        num++;
        while(!testPalindromicNum(num)){
          System.out.println(num);
          num+=1;
        }
        

        return num - getNum();

    }

    // // this is a helper method for searchForPalindromicNum. It's purpose is to test if a number is actually a palindrome
    public boolean testPalindromicNum(int num){
        int backwards = Integer.parseInt(reverseNum(num));

        if(backwards == num){
          return true;
        }else{
          return false;
        }
    }


    // this is a helper method for testPalindromicNum. It should reverse the number and return it.
    public String reverseNum(int num){
        String temp = Integer.toString(num);
        String reverse = "";
        for(int i=temp.length()-1; i>=0; i--){
          reverse = reverse + temp.substring(i,i+1);
        }
        return reverse;
    }


    // @Override
    public String toString(){
        return "You'd have to drive " + searchForPalindromicNum(this.num) + " miles";
    }
}
