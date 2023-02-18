n = 1
par = impar = 0
while n !=0:
    n = int(input('DIGITE UM VALOR : '))
    if n!=0:
        if n%2 ==0:
            par +=1
        else:
            impar+=1
print('VOCE DIGITOU {} NUMEROS PARES E {} NUMEROS IMPARES!  '.format(par, impar))
