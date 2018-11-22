package prototype.resume;

/**
 * Created by wenzhi on 2018/11/22.
 */
public class Skills implements Cloneable{
    private String mEnglishLevel;
    private String mProfessionalSkill;

    public String getmEnglishLevel() {
        return mEnglishLevel;
    }

    public void setmEnglishLevel(String mEnglishLevel) {
        this.mEnglishLevel = mEnglishLevel;
    }

    public String getmProfessionalSkill() {
        return mProfessionalSkill;
    }

    public void setmProfessionalSkill(String mProfessionalSkill) {
        this.mProfessionalSkill = mProfessionalSkill;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "english level = " + mEnglishLevel + " \nprofessional skill = " + mProfessionalSkill;
    }
}
