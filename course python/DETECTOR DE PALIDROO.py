frase = str(raw_input('digite um nome ')).strip().upper()
palavra = frase.split()
junto =''.join(palavra)
inverso = junto[::-1]
print('O INERSO DE {} E {} '.format(junto, inverso))
if inverso == junto:
    print('TEMOS UM PALIDROMO')
else:
    print('NAO E UM PALIDROMO')
