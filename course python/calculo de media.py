n1 = float(input('primeira nota '))
n2 =float(input('segunda nota '))
minimo = (n1 + n2)/2
if minimo < 5:
    print('reprovado com {}'.format(minimo))

elif minimo >=7 :
    print('aprovado '.format(minimo))

else :
    print('reupercao {}'.format(minimo))