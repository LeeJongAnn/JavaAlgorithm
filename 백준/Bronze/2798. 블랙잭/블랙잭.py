from itertools import combinations

n,k = map(int,input().split())
num = list(map(int,input().split()))
biggest = 0

for x in combinations(num,3):
    temp = sum(x)
    if biggest<temp<=k:
        biggest = temp
print(biggest)
