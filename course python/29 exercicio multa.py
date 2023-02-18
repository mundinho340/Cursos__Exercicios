
vel= float(input('qual e a velocidade do carro: '))
if vel>80:
    print('voce foi multado')
m = (vel - 80) * 7

print(' a multa e de {}mts'.format(m))