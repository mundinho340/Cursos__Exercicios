def contador(i, f, p):
    if p == 0:
        p =1
    if p < 0:
        p *= -1
    print('contage de {} ate {} de {} {}'.format(i, f, p, p))
    if i < f:
        cont=i
        while cont <= f:
            print'{}'.format(cont)
            cont+=p
        print'FIM!!!!'
    else:
        cont = i
        while cont >= f:
            print'{}'.format(cont)
            cont-=p
        print'FIM!!!'

#programa principal
contador(1, 10, 1)
contador(10, 1, 2)
ini = int(input('Inicio '))
fim = int(input('Fim '))
passo = int(input('Passo '))
contador(ini, fim, passo)