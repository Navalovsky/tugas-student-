public class Teacher {
    private String subject;

    public Teacher() {
        this.subject = "";
    }

    public Teacher(String subject) {
        setSubject(subject);
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        if (subject == null || subject.trim().isEmpty()) {
            throw new IllegalArgumentException("Subjek tidak boleh null atau kosong");
        }
        this.subject = subject;
    }

    public String toString() {
        return "Teacher{" +
                "subject='" + subject + '\'' +
                '}';
    }
}