
lista = 'corinthians', 'palmeiras ', 'santos', 'Gremio', 'Cruzeiro', 'Flamengo', 'Vasco', 'chapecoense', 'Atletico', 'Botafogo', 'Baiha', 'Atletico - PR','Sao paulo', 'Fluminense', 'Sport recife ', 'Ec vitoria', 'Coritiba', 'Avai', 'ponte preta', 'Atletico - GO'
print('-='*50)
print('OS 20 PRIMEIROS CLASSIFICADO SAO {}'.format(lista))
print('-='*50)
print('OS 5 PRIMEIROS COLOADOS SAO {}'.format(lista[5]))
print'-='*50
print('OS ULTIMOS 4 COLOCADOS NA TABELA SAO {} '.format(lista[-4:]))
print('-='*50)
print('OS TIMES EM ORDEM ALFABETICA: {}'.format(sorted(lista)))
print'-='*50
print('O CHAPECOENSE ESTA NA POSICAO {}'.format(lista.index('chapecoense')+1))
print '-='*50