# Visitor Pattern
## 정의
Visitor 패턴은 데이터 구조와 처리를 분리한다. 
데이터 구조 안을 돌아다니는 주체인 '방문자'를 나타내는 클래스를 준비하고 그 클래스에 처리를 맡긴다. 
새로운 처리를 추가하고 싶을 때는 새로운 '방문자'를 만들면 된다.

Use the Visitor Pattern when you want to add capabilities to a composite of objects and encapsulation is not important.
The Visitor must visit each element of the Composite; that functionality is in a Traverser object.

## 구성요소
- Visitor(방문자) 역<br>
데이터 구조의 구체적인 요소(ConcreteElement 역)마다 XXXX를 방문했다는 visit(XXXx) 메소드를 선언한다. (Visitor 클래스)

- Concretevisitor(구체적인 방문자) 역<br>
Visitor의 인터페이스(API)를 구현한다. (ListVisitor 클래스)

- Element(요소) 역<br>
Visitor가 방문할 곳을 나타내며, 방문자를 받아들이는 accept 메소드를 선언한다. 
accept 메소드의 인수로는 Visitor가 전달된다. 
(Element 인터페이스)

- ConcreteElement(구체적인 요소) 역<br>
Element의 인터페이스(API)를 구현한다. 
(File 클래스와 Directory 클래스)

- ObjectStructure(오브젝트 구조)역<br>
Element 집합을 다룬다. (Directory 클래스)<br>
ConcreteVisitor가 각각의 Element를 다룰 수 있도록 예제 프로그램의 Director 클래스에 iterator 메소드가 있다.

## 특징
1. 더블 디스패치
Visitor 패턴에서 더블 디스패치(double dispatch)란 ConcreteElement 역과 ConcreteVisitor 역의 조합으로 실제 처리를 결정하는 것을 말한다. 
element는 visitor를 accept하고 visitor는 element를 visit한다. 

2. 목적
Visitor 패턴의 목적은 처리를 데이터 구조와 분리하는 것이다.
Visitor 패턴은 File 클래스나 Directory 클래스의 부품으로서의 독립성을 높여 준다. 
만약, 처리 내용을 File 클래스나 Directory 클래스의 메소드로 프로그램을 작성하면 새로운 '처리'를 추가해서 기능을 확장하고 싶어질 때마다, File 클래스나 Directory 클래스를 수정해야 한다.

3. OCP
Visitor패턴을 사용하면 OCP(The Open-Closed Principle) 원칙에 따라 기존 클래스를 수정하지 않고 확장할 수 있다.