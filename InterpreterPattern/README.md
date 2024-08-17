# Interpreter 패턴
## 정의
프로그램이 해결하려는 문제를 기술한 미니 언어를 이해하고 해석하여 프로그램을 실행하는 통역 프로그램을 말한다.

## 구성요소
- AbstractExpression(추상 표현) 역<br>
구문 트리의 노드에 공통 인터페이스를 선언한다. (Node 클래스)
- TerminalExpression(종단 표현) 역
BNF의 터미널 익스프레션에 대응한다.
- NonterminalExpression(비종단 표현) 역
BNF의 논터미널 익스프레션에 대응한다.