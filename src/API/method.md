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
## System 클래스
- System클래스를 이용하면 운영체제의 일부 기능을 이용할 수 있다.
- System 클래스의 모든 필드와 메소드는 정적(static)으로 구성되어있다.
### 프로그램 종료 (exit())
- 현재 실행하고 있는 플로세스를 강제 종료시키는 역할.
- 정상 종료일 경우 0, 비정상 종료일 경유 0 이외의 다른 값
```System.exit(0);```
### 쓰레기 수집기 실행 (gc())
- JVM은 메모리가 부족할 때와 CPU가 한가할 때에 쓰레기 수집기를 실행시켜 사용하지 않는 객체를 자동 제거한다.
### 현재 시각 읽기 (currentTimeMillis(), nanoTime())
- 컴퓨터의 시계로부터 현재 시간을 읽어서 밀리세컨드 단위와 나노세컨드 단위의 long 값을 리턴한다.
### 시스템 프로퍼티 읽기 (getProperty())
- 시스템 프로퍼티: JVM이 시작할 때 자동 설정되는 시스템의 속성값
- key와 value로 구성되어있음.
- 운영체제 종류, JVM버전 등이 속함.
```String value = System.getProperty(String key);```
### 환경 변수 읽기 (getenv())
- 운영체제에서 이름과 값으로 관리되는 문자열 정보
```String value = System.getenv(String name);```
## Class 클래스
- 자바는 클래스와 인터페이스의 메타 데이터를 java.lang 패키지에 소속된 Class 클래스로 관리한다.
여기서 메타 데이터란 클래스의 이름, 생성자 정보, 필드 정보, 메소드 정보를 말한다.
### Class 객체 얻기 (getClass(), forName())
- Class 객체를 반환한다.
### 리플렉션 (getDeclaredConstructors(), getDeclaredFields(), getDeclaredMethods())
- 리플렉션: Class 객체를 이용해 클래스의 생성자, 필드, 메소드 정보를 알아내는 것
- 세 메소드는 각각 Constructor 배열, Field 배열, Method 배열을 리턴한다.
### 동적 객체 생성 (newInstance())
- new 연산자를 사용하지 않고 동적으로 객체를 생성한다.
- 런타임 시에 클래스 이름이 결정되는 경우에 매우 유용하다.
## String 클래스
### 바이트 배열로 변환 (getBytes())
- 네트워크로 문자열을 전송하거나 문자열을 암호화할 때 문자열을 바이트 배열로 변환한다.
```String str = new String(byte[] bytes, String charsetName);```
### 문자열 찾기 (indexOf())
- 매개값으로 주어진 문자열이 시작되는 인덱스를 리턴한다.
### 문자열 길이 (length())
- 문자열의 길이를 리턴한다.
### 문자열 대치 (replace())
- 첫 번째 매개값인 문자열을 찾아 두 번째 매개값인 문자열로 대치한 새로운 문자열을 생성하고 리턴한다.
### 문자열 잘라내기 (substring())
- 주어진 인덱스에서 문자열을 추출한다.
### 대,소문자 변경 (toLowerCase(), toUpperCase())
- 문자열을 모두 소문자 또는 대문자로 바꾼 새로운 문자열을 생성한 후 리턴한다.
### 문자열 앞뒤 공백 잘라내기 (trim())
- 문자열의 앞뒤 공백을 제거한 새로운 문자열을 생성하고 리턴한다.
### 문자열 변환 (valueOf())
- 기본 타입의 값을 문자열로 변환한다.
## StringTokenizer 클래스
- 문자열이 특정 구분자로 연결되어있을 경우, 구분자를 기준으로 부분 문자열을 분리하기 위해서는
String의 split() 메소드를 이용하거나, java.util 패키지의 StringTokenizer 클래스를 이용할 수 있다.
split()은 정규 표현식으로 구분하고, StringTokenizer는 문자로 구분한다.
### split() 메소드
- 정규 표현식을 구분자로 해서 문자열을 분리한 후, 배열에 저장하고 리턴한다.
### StringTokenizer 클래스
```StringTokenizer st = new StringTokenizer("문자열", "구분자");```
- 첫 번째 매개값으로 전체 문자열을 주고, 두 번째 매개값으로 구분자를 준다.
- 구분자를 생략하면 공백이 기본 구분자가 된다.
## StringBuffer, StringBuilder 클래스
- String 클래스는 내부의 문자열을 수정할 수 없다.
- 문자열 수정이 많은 작업에서는 StringBuffer, StringBuilder 클래스를 사용하는 것이 프로그램 성능에 좋다.
  