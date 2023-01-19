# def get_account_name(account):
#     return account['holder_name']


class BankAccount:
    def __init__(self, input_holder_name, input_balance, input_type):
        self.holder_name = input_holder_name
        self.balance = input_balance
        self.type = input_type
        self._rates = {           #better way
            'personal' : 12,
            'business' : 60
        }

    def pay_in(self, amount):
        self.balance += amount

    def pay_monthly_fee(self): #with numbers, is less better way
        # if self.type == 'business':
        #     self.balance -= self.rates['business'] #so do this
        # elif self.type == 'personal':
        #     self.balance -= self.rates['personal']
        self.balance -= self._rates[self.type]