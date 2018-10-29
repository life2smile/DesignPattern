package decorator.hero;

import decorator.skin.DefaultSkin;
import decorator.skin.ISkin;

/**
 * Created by wenzhi on 2018/10/29.
 */
public class DefSkinHuaMuLan implements IHero {
    @Override
    public void create() {
        //构造应用
        System.out.println("create hero...");
        //穿衣服
        ISkin skin = new DefaultSkin();
        skin.skin();
    }
}
