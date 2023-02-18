palavra = ('aprender', 'programar', 'linguagem', 'python', 'curso', 'gratis', 'estudar', 'praticar', 'trabalhar', 'mercado', 'programador', 'futuro')
for p in palavra:
    print('\n na palavra {} temos'.format(p.upper()))
    for letra in p:
        if letra in 'aeiou':
            print(letra.lower())