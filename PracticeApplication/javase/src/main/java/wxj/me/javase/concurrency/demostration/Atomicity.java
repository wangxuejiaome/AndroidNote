package wxj.me.javase.concurrency.demostration;

public class Atomicity {
    int i;
    void f1(){
        i++;
    }
    void f2(){
        i += 3;
    }
}
