import java.util.*;
class kshitij_hashAlgo {
  public static void main(String[] args) {
    char helloarr[] = {'w','e','l','c','o','m','e','t','o','m','y','a','l','g','o','H','e','l','l','o','f','r','i','e','n','d'};
  for(int in=0;in<helloarr.length;in++){
      try {
        Thread.sleep(300);
    } catch (Exception e) {
        e.printStackTrace();
     }
      System.out.print(helloarr[in]);
      if(in==6){
           System.out.println();
      }
      else if(in==8){
        System.out.println();

      }
      else if(in==10){
        System.out.println();

      }
      else if(in==14){
        System.out.println();

      }
      else if(in==19){
        System.out.print(" ");

      }
    } 
    System.out.println();
    

    int time = 10;
    for(int in=0;in<time;in++){
      for(int jn=0;jn<time;jn++){
          if(in==5){
                System.out.println("github.com/kshitijmandle");
                break;
          }
        try {
          Thread.sleep(5);
      } catch (Exception e) {
          e.printStackTrace();
        }
        System.out.print("01");
        
      }
      System.out.println();
      
    }
    
    
  
    System.out.println();
    System.out.println("What you want , Encrypt/Decrypt ! press '1' for encrypt or '0' for decrypt ");
    Scanner sc = new Scanner(System.in);
    int encrypt = 1;
    int decrypt = 0;
    int getinput = sc.nextInt();
    if(getinput==encrypt){
           encrypt();
    }
    else{
          decrypt();
    }
  }
      
     

