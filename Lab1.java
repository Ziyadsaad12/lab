import java.util.Scanner;
public class Lab1 {
  

    public static void main(String[] args) {
        // Task 1
        int Side; double Sidelength; double Result;
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the number of sides: ");
        Side= input.nextInt();
        System.out.printf("Enter the side: ");
        Sidelength= input.nextFloat();
          Result = (Side*Math.pow(Sidelength, 2))/(4*Math.tan(Math.PI/Side));
        
        
        System.out.printf("The area of the polygon is %.14f\n",Result);
 
        // Task 2
        int student, i; double gpa=0;
        System.out.println("How many student?: ");
        student = input.nextInt();
        System.out.printf("Enter %d letter grades:",student);
        for ( i=0; i<student;i++) {
            String grade = input.next();
            
            switch (grade.toLowerCase()){
                case "a+": gpa += 4; break;
                case "a": gpa += 3.75; break;
                case "b+": gpa +=3.5; break;
                case "b": gpa+=3;break;
                case "c+": gpa+=2.5;break;
                case "c": gpa+=2;break;
                case "d+": gpa+=1.5;break;
                case "d": gpa+=1;break;
                default: gpa+=0;
            }
        }
    double gparesult = gpa/student;
    System.out.printf("GPA = %f", gparesult);
    
    
    }
    
}


