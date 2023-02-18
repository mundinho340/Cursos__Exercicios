from random import randint
numero = (randint(1,10), randint(1,10), randint(1,10), randint(1,10), randint(1,10))
for n in numero :
    print('{}'.format(n))
print('O MAIOR NUMERO E {}'.format(max(numero)))
print('O MENOR NUMERO E {}'.format(min(numero)))