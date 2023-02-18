somaidade = 0
mediaidade = 0
maioridadehomem = 0
nomevelho = 0
totmulher20 = 0
for p in range(1, 5):
    print('---------{} PESSOA--------'.format(p))
    nome = str(raw_input('nome: ')).strip()
    idade = int(input('idade: '))
    sexo = str(raw_input('sex [M/F:')).strip()
    somaidade += idade
    if p == 1 and sexo in 'Mm':
        maioridadehomem = idade
        nomevelho = nome
    if sexo in 'Mm' and idade > maioridadehomem:
        maioridadehomem = idade
        nomevelho = nome
    if sexo in 'Ff' and idade < 20:
         totmulher20 += 1
mediaidade = somaidade/4
print('A MEDIA DA IDADE DO GRUPO E DE {} ANOS'.format(mediaidade))
print('O HOMEM MAIS VELHO TEM {} ANOS E SE CHAMA {}'.format(maioridadehomem, nomevelho))
print('AO TODO SAO {} MULHERES COM MENOS DE 20 ANOS'.format(totmulher20))
