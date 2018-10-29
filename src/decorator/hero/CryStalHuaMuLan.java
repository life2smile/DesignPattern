package decorator.hero;

import decorator.skin.CryStalSkin;

/**
 * Created by wenzhi on 2018/10/29.
 */
public class CryStalHuaMuLan implements IHero {
    private IHero mDefSkinHero;

    public CryStalHuaMuLan(IHero hero) {
        this.mDefSkinHero = hero;
    }

    @Override
    public void create() {
        this.mDefSkinHero.create();
        CryStalSkin cryStalSkin = new CryStalSkin();
        cryStalSkin.skin();
    }
}
