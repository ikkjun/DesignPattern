# Visitor Pattern
## 정의
Visitor 패턴은 데이터 구조와 처리를 분리한다. 
데이터 구조 안을 돌아다니는 주체인 '방문자'를 나타내는 클래스를 준비하고 그 클래스에 처리를 맡긴다. 
새로운 처리를 추가하고 싶을 때는 새로운 '방문자'를 만들면 된다.

Use the Visitor Pattern when you want to add capabilities to a composite of objects and encapsulation is not important.
The Visitor must visit each element of the Composite; that functionality is in a Traverser object.

## 구성요소
- Visitor(방문자) 역
데이터 구조의 구체적인 요소(ConcreteElement 역)마다 XXXX를 방문했다는 visit(XXXx) 메소드를 선언합 니다. visit(xxxx)는 XXxX를 처리하기 위한 메소드로 실제 코드는 ConcreteVisitor 쪽에 기술됩니다. 예제 프로그램에서는 Visitor 클래스가 이 역할을 맡았습니다.
w Concretevisitor(구체적인 방문자) 역
Visitor의 인터페이스(API)를 구현합니다. visit(xxxx) 형태의 메소드를 구현하고, 각 ConcreteElement마 다 처리를 기술합니다. 예제 프로그램에서는 ListVisitor 클래스가 이 역할을 맡았습니다. Listvisitor에서 currentdir 필드 값이 변화한 것처럼 visit(XXXx)를 처리하는 중에 ConcreteVisitor 역의 내부 상태가 변화 하기도 합니다.
~ Element(요소) 역
Visitor가 방문할 곳을 나타내며, 방문자를 받아들이는 accept 메소드를 선언합니다. accept 메소드의 인수 로는 Visitor 역이 전달됩니다. 예제 프로그램에서는 Element 인터페이스가 이 역할을 맡았습니다.
" ConcreteElement(구체적인 요소) 역
Element의 인터페이스(API)를 구현합니다. 예제 프로그램에서는 File 클래스와 Directory 클래스가 이 역 할을 맡았습니다.
w objectStructure(오브젝트 구조)역
Element 집합을 다릅니다. ConcreteVisitor가 각각의 Element를 취급할 수 있는 메소드를 갖추고 있습니 다. 예제 프로그램에서는 Directory 클래스가 이 역할을 맡았습니다(1인 2역). ConcreteVisitor가 각각의 Blement를 다룰 수 있도록 예제 프로그램의 Director 클래스에 iterator 메소드가 준비되어 있습니다.

## 특징
1. 더블 디스패치
element는 visitor를 accept하고 visitor는 element를 visit합니다. Visitor 패턴에서는 ConcreteElement 역과 ConcreteVisitor 역의 조합으로 실제 처리를 결정 합니다. 이것을 일반적으로 더블 디스패치(double dispatch)라고 부릅니다.

2. 목적
Visitor 패턴의 목적은 처리를 데이터 구조와 분리하는 것입니다.
Visitor 패턴은 File 클래스 나 Directory 클래스의 부품으로서의 독립성을 높여 줍니다. 만약, 처리 내용을 File 클래스나 Directory 클 래스의 메소드로 프로그램을 작성해 버리면. 새로운 '처리'를 추가해서 기능을 확장하고 싶어질 때마다, File 클래스(리스트 13-4)나 Directory 클래스(리스트 13-5)를 수정해야 합니다.

3. OCP
The Open-Closed Principle- 확장에 대해서는 열고, 수정에 대해서는 닫는다
기존 클래스를 수정하지 않고 확장할 수 있게 하는 것이 The Open-Closed Principle입니다