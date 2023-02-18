num = soma = cont =0
while True:
    num = int(input('DIGITE UM NUMERO '))
    if num == 999:
        break
    soma+=num
    cont+=1
print('foram somados {} numeros e a soma entre eles deu {}'.format(cont, soma))
