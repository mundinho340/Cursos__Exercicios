listagem= ('lapis', 1.75,
           'borracha', 2,
           'caderno', 15.90,
           'estojo', 25,
           'transferidor', 4.20,
           'compasso', 9.99,
           'moshila', 120.32,
           'caneta', 22.30,
           'livros', 34.90)
print('-' * 40)
print("listagem de preco"'^40')
print('-'*40)
for pos in range(0, len(listagem)):
    if pos % 2 ==0:
        print('{}'.format(listagem[pos]))
    else:
        print('{>7.2}')