public class EmployeePayrollData {
        int id;
        String name;
        double salary;

	public EmployeePayrollData(Integer id, String name, Double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        @Override
        public String toString() {
	    return "id= " + id + ", name= "+ name + ", salary " + salary;
	}
}
