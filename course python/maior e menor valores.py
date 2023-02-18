a = int(input('o primeiro valor '))
b = int(input('o segundo valor '))
c = int(input('o terceiro valor '))
#o  valor
menor = a
if b < a and b < c:
    menor = b
if c < a and c < b:


 maior = a
if b > a and b > c:
    maior = b
if c > a and c > b:
    maior = c

print('o maior valor digitado foi {}'.format(maior))
print('o menor valor digitado foi {}'.format(menor))