lista = []
for  c in range(0, 5):
    n = int(input('Digita um numero '))
    if c == 0 or n > lista[-1]:
        lista.append(n)
    else:
        pos = 0
        while pos < len(lista):
            if n < lista[pos]:
                lista.insert(pos, n)
                break
            pos+=1
print '-='*30
print 'Foram digitados os valores {}'.format(lista)