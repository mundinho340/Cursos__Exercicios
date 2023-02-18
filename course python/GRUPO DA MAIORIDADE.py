from datetime import date
atua = date.today().year
totmaior = 0
totmenor = 0
for pess in range(1, 8):
    nasc = int(input('EM QUE ANO A {} PESSOA NASCEU '.format(pess)))
    idade = atua - nasc
    if idade>21:
        totmaior+=1
    else:
        totmenor+=1
print('AO TODO TIVEMOS {} PESSOAS MAIORES DE IDADE'.format(totmaior))
print('E TAMBEM TIVEMOS {} PESSOAS MENORES DE IDADE'.format(totmenor))






