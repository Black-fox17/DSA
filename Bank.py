from typing import List

test = """
["Bank","deposit","deposit","transfer","transfer","transfer","deposit","transfer","withdraw","deposit","withdraw","transfer","transfer"]
[[],[68,668],[25,978],[8,31,924],[2,6,857],[20,43,59],[71,307],[11,46,577],[37,377],[72,835],[82,574],[67,9,939],[24,49,251]]"""
class Bank:

    def __init__(self, balance: List[int]):
        self.balance = balance
        

    def transfer(self, account1: int, account2: int, money: int) -> bool:
        if (account1 > (len(self.balance))) or (account2 > (len(self.balance))):
            return False
        account1_balance = self.balance[account1 - 1]
        if account1_balance >= money:
            self.balance[account1 - 1] -= money
            self.balance[account2 - 1] += money
            return True
        else:
            return False
            
    def deposit(self, account: int, money: int) -> bool:
        if account > len(self.balance):
            return False
        self.balance[account - 1] += money
        return True

    def withdraw(self, account: int, money: int) -> bool:
        if account > len(self.balance) :
            return False
        if self.balance[account - 1] >= money:
            self.balance[account - 1] -= money
            return True
        else:
            False

balances = [767,653,252,849,480,187,761,243,408,385,334,732,289,886,149,320,827,111,315,155,695,110,473,585,83,936,188,818,33,984,66,549,954,761,662,212,208,215,251,792,956,261,863,374,411,639,599,418,909,208,984,602,741,302,911,616,537,422,61,746,206,396,446,661,48,156,725,662,422,624,704,143,94,702,126,76,539,83,270,717,736,393,607,895,661]
bank = Bank(balances)

print(balances[80])
print(bank.withdraw(82,574))