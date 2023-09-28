package subject;

public class Total {
    String studentName;
    int koreanScore;
    int englishScore;
    int mathScore;


    public Total(String studentName,int koreanScore,int englishScore, int mathScore){
        this.studentName = studentName;
        this.koreanScore = koreanScore;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }
    public int totalSum(){
        return (koreanScore + englishScore + mathScore);
    }
    public int mean(){
        return totalSum() / 3;
    }
}
