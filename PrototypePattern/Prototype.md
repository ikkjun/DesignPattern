# Prototype Pattern
## 정의
Prototype 패턴은 인스턴스로부터 다른 인스턴스를 생성한다. 
원형이 되는 인스턴스, 모범이 되는 인스턴스를 바탕으로 새로운 인스턴스를 만든다. 

## 구성요소
- Prototype(원형)<br>인스턴스를 복사하여 새로운 인스턴스를 만들기 위한 메소드를 결정한다.
- ConcretePrototype(구체적인 원형)<br>인스턴스를 복사하여 새로운 인스턴스를 만드는 메소드를 구현한다.
- Client<br>인스턴스를 복사하는 메소드를 이용해 새로운 인스턴스를 만든다. 