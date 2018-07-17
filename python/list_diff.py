with open('/s.txt') as f:
    lf = f.read().splitlines()
    lf = [x.strip(' ') for x in lf]
#print (lf)

with open('/g.txt') as g:
    lg = g.read().splitlines()
    lg = [x.strip(' ') for x in lg]
#print (lg)

a = [x for x in lg if x not in lf]

b = set(lg) - set(lf)

print (a)
print (b)
