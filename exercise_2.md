## Virtual Wallet for Micro-Transactions in a Video Game

Imagine you're building a feature for a popular video game that allows players to purchase virtual items using real money. Players can add funds to their virtual wallet and use this balance to buy in-game items. These transactions often involve small amounts of money, so precision is important.

- Virtual Wallet: Consider how you would represent a player's virtual wallet. The wallet should keep track of the player's balance and allow operations like adding funds and making purchases. Remember, all monetary amounts should be represented using BigDecimal for precise calculations.

- Item Catalog: Think about how you'd represent the in-game items that players can purchase. Each item would have a cost associated with it. How would you represent this catalog of items and their costs?

- Game Store: Finally, consider how you'd implement the game store where players can make purchases. How does a player use their virtual wallet to buy an item? What happens if a player tries to buy an item but doesn't have enough funds in their wallet?

BONUS EXTRA SUPER CHALLENGE: Can you create a program that simulates the shop adding a command line interface: when using it, given a starting balance of 100.00 euro, will permit the user to buy in game items of different prices if you have money( you should be able to see the catalog). You can add money to balance by entering a specific code coupon in a specific prompt.