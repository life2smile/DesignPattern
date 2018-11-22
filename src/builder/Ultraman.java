package builder;

/**
 * Created by wenzhi on 2018/11/22.
 */
public class Ultraman {
    private String mHat;//帽子
    private String mTrousers;//裤子
    private String mCloak;//披风
    private String mShoes;//鞋子

    public void displayUltramanDress() {
        if(mHat != null){
            System.out.println("ultraman hat: " + mHat);
        }
        if(mTrousers != null){
            System.out.println("ultraman trousers: " + mTrousers);
        }
        if(mCloak != null){
            System.out.println("ultraman cloak: " + mCloak);
        }
        if(mShoes != null){
            System.out.println("ultraman shoes: " + mShoes);
        }
    }


    static class Builder {
        private Ultraman mUltraman;

        public Builder() {
            mUltraman = new Ultraman();
        }

        public Builder setHat(String mHat) {
            mUltraman.mHat = mHat;
            return this;
        }

        public Builder setTrousers(String mTrousers) {
            mUltraman.mTrousers = mTrousers;
            return this;
        }

        public Builder setCloak(String mCloak) {
            mUltraman.mCloak = mCloak;
            return this;
        }

        public Builder setShoes(String mShoes) {
            mUltraman.mShoes = mShoes;
            return this;
        }

        public Ultraman build() {
            return mUltraman;
        }

    }
}
