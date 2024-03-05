# Builder Pattern
## 정의
구조를 가진 인스턴스를 만드는 패턴
## 구성요소
- Builder <br>인스턴스를 생성하기 위한 인터페이스를 결정한다. Builder는 인스턴스의 각 부분을 만드는 메소드를 가지고 있다.
- ConcreteBuilder<br>Builder의 인터페이스를 구현하는 클래스이다. ex) TextBuilder, HTMLBuilder
- Director<br>Builder의 메소드만을 사용하여 인스턴스를 생성한다. ex) Director
- Client<br>Builder패턴을 이용한다. ex) Main