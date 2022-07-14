public class LirioImpl implements Lirio {
    private String cor;
    private int num;

    @Override
    public String getCor() {
        return cor;
    }

    @Override
    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public int getNum() {
        return num;
    }

    @Override
    public void setNum(int num) {
        this.num = num;
    }

    public LirioImpl(String cor, int num){
        this.cor = cor;
        this.num = num;
    }
}
