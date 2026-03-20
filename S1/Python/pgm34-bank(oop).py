class BankAccount:
    def __init__(self, accno, name, acctype, balance=0):
        self.accno = accno
        self.name = name
        self.acctype = acctype
        self.balance = balance
    def deposit(self, amount):
        self.balance += amount
        print("Deposited:", amount)
    def withdraw(self, amount):
        if amount > self.balance:
            print("Insufficient balance!")
        else:
            self.balance -= amount
            print("Withdrawn:", amount)
    def display(self):
        print("\n----- Account Details -----")
        print("Account No:", self.accno)
        print("Name:", self.name)
        print("Account Type:", self.acctype)
        print("Balance:", self.balance)
        print("----------------------------")
accno = int(input("Enter Account Number: "))
name = input("Enter Account Holder Name: ")
acctype = input("Enter Account Type (e.g., Savings/Current): ")
balance = float(input("Enter Initial Balance: "))
a1 = BankAccount(accno, name, acctype, balance)
dep = float(input("Enter amount to deposit: "))
a1.deposit(dep)
wd = float(input("Enter amount to withdraw: "))
a1.withdraw(wd)
a1.display()