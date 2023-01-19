from modules.bank_account import *

# account = {
#        'holder_name' : 'John',
#        'balance' : '500',
#        'type' : 'business' 
# }

# print(get_account_name(account))

bank_account = BankAccount('John',500,'business')
bank_account_randolph = BankAccount('Randolph',1,'personal')

bank_account_randolph.balance = 100

print(bank_account.holder_name)
print(bank_account.balance)
print(bank_account_randolph.balance)

bank_account.pay_in(50)
print(bank_account.balance)

bank_account.pay_monthly_fee()
print(bank_account.balance)
bank_account_randolph.pay_monthly_fee()
print(bank_account_randolph.balance)