# Codelab04

## Task
This application for tending to a fancy villa is a mess.
All classes are in a big pile.
Encapsulation is non-existent.

Let's clean it up:
1. Separate the classes into different packages
2. Encapsulate as much as possible (private if possible, then package private, then protected, if nothing else goes finally public)

## Bonus (advanced) exercise:
The gardener became sick suddenly, but the garden needs urgent tending.
Luckily the butler has some gardening skills.
How hard would it be to let the butler tend to the gardens?

Try to refactor the code in such a way that you don't have any getters or setters.
Using too many getters or setters is a sign of feature envy/message chain (code smells).
See: https://refactoring.guru/refactoring/smells/couplers for more information.

What would be the benefit in writing your codebase without any getters or setters?

After this change how hard is it make the gardener once again responsible for the garden?
