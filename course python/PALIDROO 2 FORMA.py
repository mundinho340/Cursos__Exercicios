frase = str(raw_input('DIGITA UMA FRASE : ')).strip().upper()
palavra = frase.split()
junto = ''.join(palavra)
inverso = ''
for letra in range(len(junto)-1, -1, -1):
    inverso += junto[letra]
print('O INVERSO DE {} E {}'.format(junto, inverso))
if inverso ==junto :
    print('TEMOS UM PALIDROMO')
else:
    print('A FRASE DIGITADA NAO E UM PALIDROMO')