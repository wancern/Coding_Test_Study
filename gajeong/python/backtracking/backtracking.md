## <h1>백트래킹(Backtracking)

## 백트래킹이란? <br>

해를 찾는 도중 더이상 해가 될 수 없는 상태가 되면, 해가 가능한 지점으로 돌아가서 다른 해를 찾아가는 기법.

### 백트래킹의 대부분 구조

```python
def 재귀함수(x):
  if 정답이라면? :
    정답 출력 도는 저장 등
  else 정답이 아니라면?
    for 뻗을 수 있는 모든 자식 노드에 대해서:
    if 정답에 유망하다면:
      자식노드로 이동
      재귀함수(x+1)
      부모노드로 이동
```