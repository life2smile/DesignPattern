package builder;

/**
 * Created by wenzhi on 2018/11/22.
 */
public class Main {
    public static void main(String[] args) {
        Ultraman.Builder builder = new Ultraman.Builder();

        builder.setCloak("red cloak")
                .setShoes("black shoes")
                .setTrousers("gray trousers");

        builder.build().displayUltramanDress();
    }
}
