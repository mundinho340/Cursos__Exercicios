from datetime import date
idade = int(input('QUAL E O ANO DE NASCIMENTO: '))
actl = date.today().year  - idade
print('VOCE TEM {} ANOS '.format(actl))
if actl <  18:
    falt = 18 -actl
    print('VOCE AINDA NAO PODE SERVIR O EXERCITO FALTAM {} ANOS PARA O ALISTAMENTO'.format(falt))
elif actl == 18:
    print('VOCE DEVE SE ALISTAR EMEDIATAMENTE ')
elif actl> 18:
    falt = actl - 18
    print('VOCE DEVIA SE ALISTAR A {} anos atras'.format(falt))
