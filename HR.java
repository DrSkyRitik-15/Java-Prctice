import java.util.Scanner;

abstract class EmployeeDetails {

    private String name;

    private int emp_id;

    public EmployeeDetails(String a, int b) {

        this.name = a;

        this.emp_id = b;

    }

    public void commonEmpDetaills() {

        System.out.println("Name = " + name);

        System.out.println("emp_ID = " + emp_id);

    }

    abstract void confidentialDetails();
}

class HR extends EmployeeDetails {

    private int s;

    String per;

    // write-your-code-here...

    public HR(String aa, int emp, int a, String bcc) {

        super(aa, emp);

        this.s = a;

        this.per = bcc;

    }

    public void confidentialDetails() {
        System.out.println("salary = " + s);
        System.out.printf("performance = %s%n", per);
    }

    public static void main(String[] arg) {

        int a;
        int b;

        String aa;
        String bb;

        Scanner AA = new Scanner(System.in);

        aa = AA.nextLine();

        a = AA.nextInt();

        AA.nextLine(); // Consume the newline after the integer input

        b = AA.nextInt();

        AA.nextLine(); // Consume the newline after the integer input

        bb = AA.nextLine();

        EmployeeDetails nj = new HR(aa, a, b, bb);

        nj.commonEmpDetaills();
        nj.confidentialDetails();

    }
}