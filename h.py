from typing import List

class Solution:
    def invalidTransactions(self, transactions: List[str]) -> List[str]:
        """Return a list of invalid transactions."""
        transaction_dicts = self.parse_transactions(transactions)
        invalid_transactions = self.check_invalid(transaction_dicts)
        return invalid_transactions

    def parse_transactions(self, transactions: List[str]) -> List[dict]:
        """Parse transactions into dictionaries."""
        transaction_dicts = []
        for transaction in transactions:
            name, time, amount, city = transaction.split(",")
            transaction_dicts.append({
                "name": name,
                "time": int(time),
                "amount": int(amount),
                "city": city
            })
        return transaction_dicts

    def check_invalid(self, transactions: List[dict]) -> List[str]:
        """Check for invalid transactions."""
        invalid_transactions = set()
        transaction_map = {}
        
        for transaction in transactions:
            if transaction["amount"] > 1000:
                invalid_transactions.add(self.format_transaction(transaction))
            
            key = (transaction["name"], transaction["time"])
            if key in transaction_map:
                if transaction["city"] != transaction_map[key]["city"]:
                    invalid_transactions.add(self.format_transaction(transaction))
                    invalid_transactions.add(self.format_transaction(transaction_map[key]))
            else:
                transaction_map[key] = transaction
        
        # Check for transactions within 60 minutes
        for i in range(len(transactions)):
            for j in range(i + 1, len(transactions)):
                if (transactions[i]["name"] == transactions[j]["name"] and
                    abs(transactions[i]["time"] - transactions[j]["time"]) <= 60 and
                    transactions[i]["city"] != transactions[j]["city"]):
                    invalid_transactions.add(self.format_transaction(transactions[i]))
                    invalid_transactions.add(self.format_transaction(transactions[j]))
        
        return list(invalid_transactions)

    def format_transaction(self, transaction: dict) -> str:
        """Format a transaction dictionary into a string."""
        return ",".join([transaction["name"], str(transaction["time"]), str(transaction["amount"]), transaction["city"]])

