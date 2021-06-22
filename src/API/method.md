# java.lang과 java.util 패키지
## java.lang 패키지
- 자바 프로그램의 기본적인 클래스를 담고 있는 패키지이다.
- import 없이 사용할 수 있다.
## java.util 패키지
- 자바 프로그램 개발에 조미료 같은 역할을 한다.
- 컬렉션 클래스들이 대부분을 차지하고 있다.
# Object 클래스
클래스를 선언할 때 extends 키워드로 다른 클래스를 상속하지 않으면 암시적으로 java.lang.Object 클래스를 상속하게 된다. 따라서 자바의 모든 클래스는 Object 클래스의 자식이거나 자손 클래스이다.
## Object 클래스의 메소드
### 객체 비교 (equals()) (deepEquals())
```public boolean equals(Object obj) { ... }```
비교 연산자인 == 과 동일한 결과를 리턴한다.
### 객체 해시코드 (hashCode())
객체의 메모리 번지를 이용해서 해시코드를 만들어 리턴한다.
### 객체 문자 정보 (toString())
객체를 문자열로 표현한 값을 리턴한다.
첫 번째 매개값이 not null이면 toString()으로 얻은 값을 리턴하고, null이면 "null" 또는
두 번째 매개값인 nullDefault(메시지)를 리턴한다.
### 객체 복제 (clone())
clone() 메소드를 호출할 때는 try-catch를 사용해서 CloneNotSupportedException 처리를 해줘야한다.
#### 얕은 복제 (thin clone)
단순히 필드값을 복사해서 객체를 복제하는 것을 말한다.
원본 객체와 같은 객체를 참조한다.
#### 깊은 복제(deep clone)
참조하고 있는 객체도 복제한다.
### 객체 소멸자 (finalize())
자바의 쓰레기 수집기가 객체를 소멸하기 직전에 마지막으로 객체의 소멸자(finalize())를 실행시킨다.
### 객체 비교 (compare(T a, T b, Comparator<T>c))
재네릭 인터페이스 타입으로 두 객체를 비교한다. a 가 b 보다 작으면 음수, 같으면 0, 크면 양수를 리턴하도록 구현 클래스를 만들어야한다.
### 널 여부 조사(isNull(), nonNull(), requireNonNull())
isNull()는 매개값이 null일 경우 true를 리턴한다. 
nonNull()는 매개값이 not null일 경우 true를 리턴한다.
requireNonNull()는 첫 번째 매개값이 not null이면 첫 번째 매개값을 리턴하고, null이면 모두
NullPointerException을 발생시킨다. 두 번째 매개값은 NullPointerException의 예외 메시지를 제공한다.
