# 볼링 게임 점수판
## 진행 방법
* 볼링 게임 점수판 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 질문 삭제하기
### 요구사항
* 질문 데이터를 완전히 삭제하는 것이 아니라 데이터의 상태를 삭제 상태(deleted - boolean type)로 변경한다.
* 로그인 사용자와 질문한 사람이 같은 경우 삭제 가능하다.
* 답변이 없는 경우 삭제가 가능하다.
* 질문자와 답변글의 모든 답변자가 같은 경우 삭제가 가능하다.
* 질문을 삭제할 때 답변 또한 삭제해야하며, 답변의 삭제 또한 삭제 상태(deleted)를 변경한다.
* 질문자와 답변자가 다른 경우 답변을 삭제할 수 없다.
* 질문과 답변 삭제 이력에 대한 정보를 DeleteHistory를 활용해 남긴다.
---

## 볼링 점수판(그리기)
### 기능 요구사항
* 최종 목표는 볼링 점수를 계산하는 프로그램을 구현한다. 1단계 목표는 점수 계산을 제외한 볼링 게임 점수판을 구현하는 것이다.
* 각 프레임이 스트라이크이면 "X", 스페어이면 "9 | /", 미스이면 "8 | 1", 과 같이 출력하도록 구현한다.
    * 스트라이크(strike) : 프레임의 첫번째 투구에서 모든 핀(10개)을 쓰러트린 상태
    * 스페어(spare) : 프레임의 두번재 투구에서 모든 핀(10개)을 쓰러트린 상태
    * 미스(miss) : 프레임의 두번재 투구에서도 모든 핀이 쓰러지지 않은 상태
    * 거터(gutter) : 핀을 하나도 쓰러트리지 못한 상태. 거터는 "-"로 표시
* 10 프레임은 스트라이크이거나 스페어이면 한 번을 더 투구할 수 있다.
---

## 볼링 점수판(점수 계산)
### 기능 요구사항
* 사용자 1명의 볼링 게임 점수를 관리할 수 있는 프로그램을 구현한다.
* 각 프레임이 스트라이크이면 "X", 스페어이면 "9 | /", 미스이면 "8 | 1", 과 같이 출력하도록 구현한다.
  * 스트라이크(strike) : 프레임의 첫번째 투구에서 모든 핀(10개)을 쓰러트린 상태
  * 스페어(spare) : 프레임의 두번재 투구에서 모든 핀(10개)을 쓰러트린 상태
  * 미스(miss) : 프레임의 두번재 투구에서도 모든 핀이 쓰러지지 않은 상태
  * 거터(gutter) : 핀을 하나도 쓰러트리지 못한 상태. 거터는 "-"로 표시
* 스트라이크는 다음 2번의 투구까지 점수를 합산해야 한다. 스페어는 다음 1번의 투구까지 점수를 합산해야 한다.
* 10 프레임은 스트라이크이거나 스페어이면 한 번을 더 투구할 수 있다.

### 구현할 기능 목록
* 플레이어의 이름을 입력 받는 기능
* 각 프레임의 점수를 입력 받는 기능
* 입력 받은 점수를 출력하는 기능
  * 스트라이크 : X
  * 거터 : -
  * 스페어 : 점수 | /
  * 미스 : 점수 | 점수
* 스트라이크인 경우, 다음 프레임으로 바로 넘어감
* 스트라이크가 아닌 경우, 같은 프레임으로 한번 더 진행
* 마지막 프레임
  * 스트라이크 혹은 스페어 처리했을 때 보너스 투구 진행
* 점수를 계산하여 출력하는 기능
  * 스트라이크인 경우, 그다음 두번의 투구까지의 점수 합산
  * 스페어인 경우, 그다음 한번의 투구까지의 점수 합산
  * 그외의 경우, 현재 프레임의 점수만 합산
---
## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)
