
public class Main {

	public static void main(String[] args) {
		
		Student luca = new Student();
		
		// dot operator
		luca.name = "Luca";
		luca.surname = "Rossi";
		luca.age = 28;
		luca.marks = new int[] {2,7,6,4};
		
		Student marco = new Student();
		marco.name = "Marco";
		marco.surname = "Bianchi";
		
		int age = luca.age + 1;
		marco.age = age;
		marco.marks = new int[] {8,7,9,2};
		
		int lucaAvgMarks = luca.marksAverage();
		System.out.println("Luca marks average: " + lucaAvgMarks);
		
		System.out.println("Marco marks average: " + marco.marksAverage());
		
		// Constructor
		Student giovanni = new Student("Giovanni", "Viola");

		//
		
		Statistics stats = new Statistics();
		int avg = stats.studentsAverageMarks(new Student[]{luca, marco});
		System.out.println("Average: " + avg);
	}

}
