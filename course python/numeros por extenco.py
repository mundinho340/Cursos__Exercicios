estenso = 'zero', 'um', 'dois', 'tres', 'quatro', 'cinco', 'seis', 'sete', 'oito', 'nove', 'DEZ', 'ONZE', 'doze', 'treze', 'catorze ', 'quinze ', 'dezesseis', 'dezesete', 'dezesoito', 'dezssnove', 'vinte'
fail = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
num = int (input ('Digite um numero entre 0 e 20: '))
while num not in fail:
    if num in fail:
        break
    else:
        num = int (input ('Tente novamente.Digite um numero entre 0 e 20:  '))
print('voce digitou o numero  {}'.format(estenso[num]))