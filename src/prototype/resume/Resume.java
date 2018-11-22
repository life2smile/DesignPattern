package prototype.resume;

/**
 * Created by wenzhi on 2018/11/22.
 */
public class Resume implements Cloneable{
    private String name;
    private String age;
    private Skills mSkill;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Skills getSkill() {
        return mSkill;
    }

    public void setSkill(Skills mSkill) {
        this.mSkill = mSkill;
    }

    @Override
    public Resume clone() throws CloneNotSupportedException {
        return (Resume) super.clone();
    }

    public Resume deepClone(){
        try {
            this.mSkill = (Skills) mSkill.clone();
            return this;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "name : " + name + " \nage: " + age + (mSkill == null ? "" : " \nskill: " + mSkill.toString());
    }
}
