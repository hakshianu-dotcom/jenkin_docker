public class Grade {

    public static void main(String[] args) {

        double avg = 85.5; // sample input (you can change)

        System.out.println("Average: " + avg);

        System.out.println("Letter grade: " + gradeFunction(avg));
    }

    // ✅ FIXED missing method
    public static String gradeFunction(double avg) {
        if (avg >= 90) return "A";
        else if (avg >= 80) return "B";
        else if (avg >= 70) return "C";
        else if (avg >= 60) return "D";
        else return "F";
    }
}
