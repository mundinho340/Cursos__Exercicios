import math
c1 = float(input('cateto oposto '))
c2 = float(input('cateto adjacente '))
num = (c1 * c1) + (c2 * c2)
n = math.sqrt(num)
print('a hipotenusa de {} e de {} tem {:.2f} de comprimento'.format(c1, c2, n))