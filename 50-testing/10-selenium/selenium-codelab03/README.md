# Creating your first organized test

In this codelab you'll learn how a Selenium test is conventionally organized.

## Context
If there is one thing to avoid when writing code it is duplication. 
Famously called "the root of all evil" by Robert C. Martin.

Looking at the code that we've written in the previous test, we can identify some duplication.
1. We need to create a driver at the beginning of every test
2. We need to quit the driver at the end of every test
3. The url of the webpage is repeated for every test
4. If we want to select the same element twice, we'll write the code for that selection also twice.

Let's remove this duplication!

## Task list
### Creating a driver object for every test
A set-up method is a method that will be executed before every test.
Sounds like the perfect place to create our driver!

1. Create a SetUp method in your test
   1. ALT + INSERT and select SetUp Method
2. Make a field in the test class `ChromeDriver driver`
3. Initialize this field in the SetUp Method
   1. Don't forget that to create a driver the system property needs to be set as well
4. Now you no longer need to initialize the driver in the test, you can remove the 2 first lines of every test
5. As always run all the tests to make sure they still work

### Quiting the driver after every test
A tearDown method is a method that will be executed after every test.
Let's quit our driver automatically.

1. Create a TearDown method in your test
   1. ALT + INSERT and select TearDown Method
2. Add the code to quit the driver in the TearDown Method
3. Now we no longer need the last line of every test
4. As always run all the test to make sure they still work.

### Page Object Model
We've removed some duplication. Still there is one final thing that needs clean up.
We're still repeating everything that has to do with interacting with the page.
If we do not clean this up, we'll end repeating the same piece of code hundreds of times.

Think of a login. If we are writing hundreds of test for an application, then chances are we'll need to write the code for the login procedure for most of them.
What we can do is repeating the code for the login procedure for all these tests. 
If that happens we're in big trouble. Because if somebody changes the way the log in works, all our tests need to be rewritten.

Wouldn't it be nice that we can write `login("username","password")` from wherever we like and it just works? How do we organize such a thing?
The conventional way of doing this is with the [Page Object Model](https://www.selenium.dev/documentation/test_practices/encouraged/page_object_models/).

The Page Object Model is a design pattern where all the code that is needed to interact with a page is centralized in a java class.
What you're doing is essentially making a model of your webpage in a class.

### Creating a Page class
Let's make a page class together.

1. Start by making a class for our element-selection page. Typically, page classes have the Page suffix. So `ElementSelectionPage` would be a good name for our class.
2. A page will do a lot of interactions with a Selenium driver. So make a field and constructor for the ChromeDriver 


## Summary

In this codelab you've learned how to write tests using Selenium.

## What's next?

Since our code is a bit of a mess now, with a lot of duplication, we'll see how to simplify our code in the next codelab.
