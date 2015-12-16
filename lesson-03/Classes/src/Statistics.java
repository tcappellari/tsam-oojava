
public class Statistics {
	
	int studentsAverageMarks(Student[] students) {
		float tot = 0;
		for(Student s: students) {
			tot += s.marksAverage(); // association
		}
		return Math.round(tot / students.length);		
	}

}
