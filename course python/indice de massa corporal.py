
peso = float(input('qual e seu peso (KG)'))
altura = float(input('qual e a sua altura (M)'))
IMC = peso/(altura*altura)
print('O IMC DESSA PESSOA E DE {:.1f} '.format(IMC))
if IMC < 18.5:
    print('voce esta ABAIXO DO PESO NORMAL ')
elif 18.5 <= IMC < 25:
    print('parabens o teu peso e ideal ')
elif 25<= IMC < 30:
    print('voce esta com sobrepeso ')
elif IMC <=40:
    print('VOCE ESTA COM OBESIDADE  ')
else:
    print('VOCE ESTA COM OBESIDADE MORBIDA, CUIDADO!')