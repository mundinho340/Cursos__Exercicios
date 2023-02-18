from pydoc import help


def contador(i, f, p):
    """

    :param i: inicio da contagem
    :param f: fim da contagem
    :param p: passo da contagem
    :return: sem retorno
    Nome do programador : Raimundo Chigarisso
    """

    cont = i
    while cont <= f:
        print(cont)
        cont+=p
    print('fim')


contador(1, 20, 2)
help(contador)