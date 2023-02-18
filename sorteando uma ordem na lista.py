import random
n1 = str(raw_input('primeiro aluno '))
n2 = str(raw_input('segundo aluno '))
n3 = str(raw_input('terceiro aluno '))
n4 = str(raw_input('quarto aluno '))
lista =[n1, n2, n3, n4]
random.shuffle(lista)
print('a ordem de apresentacao sera ')
print(lista)