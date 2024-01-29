# Design Principles

## 1 Seperate things that change

Identify the aspects of your application that vary and seperate them from
what stays the same.

Parts that change shouldn't require work in parts that stay the same.
Also means when a change is needed only a minimal part of the code should require
adjustments!

## 2 Program to an interface, not an implementation

Imagine building a machine. Instead of hard-coding specific actions, define general abilities like "operate" or "connect."
Create separate modules for different ways to perform those abilities, like "pumping" or "wireless linking."
Now, you can easily swap modules to change the machine's behavior without rewriting its core code.
This makes it flexible, adaptable, and easier to build new machines with similar abilities.

![Alt text](image.png)
