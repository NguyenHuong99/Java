package Java1_13;

class CodeLeanA {
    public void methodPublic(){
        methodPrivate();
    }
    protected void methodProtected(){
        methodPrivate();
    }
    void methodDefault(){
        methodPrivate();
    }
    private void methodPrivate(){}
}
