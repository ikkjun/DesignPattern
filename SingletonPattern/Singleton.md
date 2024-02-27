# Singleton Pattern
## 정의
Singleton Pattern은 인스턴스가 하나만 존재하는 것을 보증하는 패턴이다.

## 특징
Singleton은 static필드(클래스 변수)로 정의되고 Singleton 클래스의 인스턴스에서 초기화한다. 

Singleton 클래스의 생성자는 private으로 되어 있다. 
이는 Singleton 클래스 외부에서 생성자 호출을 금지하기 위해서이다.

Singleton 클래스의 유일한 인스턴스를 얻는 메소드로 getInstance가 제공된다. 이 getInstance는 static Factory Method의 일종이다.

## 구성요소
- Singleton역<br>
