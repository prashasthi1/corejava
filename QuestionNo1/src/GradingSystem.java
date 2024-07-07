import java.util.Scanner;
public class GradingSystem {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner s = new Scanner(System.in);
        
		System.out.print("Enter Maths score : ");
		int math = s.nextInt();

		System.out.print("Enter Science score : ");
		int science = s.nextInt();
		
		System.out.print("Enter English score : ");
		int english = s.nextInt();
		
		double average = (math + science + english)/3.0;
		
		String grade;
		
		if(math < 30 || science < 30 || english < 30) {
			grade = "F";
		}
			else if(average >= 90){
				grade = "A";
			}
			else if(average >= 70 && average <= 80 ){
				grade = "B";
			}
			else if(average >=  50 && average <= 69 ){
				grade = "B";
			}
			else {
				grade = "F";
			}
		 System.out.print("Final grade : " + grade);
		   
		}
		
	

}
