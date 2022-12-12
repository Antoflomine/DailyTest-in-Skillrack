import java.util.*;
public class Hello {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	String a="";
	for(int i=0;i<str.length();i++){
	    for(int j=0;j<str.length();j++){
	    if(str.charAt(i)==str.charAt(j)){
	        a=str.substring(0,j+1);
	        break;
	    }
	    }
	}
	String m="";
	if(str.contains(a)){
	    str=str.replaceAll(a,"1");
	}
	int c=0;
	for(int i=0;i<str.length();i++){
	    if(str.charAt(i)=='1'){
	        c++;
	    }
	}
	if(c==4){
	    System.out.print("yes");
	}
	else{
	    System.out.print("no");
	}
//	System.out.print(str);

	}
}
