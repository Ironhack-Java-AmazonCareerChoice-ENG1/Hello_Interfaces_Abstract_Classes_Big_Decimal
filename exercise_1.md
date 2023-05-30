Exercise 1: Interface and Implementation

Problem: Define a Restoration interface with methods to capture common restaurant services such as ordering food, ordering drinks, and asking for the bill. Then, create a FastFood class that implements the Restoration interface.

Guidelines:

    Define an interface Restoration with the following methods: orderFood(), orderDrink(), and askForBill().
    Create a FastFood class that implements Restoration. This class should define the methods declared in the interface. Use print statements to simulate the actions (e.g., ordering food could print "Fast food order placed!").

Exercise 2: Abstract Classes and Extension

Problem: Create an abstract class Restaurant with an attribute name and a concrete method showMenu(). Then, create two different restaurant classes ItalianRestaurant and JapaneseRestaurant that extend Restaurant and implement Restoration.

Guidelines:

    Define an abstract class Restaurant with a protected field name and a constructor to initialize it. Include a concrete method showMenu() that prints a default message like "Menu is being prepared".
    Create ItalianRestaurant and JapaneseRestaurant classes extending Restaurant and implementing Restoration. The showMenu() method should be overridden in both classes to display a message appropriate for the type of restaurant (e.g., "Showing Italian menu..." for ItalianRestaurant).
    Implement the Restoration methods in each class. The implementation should reflect the type of restaurant (e.g., orderFood() in ItalianRestaurant could print "Pasta ordered").