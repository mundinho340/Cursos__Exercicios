primeiro = int(input('digite um valor: '))
raz = int(input('digite a razao: '))
decimo = primeiro + (10 - 1) * raz
for c in range(primeiro,decimo + raz,raz):
    print (c)

print('ACABOU!')



