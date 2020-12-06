# ZOOWORLDTD

[Git Repo Link](https://github.com/Okharev/ZOOWORLDTD)

ZOOWORLDTD is an application which aims to simulate the interaction and management of a zoo with enclosures, and a wide variety of animals

## Wants
make a flexible and modular application for the management adhering to the MVC Design pattern which can be easily expandable to any animal we can encounter.


## Problems

- Short margin due to the time constraint with the hard work on the side and confinement
- no time to develop a GUI due to the verbosity of the SWING library so resorted to CLI
- MVC Pattern seems to not be to compliant with CLI interface and rather hard to implement
- Further abstraction needed in the relations of models, with implementation of interfaces for different actions and behaviours

## Amelorations
- Implementation of a GUI
- Implementation of a proper MVC Pattern
- Refactoring some classes or methods to Interfaces (Offspring, Vagabonding, Flying, swimming etc ... )
- Doing the second half of the TD
- Make the application evolution time based rather than action based
- Make it so Healing is not a 100% Effective

## Usage
The application comes in a CLI Interface and has few menus

### Dashboard

```bash
Welcome To your Zoo Zooland
==========================================
1 - Zoo Enclosures 
2 - Zoo status 

Taking care of : 27 Animals 

0 - Quit 
```

This is the main menu in which you can see the general status of the zoo (enclosures status / animals health)

### Enclosures


```bash
Examine which enclosure
==========================================
1 - Enclos 1
2 - Enclos 2
3 - Enclos 3 
...

0 - Return 
```

This is the enclosures menu in which you can see all your enclosures and select them


### Enclosure


```bash
==============CHARACTERISTICS=============
Enclosure name : Enclos 1
 Enclosure Enclosure Status GOOD
Enclosure area : 150
Enclosure max capacity of animals : 20
Enclosure number of animals : 3

Choose from these options
==========================================
1 - check enclosure animals
2 - clean enclosure animals
3 - feed enclosure animals
4 - move to new enclosure
5 - remove animal from enclosure
==========================================

0 - Return 
```

Here you can choose what to do with the specified enclosure.

### Animals 

```bash
Choose from these options
==========================================
1 - heal specified animals
==========================================
==========================================
Animal name : Nelledu
Animal specie : Tiger
Animal name : 15
Animal height : 18
Animal hunger : Not Hungry
is the animal sleeping : Not Sleeping
Animal gender : MALE
Animal health : HEALTHY
Animal offspring : Can not give birth
Animal sound : Rawr
Animal vagabond : Not Vagabonding
==========================================
...
```
Here you have a summary of the animals within the given enclosure and you can choose to heal them.


## Summary
The conditions of work were rather intense for the situation confinement and work on the side it is hard to provide code of quality with those conditions however we learned a lot about java, and still bettered our OOP skills with this humbling project
