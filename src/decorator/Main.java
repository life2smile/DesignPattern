package decorator;

import decorator.hero.CryStalHuaMuLan;
import decorator.hero.DefSkinHuaMuLan;
import decorator.hero.IHero;

/**
 * Created by wenzhi on 2018/10/29.
 */
public class Main {
    public static void main(String[] args) {
        IHero cryStalHuaMuLan = new CryStalHuaMuLan(new DefSkinHuaMuLan());
        cryStalHuaMuLan.create();
    }
}
