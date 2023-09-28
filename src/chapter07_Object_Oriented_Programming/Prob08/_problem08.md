
# 오셀로
오셀로 게임 규칙은 이러하다.
오셀로 말의 한쪽 면은 흰색, 반대면은 검은색이다.
상대편 말에게 왼쪽과 오른쪽, 또는 위와 아래가 포위된 말은 색상을 뒤집어 상대편 말이 된 것으로 표시한다.
여러분은 여러분 차례에 적어도 상대편 말 한개를 획들해야 한다. 더 이상 진행이 불가능해지면, 게임은 종료된다.
가장 많은 말을 획득한 사람이 승자가 된다. 이 게임을 객체 지향적으로 설계하라.

# 가정
- 오프라인 게임이라 가정한다.
	- GameManager를 싱글톤으로 처리

# 구현 체크리스트
- [x] GameManager
	- [x] placePiece()
	- [x] isGameOver()
	- [x] getScore()
- [x] Board
	- [x] board -> Piece\[row]\[col]
	- [x] placePiece()
	- [x] getScore()
- [x] Piece
	- [x] Color -> enum
- [x] Player
	- [x] placePiece()
	- [x] getScore()
- [x] Color
	- [x] getOppositeColor()