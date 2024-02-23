public class StringDisplay extends AbstractDisplay {
    private String string;
    private int width;

    // 생성자
    public StringDisplay(String string) {
        this.string = string;
        this.width = string.length();
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    // open과 close에서 호출되어 "+---+" 문자열을 표시하는 메소드
    private void printLine() {
        System.out.print("+");
        for(int i=0;i<width;i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
