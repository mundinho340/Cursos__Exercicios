n1 = int(input('digite o numero '))
n2 = int(input('digite o numero '))
n3 = int(input('digite o numero '))
menor = n2
if n1 <n2 and n1 < n3:
    menor = n1
maior = n1
if n3> n1 and n3>n2:
    menor = n3
if n3 <n1 and n3<n2:
    maior = n3
print('{} menor numero '.format(menor))
print('{} maior numero '.format(maior))