# java-racingcar-precourse

## 초간단 자동차 경주 게임

## 구현할 기능 목록

- [x] 테스트 및 기능 작성
    - [x] 자동차 이름 구분
    - [x] 랜덤 값에 따른 전진 여부 확인
    - [x] 승자 판정
    - [x] 잘못된 값 입력 시 예외 처리

## 처리할 예외 상황 목록

- 자동차 이름으로 "" 혹은 " "가 입력된 경우 `IllegalArgumentException`을 반환한다.
- 자동차 이름이 5글자를 초과한 경우 `IllegalArgumentException`을 반환한다.
- 시도 횟수가 숫자가 아닌 경우 `IllegalArgumentException`을 반환한다.
- 시도 횟수가 음수인 경우 `IllegalArgumentException`을 반환한다.