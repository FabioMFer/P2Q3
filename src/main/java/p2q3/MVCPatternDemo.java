package p2q3;


public class MVCPatternDemo {
	public static void main(String[] args) {

		// fetch student record based on his roll no from the database
		Student modelS = retriveStudentFromDatabase();

		// Create a view : to write student details on console
		StudentView viewS = new StudentView();

		Controller controller = new Controller(modelS, viewS);

		controller.updateView();

		// update model data
		controller.setName("John");

		controller.updateView();

		// fetch student record based on his roll no from the database
		Professor modelP = retriveProfessorFromDatabase();

		// Create a view : to write Professor details on console
		ProfessorView viewP = new ProfessorView();

		controller = new Controller(modelP, viewP);

		controller.updateView();

		// update model data
		controller.setName("Wick");

		controller.updateView();
	}

	private static Student retriveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Robert");
		student.setRollNo("10");
		return student;
	}
	private static Professor retriveProfessorFromDatabase() {
		Professor professor = new Professor();
		professor.setName("Edgard");
		professor.setRollNo("11");
		return professor;
	}

}