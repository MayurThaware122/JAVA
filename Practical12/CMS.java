class Student {
    String name, branch, dob;
    static int count = 0;

    Student(String name, String branch, String dob) {
        this.name = name;
        this.branch = branch;
        this.dob = dob;
        count++;
    }

    public String toString() {
        return "Name: " + name + "\nBranch: " + branch + "\nDOB: " + dob;
    }
}
class RegularStudent extends Student {
    double mhcetScore;
    static int count = 0;

    RegularStudent(String name, String branch, String dob, double mhcetScore) {
        super(name, branch, dob);
        this.mhcetScore = mhcetScore;
        count++;
    }

    public String toString() {
        return super.toString() + "\nMHCET Score: " + mhcetScore;
    }
}
class DSYStudent extends Student {
    double diplomaScore;
    static int count = 0;

    DSYStudent(String name, String branch, String dob, double diplomaScore) {
        super(name, branch, dob);
        this.diplomaScore = diplomaScore;
        count++;
    }

    public String toString() {
        return super.toString() + "\nDiploma Score: " + diplomaScore;
    }
}
public class CMS {
    public static void main(String[] args) {
        RegularStudent rs1 = new RegularStudent("Manas Aware", "IT", "2004-08-12", 95.5);
        DSYStudent ds1 = new DSYStudent("Anjal Patil", "CSE", "2003-05-12", 95.5);
        RegularStudent rs2 = new RegularStudent("Rohit More", "IT", "2004-11-03", 96.5);
         DSYStudent ds2 = new DSYStudent("Parth Rarthord", "MECH", "2004-05-12", 95.5);

        System.out.println("Total Number of Students: " + Student.count);
        System.out.println("Total Number of Regular Students: " + RegularStudent.count);
        System.out.println("Total Number of DSY Students: " + DSYStudent.count);

        System.out.println(ds1);
        System.out.println("--------------");
        System.out.println(rs1);
        System.out.println("--------------");
        System.out.println(ds2);
        System.out.println("--------------");
        System.out.println(rs2);
    }
}
