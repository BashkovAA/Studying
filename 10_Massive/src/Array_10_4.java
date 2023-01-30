public class Array_10_4 {
    public static void main(String[] args) {
        int[][] studentsMarks = {
                {4, 5, 3, 2, 4},
                {3, 2, 2, 4, 5, 2},
                {3, 2, 2, 4, 2},
                {3, 2, 2, 4}
        };
        for (int i = 0; i < studentsMarks.length; i++) {
            System.out.println("Class " + i + " (" +  studentsMarks[i].length + " students):");
            for (int j = 0; j < studentsMarks[i].length; j++) {
                System.out.println("\t" + studentsMarks[i][j]);
            }
        }
    }
}
