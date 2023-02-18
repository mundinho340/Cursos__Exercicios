import random
print('de zero  a 5 qual e o numero sorteado? ')
numero =int(input('escolha um numero '))
lista = [0, 1, 2, 3, 4, 5]
escolha = random.choice(lista)
if numero == escolha:
    print('parabens venceste')
else:
    print('nao venceste fica para proxima')
print(escolha)
