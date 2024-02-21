public class Plaza {
    private int num;
    private Tama tama;

    public Plaza(int num, Tama tama) {
        this.num = num;
        this.tama = tama;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Tama getTama() {
        return tama;
    }

    public void setTama(Tama tama) {
        this.tama = tama;
    }

    @Override
    public String toString() {
        return "Plaza{" +
                "num=" + num +
                ", tama=" + tama +
                '}';
    }
}
