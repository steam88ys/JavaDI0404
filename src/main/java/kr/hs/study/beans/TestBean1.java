package kr.hs.study.beans;

public class TestBean1 {

    private int n;
    private int m;
    private char c;

    public TestBean1() {
    }

    public TestBean1(int n, int m, char c) {
        this.n = n;
        this.m = m;
        this.c = c;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }
}
