package Strings;
//import java.util.*;
public class StringsBasic{
    public static int firstOccurance (String str1, String str2){
        int n= str1.length();
        int m= str2.length();

        for(int i=0;i<=n-m;i++){
            if(str1.substring(i,i+m).equals(str2))return i;
        }
        return -1;

    }
    public static void main(String[]args){
        //char[] arr= new char[10];
        // String str= "College wallah";
        // System.out.println(str);

        //Input ->nextLine(); 
        // Scanner sc= new Scanner(System.in);
        // String s= sc.nextLine();
        // System.out.println(s);

        //length()
        // String str= "Hello";
        // int len= str.length();
        // System.out.println(len);

        //charAt
        // String str= "Hello";
        // System.out.println(str.charAt(0));

        // indexOf
        // String str= "Java";
        // int idx= str.indexOf("j");
        // System.out.println(idx);

        //compareTo() 
        // String str1= "Tello";
        // String str2= "Pello";
        // System.out.println(str1.compareTo(str2));
        // String str= "Heklllom";
        // String str2="klm";
        // System.out.print(str.contains(str2));
        //str.startWith("jfdsk")
        //str.endWith("ghiog")
        //str.toLowerCase();
        //str.toUpperCase();
    //    String str1= "Heelo";
    //    String rev="";
    //    for(int i=str1.length()-1;i>=0;i--){
    //     char ch=str1.charAt(i);
    //     rev+= ch;
    //    }
    //    System.out.println(rev);
    //     //
    //    String s1="Hello";
    //    String s2="World";
    //    System.out.println(s1.concat(s2));
    // String str1="GeeksForGeeks";
    // String str2= "For";
    // System.out.println(firstOccurance(str1,str2));

    // SUBSTRING (a,b) a included and b exculded

//     String s= "Hello";

//     //-> heylo
//     s=s.substring(0,2)+"y"+s.substring(3);
// System.out.println(s);

//-> ==(No) s1.equals(s2)
// String builder-> stringBuilder();

// setCharAt
// StringBuilder sb = new StringBuilder("Hello");
// sb.setCharAt(0,'m');
// System.out.println(sb);

// append(ch/string/int/kuch v)

// sb.append(true);
// System.out.println(sb);

//insert(idx,ch)

// sb.insert(3,'y');
// System.out.println(sb);

//deleteCharAt(idx)

// sb.deleteCharAt(2);
// System.out.println(sb);

// sb.reverse() / ya fir charAt s swap v kr skte

// sb.reverse();
// System.out.println(sb);

// sb.delete(2,4) do not include last index

//Toggle
//Physics -> pHYSICS
//Using String Builder

// Scanner sc= new Scanner(System.in);

// StringBuilder str= new StringBuilder(sc.nextLine());
// for(int i=0;i<str.length();i++){

//     int asci=(int) str.charAt(i);
//     if(str.charAt(i)==' ')continue;
   
//     boolean flag=false;
    
//     if(asci>=65 && asci<=91){
//     flag = true;}
//     if(flag==true){
//         asci+=32;
//         char dh= (char)asci;
//         str.setCharAt(i,dh);
//     }
//     else{
//         asci-=32;
//         char dh=(char)asci;
//         str.setCharAt(i,dh);
//     }
       
    
// }
// System.out.println(str);;

// USING String

// Scanner sc= new Scanner (System.in);
// String str= sc.nextLine();
// String toggle="";

// for(int i=0;i<str.length();i++){
//     char ch = str.charAt(i);
//     int asci= (char)ch;
//     if(ch==' '){
//         toggle+=' ';
//         continue;}
    
//     if(asci>=65 && asci<=91){
//         asci+=32;
//         ch=(char)asci;
//        toggle+=ch;
//     }
//     else{
//         asci-=32;
    
//         ch= (char)asci;
//         toggle+=ch;
    
//     }

// }
// System.out.println(toggle);

// Print all subSting
// String a= "abc";
// for(int i=0;i<=a.length();i++){
//     for(int j=i+1;j<=a.length();j++){
//         System.out.println(a.substring(i,j));
//     }
// }

// Substring pallindrone

// String str="abc";
// String ans="";
// int count=0;
// for(int i=0;i<=str.length();i++){
//     for(int j=i;j<=str.length();j++){
//         StringBuilder s=new StringBuilder( str.substring(i, j));
//         if(s.equals(s.reverse())){
//             ans+=s+" ";
//             count++;
//         }
//     }
// }
// System.out.println(ans);
// System.out.println(count/2); 

//REVERSE EACH WORD OF A STRING
//-> Input: I am a educator
//-> output: i ma na rotacude

// String s= "I am a educator";
// String[]word= s.split(" ");
// String rev="";
// for(String words: word){
//     StringBuilder sb= new StringBuilder(words);
//     String revword= sb.reverse()+"";
//     rev+=revword+" ";
// }
// System.out.println(rev);

// CONSUCITIVE CHAR
// INPUT-> aaabbbbccdde
//output-> a3b4c2d3e

String s="aaabbbbccddeeeee";
//StringBuilder sb= new StringBuilder("");
String ans=""+s.charAt(0);
int count=1;

for(int i=1;i<s.length();i++){
    char curr = s.charAt(i);
    char prev= s.charAt(i-1);
    if(curr==prev){
        count++;
    }
   
    else{
       if(count>1) ans+=count;
        count=1;
        ans+=curr;
    }
}
ans+=count;
System.out.println(ans);
    }
}