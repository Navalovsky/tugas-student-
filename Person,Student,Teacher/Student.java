public class Student {
    private int studentNumber;
    private int score;
    private String major;

    public Student() {
        this(0, 0, "");
    }

    public Student(int studentNumber, int score, String major) {
        this.studentNumber = studentNumber;
        setScore(score);
        this.major = major;
    }

    public int getStudentNumber() {
        return this.studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Skor harus antara 0 dan 100");
        }
        this.score = score;
    }

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String toString() {
        return "Student{" +
                "studentNumber=" + studentNumber +
                ", score=" + score +
                ", major='" + major + '\'' +
                '}';
    }
}