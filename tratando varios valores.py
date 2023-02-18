soma = num = cont =0
num = int(input('DIGITE [999] PARA PARAR'))
while num != 999:
    soma += num
    cont+=1
    num = int(input('DIGITE [999] PARA PARAR'))
print('voce digitou {} numeros que sera igual a {}'.format(cont , soma))

