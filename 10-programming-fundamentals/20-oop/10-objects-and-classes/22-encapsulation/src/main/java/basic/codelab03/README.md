# Codelab03
This is an exercise on encapsulation. You'll need to refactor the code while not changing the behaviour.
Run the test to see if you haven't broken anything.

## Making everything private
Take a look at the BankAccount and Money class.
They both have horrible encapsulation. This will make these classes very hard to maintain in the long run.

### Tasks
1. Make the field money private in BankAccount
   1. The code will no longer compile. How can you make it work again while keeping the field private?
2. Make the fields value and currency private in Money
   1. Make your code compile again just like in the first task

## Having rules on your fields
Currently, it is possible to create money with any kind of currency. So a currency of 'Bananas' is possible.
We don't want this, because the addBalance can't handle 'Bananas'.

### Tasks
1. Change the money class so that currency can either be 'Euro' or 'Dollar' and nothing else.
   1. You can use `throw new RuntimeException();` in case of a faulty currency.

## Not using setters and getters
The BankAccount class is relying on Money class a lot. Which code can you move to the money class?

### Tasks
1. Try to move the addBalance method to Money instead of BankAccount
2. Which other methods do you need to move as well?
3. Which setters and getters do you still need? Remove the unnecessary ones

## (advanced) value objects
Value objects are objects where the fields can not change value. A value object comes from a class where all fields are `final`.
Final fields usually lead to better designed code.

### Tasks
1. Make money a value object (make both fields private)
   1. What do you need to change in your code to make it work again?
    
