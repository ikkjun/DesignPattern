public abstract interface AbstractDisplay {
    // open, print, close는 하위 클래스에 구현을 맡기는 추상 메소드
    abstract void open();    // 메소드를 호출한다.
    abstract void print();   // print 메소드를 5회 호출한다.
    abstract void close();   // 메소드를 호출한다.

    // display는 AbstractDisplay에서 구현하는 메소드
    public default void display() {
        open();
        for (int i=0;i<5;i++) {
            print();
        }
        close();
    }
}
