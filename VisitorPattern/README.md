# Visitor Pattern
## 정의
Visitor 패턴은 데이터 구조와 처리를 분리한다. 
데이터 구조 안을 돌아다니는 주체인 '방문자'를 나타내는 클래스를 준비하고 그 클래스에 처리를 맡긴다. 
새로운 처리를 추가하고 싶을 때는 새로운 '방문자'를 만들면 된다.

Use the Visitor Pattern when you want to add capabilities to a composite of objects and encapsulation is not important.
The Visitor must visit each element of the Composite; that functionality is in a Traverser object.

