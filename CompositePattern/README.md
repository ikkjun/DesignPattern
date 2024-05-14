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

## 복수와 단수 동일시하기
Composite 패턴은 그릇과 내용물을 동일시하는 패턴인데, 이를 복수와 단수의 동일시로 부를 수도 있다. 
즉, 여러 개를 모아서 마치 하나의 것처럼 취급하는 것이다.
### 예시
프로그램 동작 테스트를 모아서 할 때 Composite 패턴을 사용할 수 있다. 
KeyboardTest에서는 키보드 입력 테스트를 하고, FileTest에서는 파일 입력 테스트를 하고, NetworkTest에서는 네트워크 입력 테스트를 한다고 가정하자. 
KeyboardTest, FileTest, NetworkTest 셋을 한꺼번에 다루고 싶을 때, Composite 패턴을 사용해 여러 테스트를 모아 InputTest라는 '입력 테스트'로 만들 수 있다. 

## 재귀적 구조 사용 예시
- 윈도 시스템에서는 윈도 안에 자식 윈도를 갖는 것
- 문장의 글머리 기호 항목 안에 다시 항목이 포함되는 것
- 컴퓨터에 대한 명령을 모아 매크로 명령을 만들 때. 그 매크로 명령을 재귀적인 구조로 구현하면 매크로 명령의 매크로 명령을 만들 수도 있다. 
- 트리 구조로 된 데이터 구조