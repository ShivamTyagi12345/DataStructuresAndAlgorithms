# # make a class to print hello world
# one = 1
# two = 2
# three = one + two
# print(three)

# hello = "hello"
# world = "world"
# helloworld = hello + " " + world
# print(helloworld)

# # change this code
# mystring = "hello"
# myfloat = None
# myint = None

# # testing code
# if mystring == "hello":
#     print("String: %s" % mystring)
# if isinstance(myfloat, float) and myfloat == 10.0:
#     print("Float: %f" % myfloat)
# if isinstance(myint, int) and myint == 20:
#     print("Integer: %d" % myint)


# make a class that HAS A function that greets "Hello john
class Greeting:
    def __init__(self, name):

        self.name = name

    def greet(self):
        return f"Hello {self.name}"
        e = Greeting("John")
        print(e.greet())
