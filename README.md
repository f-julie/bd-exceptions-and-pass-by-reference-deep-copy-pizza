# Intro

Your team is working on a pizza orders app, where users can build
pizza and place an order.

Your co-worker has designed an elaborate Pizza Class hierarchy,
but has come to you with a problem. There is a feature to
duplicate a Pizza which *seems* to be working, but when users
modify the second pizza, the first pizza also changes.

**Your challenge is to change only the Pizza class to fix this
issue.**

# Instructions

Familiarize yourself with the Pizza class hierarchy:

A `Pizza` has:

- `Cheese`
- `Sauce`
- `Crust`
    - Which has its own `Cheese` type.
- An array of `Topping`s

Each of these classes are using public enums. For example
there are three types of Cheese which you can access from any
class with `Cheese.Type.REGULAR` for example.

Look over the main method and see how the variable `yourPizza`
is being initialized, and how it's being changed.
**Do not change the Main class at all!** You must only change
the Pizza class.

## A Completed Project Will

Show two different pizzas outputted to the console.

You can also run the `tst.com.processing.MainTest` test and make
sure it passes. 

Alternatively type `./gradlew -q clean :test` to
run the tests in your command terminal.