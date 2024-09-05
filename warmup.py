def sleepIn(weekend,vacation):
    return not weekend or vacation

r= sleepIn(True,True)

print(r)


def monkeyTrouble(aSmile,bSmile):
    return (aSmile and bSmile) or (not aSmile and not bSmile)

print(monkeyTrouble(True,False))

