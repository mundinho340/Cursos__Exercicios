from pydoc import help
c = ('\033[m',          #0 - sem cores
     '\033[0;30;41m',   #1 - vermelho
     '\033[0;30;42m',   #2 - verde
     '\033[0;30;43m',   #3 - Amarelo
     '\033[0;30;44m',   #4 - Azul
     '\033[0;30;45m')   #5 - roxo

def ajuda(com):
    help(com)

def titulo(msg, cor = 0):
    tam = len(msg) + 4
    print(c[cor])
    print('~'*tam)
    print('  {}'.format(msg))
    print('~'*tam)
    print(c[0])


#programa principal
comando = ''
while True :
    titulo('SISTEMA DE AJUDA PYHELP', 1)
    comando = raw_input('Funcao ou Biblioteca> ')
    if comando.upper() == 'FIM':
        break
    else:
        ajuda(comando)
titulo('Ate logo')


