galera = list()
pessoa = dict ()
soma = media = 0
while True:
    pessoa.clear()
    pessoa['nome'] =str(raw_input('Nome: '))
    while True:
        pessoa['sexo']= str(raw_input('SEXO: [M/F] ')).upper()[0]
        if pessoa['sexo'] in 'MF':
            break
        print('ERRO! Porfavor digite apenas M  ou F')
    pessoa['idade']= int(input('idade: '))
    soma += pessoa['idade']
    galera.append(pessoa.copy())
    while True:
        resp = str(raw_input('Quer continuar ? [S/N] ')).upper()[0]
        if resp in 'SN':
            break
        print('ERRADO! Responda apenas S ou N ')
    if resp in 'N':
        break
print'-=' *30
print('Ao todo temos {} pessoas foram cadastradas '.format(len(galera)))
media = soma/ len(galera)
print('A media de idade {:5.2f} '.format(media))
print('As mulheres cadastradas foram')
for p in galera:
    if p['sexo'] == 'F':
        print('{}'.format(p['nome']))
print('lista das pessoas que estao acima da media')
for p in galera:
    if p['idade']> media :
        for k, i in p.items():
            print('{} tem  {}'.format(k, i))
print('<<ENCERRADO>>')

