package example.com.geoquiz;

class Question {
    private int mTextResId;
    private boolean mAnswerTrue;

    Question(int ResId, boolean istrue){
        mTextResId = ResId;
        mAnswerTrue = istrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setmTextResId(int mTextResId) {
        this.mTextResId = mTextResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setmAnswerTrue(boolean mAnswerTrue) {
        this.mAnswerTrue = mAnswerTrue;
    }
}
