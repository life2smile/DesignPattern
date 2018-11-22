import prototype.resume.Resume;
import prototype.resume.Skills;

/**
 * Created by wenzhi on 2018/10/24.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("\n");
        testShallowCopy(generateOriginResume());
        testDeepCopy(generateOriginResume());
    }

    private static Resume generateOriginResume() {
        Resume originResume = new Resume();
        originResume.setAge("21");
        originResume.setName("张三");
        Skills skills = new Skills();
        skills.setmEnglishLevel("6");
        skills.setmProfessionalSkill("proficient java");
        originResume.setSkill(skills);
        System.out.println("---------------origin resume----------------");
        System.out.println(originResume);
        return originResume;
    }


    private static void testShallowCopy(Resume resume) {
        try {
            Resume shallowCopyResume = resume.clone();
            shallowCopyResume.setAge("31");
            shallowCopyResume.getSkill().setmEnglishLevel("8");
            System.out.println("\nthe shallow copy resume: ");
            System.out.println(shallowCopyResume);

            System.out.println("\nafter shallow copy, the origin resume:（区别： age未发生变化， 但english level 发生变化！即原对象发生了变化！这就是浅copy)");
            System.out.println(resume);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("\n");
    }

    private static void testDeepCopy(Resume resume) {
        Resume secondResume = resume.deepClone();
        System.out.println("\nthe deep copy resume: ");
        System.out.println(secondResume);

        System.out.println("\nafter deep copy, then origin resume : 区别： age未发生变化， english level 也未发生变化！即原对象没有发生任何变化！这就是深copy)");
        System.out.println(resume);

    }
}
