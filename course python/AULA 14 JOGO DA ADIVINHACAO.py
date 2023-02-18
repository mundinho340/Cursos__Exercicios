from random import randint
computador = randint(0, 10)
print('SOU SEU COMPUTADOR.... ACABEI DE PENSAR EM UM NUMERO ENTRE 0 E 10')
print('SERA QUE VOCE CONSEGUE ADIVINHAR QUAL FOI?')
acertou = False
palpites = 0
while not acertou:
    jogador = int(input('QUAL E O SEU PALPITE ?'))
    palpites+=1
    if jogador == computador :
        acertou = True
    else:
        if jogador < computador:
            print('MAIS....TENTE MAIS UMA VEZ ')
        elif jogador < computador:
            print ('MENOS .... TENTE MAIS UMA VEZ')
print('ACERTOU COM {} TENTATIVAS. PARABENS'.format(palpites))

