n = str(raw_input('digite seu nome completo ')).strip()
nome = n.split()
print('seu primeiro nome e {} '.format(nome[0]))
print('seu ultimo nome e {} '.format(nome[len(nome)-1]))