   static void encrypt(){
    String str , Newstr=" ";  
    System.out.println("Enter the String you want to Encrypt: "); 
    
    try {  
        Scanner in=new Scanner(System.in);  
        str=in.nextLine();  
        System.out.print("Encrypting");
        int time = 5;
        for(int jn=0;jn<time;jn++){
            try {
              Thread.sleep(800);
          } catch (Exception e) {
              e.printStackTrace();
            }
            System.out.print(" .");
          }
        System.out.println();
        
    for (int i=0;i<str.length();i++)  
    {  
        char ch=Character.toLowerCase(str.charAt(i));  
        switch (ch)  
        {  
            case 'a':  
                Newstr=Newstr+"{";  
                break;  
            case 'b':  
                Newstr=Newstr+"}";  
                break;  
            case 'c':  
                Newstr=Newstr+"#";  
                break;  
            case 'd':  
                Newstr=Newstr+"~";  
                break;  
            case 'e':  
                Newstr=Newstr+"+";  
                break;  
            case 'f':  
                Newstr=Newstr+"-";  
                break;  
            case 'g':  
                Newstr=Newstr+"*";  
                break;  
            case 'h':  
                Newstr=Newstr+"@";  
                break;  
            case 'i':  
                Newstr=Newstr+"/";  
                break;  
            case 'j':  
                Newstr=Newstr+"\\";  
                break;  
            case 'k':  
                Newstr=Newstr+"?";  
                break;  
            case 'l':  
                Newstr=Newstr+"$";  
                break;  
            case 'm':  
                Newstr=Newstr+"!";  
                break;  
            case 'n':  
                Newstr=Newstr+"^";  
                break;  
            case 'o':  
                Newstr=Newstr+"(";  
                break;  
            case 'p':  
                Newstr=Newstr+")";  
                break;  
            case 'q':  
                Newstr=Newstr+"<";  
                break;  
            case 'r':  
                Newstr=Newstr+">";  
                break;  
            case 's' :  
                Newstr=Newstr+"=";  
                break;  
            case 't':  
                Newstr=Newstr+";";  
                break;  
            case 'u':  
                Newstr=Newstr+",";  
                break;  
            case 'v' :  
                Newstr=Newstr+"_";  
                break;  
            case 'w':  
                Newstr=Newstr+"[";  
                break;  
            case 'x' :  
                Newstr=Newstr+"]";  
                break;  
            case 'y':  
                Newstr=Newstr+":";  
                break;  
            case 'z' :  
                Newstr=Newstr+"\"";  
                break;  
            case ' ' :  
                Newstr=Newstr+" ";  
                break;  
            case '.':  
                Newstr=Newstr+'3';  
                break;  
            case ',':  
                Newstr=Newstr+"1";  
                break;  
            case '(':  
                Newstr=Newstr+'4';  
                break;  
            case '\"':  
                Newstr=Newstr+'5';  
                break;  
            case ')' :  
                Newstr=Newstr+"7";  
                break;  
            case '?' :  
                Newstr= Newstr+"2";  
                break;  
            case '!':  
                Newstr= Newstr+"8";  
                break;  
            case '-' :  
                Newstr= Newstr+"6";  
                break;  
            case '%' :  
                Newstr = Newstr+"9";  
                break;  
            case '1':  
                Newstr=Newstr+"r";  
                break;  
            case '2':  
                Newstr=Newstr+"k";  
                break;  
            case '3':  
                Newstr=Newstr+"b";  
                break;  
            case '4':  
                Newstr = Newstr+"e";  
                break;  
            case '5':  
                Newstr = Newstr+"q";  
                break;  
            case '6':  
                Newstr = Newstr+"h";  
                break;  
            case '7':  
                Newstr = Newstr+"u";  
                break;  
            case '8' :  
                Newstr= Newstr+"y";  
                break;  
            case '9':  
                Newstr = Newstr+"w";  
                break;  
            case '0':  
                Newstr = Newstr+"z";  
                break;  
             default:  
                Newstr=Newstr+"0";  
                break;  
        }  
    }  
    }  
    catch(Exception ioe)  
    {  
        ioe.printStackTrace();  
    }  
    System.out.println("The encrypted string is : \n" + Newstr);  
}   


    
    


   
  static void decrypt(){
    String str, Newstr = "";  
        System.out.println("Enter the String you want to Decrypt ");  
       
        try {  
        Scanner in=new Scanner(System.in);  
        str=in.nextLine(); 
        System.out.println();
        System.out.print("Decrypting.............");
        System.out.println(); 
        int time = 5;
        for(int inn=0;inn<time;inn++){
          for(int jn=0;jn<inn;jn++){
            try {
              Thread.sleep(1000);
          } catch (Exception e) {
              e.printStackTrace();
            }
            System.out.print(".");
          }
          System.out.println();
        }
        for (int i=0;i<str.length();i++)  
        {  
            char ch=Character.toLowerCase(str.charAt(i));  
            switch (ch)  
            {  
                case '{':  
                    Newstr=Newstr+"a";  
                    break;  
                case '}':  
                    Newstr=Newstr+"b";  
                    break;  
                case '#':  
                    Newstr=Newstr+"c";  
                    break;  
                case '~':  
                    Newstr=Newstr+"d";  
                    break;  
                case '+':  
                    Newstr=Newstr+"e";  
                    break;  
                case '-':  
                    Newstr=Newstr+"f";  
                    break;  
                case '*':  
                    Newstr=Newstr+"g";  
                    break;  
                case '@':  
                    Newstr=Newstr+"h";  
                    break;  
                case '/':  
                    Newstr=Newstr+"i";  
                    break;  
                case '\\':  
                    Newstr=Newstr+"j";  
                    break;  
                case '?':  
                    Newstr=Newstr+"k";  
                    break;  
                case '$':  
                    Newstr=Newstr+"l";  
                    break;  
                case '!':  
                    Newstr=Newstr+"m";  
                    break;  
                case '^':  
                    Newstr=Newstr+"n";  
                    break;  
                case '(':  
                    Newstr=Newstr+"o";  
                    break;  
                case ')':  
                    Newstr=Newstr+"p";  
                    break;  
                case '<':  
                    Newstr=Newstr+"q";  
                    break;  
                case '>':  
                    Newstr=Newstr+"r";  
                    break;  
                case '=' :  
                    Newstr=Newstr+"s";  
                    break;  
                case ';':  
                    Newstr=Newstr+"t";  
                    break;  
                case ',':  
                    Newstr=Newstr+"u";  
                    break;  
                case '_' :  
                    Newstr=Newstr+"v";  
                    break;  
                case '[':  
                    Newstr=Newstr+"w";  
                    break;  
                case ']' :  
                    Newstr=Newstr+"x";  
                    break;  
                case ':':  
                    Newstr=Newstr+"y";  
                    break;  
                case '\"' :  
                    Newstr=Newstr+"z";  
                    break;       
                case '1':  
                    Newstr=Newstr+"r";  
                    break;  
                case '2':  
                    Newstr=Newstr+"k";  
                    break;  
                case '3':  
                    Newstr=Newstr+"b";  
                    break;  
                case '4':  
                    Newstr = Newstr+"e";  
                    break;  
                case '5':  
                    Newstr = Newstr+"q";  
                    break;  
                case '6':  
                    Newstr = Newstr+"h";  
                    break;  
                case '7':  
                    Newstr = Newstr+"u";  
                    break;  
                case '8' :  
                    Newstr= Newstr+"y";  
                    break;  
                case '9':  
                    Newstr = Newstr+"w";  
                    break;  
                case '0':  
                    Newstr = Newstr+"z";  
                    break;  
                 default:  
                    Newstr=Newstr+"0";  
                    break;  
            }  
        }  
        }  
        catch(Exception ioe)  
        {  
            ioe.printStackTrace();  
        }  
        System.out.println(" The decrypted string is: " + Newstr);  
    }   
  
 
}

