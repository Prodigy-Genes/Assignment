import java.util.Scanner;
public class Assignment_Redo {
   public static void main(String[] args) {
    //midsemexams over 100;
    //endofSemexams over 100;
    //marks must be coverted to 100%;
    //output of final score;
    //output grade obtained by student;
    //table showing candidate's index number, final score and grade obtained;

    Scanner read = new Scanner(System.in);
    
    System.out.print("Enter Number Of Students: ");
    int students =read.nextInt();
    for(int i=0;i<students;i++){
        System.out.print("Enter Index Number: ");
        int index = read.nextInt();
        while(index>=9999999 || index<=1111111){
            System.out.print("\nNot An Index Number: ");
            index=read.nextInt();
        }

        System.out.println("\nEnter Marks For Midsem: ");
        float midsemexams = read.nextFloat();
        System.out.print("\nEnter Marks For End of Sem: ");
        float endofSemexams = read.nextFloat();
        while(midsemexams>100){
            System.out.println("\nMid-sem Marks Can't Be Greater Than 100! Fix Your Mistake!");
                midsemexams = read.nextFloat();
        }
        while(endofSemexams>100){
            System.out.println("\nEnd Of Semester Marks Can't Be Greater Than 100! Fix Your Mistake!");
                endofSemexams =read.nextFloat();
        }
        int finalMarks=(int)((midsemexams/100*30)+(endofSemexams/100*70));
        String grade="";
        switch(finalMarks/10){
            case 9:
                grade="A";
                break;
            case 8:
                grade="A";
                break;
            case 7:
                grade="A";
                break;
            case 6:
                grade="B";
                break;
            case 5:
                grade="C";
                break;
            case 4:
                grade="D";
                break;
            case 3:
                grade="F";
                break;
            case 2:
                grade="F";
                break;
            case 1:
                grade="F";
                break;
            case 0:
                grade="F";
                break;
            default:
                System.out.println("Invalid!");

            
            
           
            
            

        }
        System.out.println("Index Number\t\tFinal Marks\t\tGrade");
        System.out.println(index+"\t\t\t"+finalMarks+"\t\t\t"+grade);


            
        }
        read.close();
    }  
    
   } 

