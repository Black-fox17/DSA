from typing import List
import ast 

class Solution:
    def invalidTransactions(self, transactions: List[str]) -> List[str]:
        result = self.check_invalid(transactions)
        return result
    
    def dict_all(self,transactions):
        trans_dic = []
        for trans in transactions:
            trans = trans.split(",")
            temp_dic = {
                "name":trans[0],
                "minute":int(trans[1]),
                'amount':int(trans[2]),
                "city":trans[3]
            }
            trans_dic.append(temp_dic)
        return trans_dic
    
    def check_invalid(self,transactions):
        dict_test = self.dict_all(transactions)
        invalid_list = []
        for i in range(len(dict_test) - 1):
            current_dic = dict_test[i]
            next_dic = dict_test[i + 1]
            curr_name = current_dic["name"]
            curr_min = current_dic["minute"]
            curr_amount = current_dic["amount"]
            curr_city = current_dic["city"]
            next_name = next_dic['name']
            next_min = next_dic["minute"]
            next_amount = next_dic['amount']
            next_city = next_dic["city"]
            if curr_amount > 1000:
                invalid_list.append(curr_name + "," + str(curr_min) + "," + str(curr_amount) + "," + curr_city)
                i += 1
                continue
            if next_amount > 1000:
                invalid_list.append(next_name + "," + str(next_min) + "," + str(next_amount) + "," + next_city)
                i += 2
                continue
            if curr_name == next_name and next_min < 60 and curr_city != next_city:
                invalid_list.append(curr_name + "," + str(curr_min) + "," + str(curr_amount) + "," + curr_city)
                invalid_list.append(next_name + "," + str(next_min) + "," + str(next_amount) + "," + next_city)
                if curr_amount > 1000:
                    i += 2
                else:
                    i += 1
                continue
        return invalid_list



sol = Solution()
test = Solution().invalidTransactions(["alice,20,800,mtv","alice,50,100,mtv","alice,51,100,frankfurt"])
print(test)