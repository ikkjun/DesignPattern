# Factory Method Pattern
## 정의
인스턴스 생성 방법을 상위 클래스에서 결정하고, 구체적인 부분은 하위 클래스에서 구현한다.

## Factory Method 패턴의 구성요소
1. Product(제품)<br>
프레임워크 쪽에 해당하며, 이 패턴으로 생성되는 인스턴스가 가져야 할 인터페이스(API)를 결정하는 추상 클래스이다. Product 클래스
2. Creator(작성자)<br>
new를 사용해 실제 인스턴스를 생성하는 대신에, 인스턴스를 생성하는 메소드를 호출함으로써 구체적인 클래스 이름에 의한 속박에서 상위클래스를 자유롭게 한다. Factory클래스의 createProduct
3. ConcreteProduct<br> IDCard 클래스
4. ConcreteCreator<br> IDCardFactory 클래스