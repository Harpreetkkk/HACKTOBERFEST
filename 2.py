class hello:
    def __init__(self,name):
        self.name=name
    def func(self):
        return (self.name)
    def greet (self):
        return 'hello '+self.name    
class child(hello):
    def __init__(self,name):
        self.name=name

ch=input()
a=child(ch)
print(a.func() , a.greet())