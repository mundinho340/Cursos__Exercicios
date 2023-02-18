m =0
cout = 0
for c in range(6):
    num = int(input('DIGITE UM NUMERO'))
    if num %2 ==0:
        m += num
        cout += 1
print(' voce informou {} soma entre foi  {}'.format(cout, m))


