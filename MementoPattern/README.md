# Memento Pattern
## 정의
인스턴스의 상태를 나타내는 역할을 도입해, 캡슐화의 파괴에 빠지지 않고 저장과 복원을 하는 것
- 캡슐화의 파괴: 클래스의 내부 구조에 의존하는 코드가 프로그램 곳곳에 흩어져 클래스를 수정하기 어려운 상태

## 구성요소
- Originator(작성자 역)<br>
    자신의 현재 상태를 저장하고 싶을 때 Memento를 만들고 이전 Memento를 넘겨박드면 그 Memento를 만든 시점의 상태로 되돌린다. (Gamer)
- Memento(기념품 역)<br>
  Originator의 내부 정보를 정리한다.
- Caretaker(관리인 역)<br>
  Originator의 상태를 저장하고 싶을 때 Originator에 요청한다. Originator 역은 요청을 받으면 Memento를 만들어 Caretaker에 넘겨주고, Caretaker는 미래에 대비하여 Memento를 저장한다. (Main)<br>
  하지만 Caretaker는 Memento가 가진 인터페이스 중 좁은 인터페이스만 사용해서 만들어진 Memento를 한 덩어리의 블랙 박스로 통째로 보관한다.

## 특징
- 두 개의 인터페이스와 액세스 제어<br>
Memento 클래스의 메소드나 필드에는 public이 붙어있는 것과 private이 붙어있는 것, 아무 것도 붙어있지 않은 것의 세 종류가 있다.
해당 메서드나 필드를 어느 클래스에 보여주고 어느 클래스에 보여주지 않을지를 프로그램상에서 표현한다.
- Main클래스가 여러 개의 Memento 인스턴스를 가지고 있다면 인스턴스의 다양한 시점을 저장할 수 있다.