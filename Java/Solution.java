import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here

class MyRegex {
    public  final String pattern =
        "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
 
}


/* ^                     # match the start of the string
(
  [01]?\\d\\d?        # match one or two digits, allowing leading zeros
  |                   # or
  2[0-4]\\d          # match a "2" followed by a digit in the range 0-4, followed by any digit
  |                   # or
  25[0-5]             # match "25" followed by a digit in the range 0-5
)
\.                    # match a literal period
...                   # repeat the previous three lines two more times
(
  [01]?\\d\\d?
  |
  2[0-4]\\d
  |
  25[0-5]
)
$                     # match the end of the string
 */
