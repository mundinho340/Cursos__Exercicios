while True :
    n = int(input('digite um numero '))
    if n <0:
        break
    print('-=' * 12)
    for c in range(0, 13):
        print('{} x {} = {}'.format(n, c, n*c))
    print('-=' * 12)
print('programa tabuada encerrado ')