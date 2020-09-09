import math

value = 0.0
flag1 = flag2 = flag3 = flag4 = flag5 = True
i = 0
j = 1

while flag5:
    if i % 2 == 0:
        value += 4.0 / j
    else:
        value -= 4.0 / j

    #	print(" ", i,"\t", value, "\t", value-math.pi)
    i += 1
    j += 2

    if 3.1 <= value and value < 3.2 and flag1:  # 3.1
        print("First one fraction digit is the same in", i, "th term of series.\n\n")
        flag1 = False

    if 3.14 <= value and value < 3.15 and flag2:  # 3.14
        print("First two fraction digit is the same in", i, "th term of series.\n\n")
        flag2 = False

    if 3.141 <= value and value < 3.142 and flag3:  # 3.141
        print("First three fraction digit is the same in", i, "th term of series.\n\n")
        flag3 = False

    if 3.1415 <= value and value < 3.1416 and flag4:  # 3.1415
        print("First four fraction digit is the same in", i, "th term of series.\n\n")
        flag4 = False

    if 3.14159 <= value and value < 3.1416 and flag5:  # 3.14159
        print("First five fraction digit is the same in", i, "th term of series.\n\n")
        flag5 = False
