public class Student {
    public Student(String name, long rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getRollno() {
        return rollno;
    }

    public void setRollno(long rollno) {
        this.rollno = rollno;
    }

    public double getMathScore() {
        return mathScore;
    }

    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }

    public double getScienceScore() {
        return scienceScore;
    }

    public void setScienceScore(double scienceScore) {
        this.scienceScore = scienceScore;
    }

    public double getEnglishSCore() {
        return englishSCore;
    }

    public void setEnglishSCore(double englishSCore) {
        this.englishSCore = englishSCore;
    }

    private long rollno;
    private double mathScore;
    private double scienceScore;
    private double englishSCore;
}
