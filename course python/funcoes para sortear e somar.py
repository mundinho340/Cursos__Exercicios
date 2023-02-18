from random import randint
from time import sleep
def sorteia(lista):
    for cont in range(0, 5):
        n =randint(1, 10)
        lista.append(n)
        print(n)
        sleep(0.2)
    print('pronto!!')

def somapar(lista):
    soma = 0

    for valor in lista:
        if  valor %2 ==0:
            soma+=valor

    print('somando os valores pares {} temos {}'.format (lista, soma))




numeros = list()
sorteia(numeros)
somapar(numeros)
print(numeros)

