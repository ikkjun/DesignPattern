# Composite Pattern
## 정의
그릇과 내용물을 동일시하여 재귀적인 구조를 만드는 디자인 패턴

File의 인스턴스와 Directory의 인스턴스 모두 동일한 메소드 getsize로 크기를 얻을 수 있다.
Composite 패턴의 재귀적 구조가 getSize 메소드의 재귀적 호출에 대응한다.

## Composite 패턴의 등장인물
- Leaf(잎) 역<br>
'내용물'을 의미한다. 이 안에는 다른 것을 넣을 수 없다. (File 클래스)
- Composite(복합체) 역<br>
'그릇'을 의미한다. Leaf 역이나 Composite 역을 넣을 수 있다. (Directory 클래스)
- Component 역<br>
Leaf 역과 Composite 역을 동일시한다. 
Component는 Leaf 역과 Composite 역에 공통되는 상위 클래스로 구현된다. (Entry 클래스)
- Client(의뢰자) 역<br>
Composite 패턴의 사용자이다. (Main 클래스)

