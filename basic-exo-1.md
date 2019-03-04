# Basic exo 1

Let's keep going deeper into OOP!
You will today keep using all yesterday's concepts, and you will also discover a few new things:

- static keyword
- packages

> Unless otherwise specified, all messages must be followed by a newline.

## Exercise 01

**File to hand in**: `rendu/basic_exo_1/ex_01/Mars.java`

Create a new class, named "Mars", that has an 'id' attribute, a getter (**getId**), but no setter.
²
You must create your class so that the id of the first instance of "Mars"is 0, the id of the second instance is 1...

> static?!

```java
	public class Example {
		public static void main(String[] args) {
			Mars rocks = new Mars();
			Mars lite  = new Mars();
			Mars snack = new Mars();

			System.out.println(rocks.getId());
			System.out.println(lite.getId());
			System.out.println(snack.getId());
		}
	}
```

#### Result

```
# java Example
0
1
2
```

## Exercise 02

**File to hand in**: `rendu/basic_exo_1/ex_02/Astronaut.java`

Create a new "Astronaut" class, with the following attributes:

- **name**: a string describing the name of the Astronaut,
- **snacks**: an integer describing the number of snacks our Astronaut possess,
- **destination**: a string describing the destination of the Astronaut,
- **id**: an integer describing the id of the Astronaut.

The name must be passed during the creation of the Astronaut.

> It is mandatory.

His snack will be initialized to 0 and his destination to null.

The id must be unique and be incremented for each new Astronaut being created (i.e the first Astronaut's id must be 0, then the second one's 1,...).
Also, every Astronaut being created must display:

    [Name]: ready for launch!

where [name] is the name of the Astronaut.

You must also add a getter for id (**getId**) but no setter, and a getter for destination (**getDestination**) without setter.

```java
	public class Example {
		public static void main(String[] args) {
			Astronaut mutta = new Astronaut("Mutta");
			Astronaut hibito = new Astronaut("Hibito");

			System.out.println(mutta.getId());
			System.out.println(hibito.getId());
		}
	}
```

#### Result

```
# java Example
Mutta ready for lunch!
Hibito ready for lunch!
0
1
```

## Exercise 03

**Files to hand in**:
1. `rendu/basic_exo_1/ex_03/chocolate/Mars.java`
2. `rendu/basic_exo_1/ex_03/planet/Mars.java`

Copy your "Mars" class from the first exercise, without changing it.
Create another "Mars" class representing the planet.
In order to differentiate between the two Mars, put the first one (the one from exercise 1) in a package called "chocolate" and the second one in a package called "planet".

> You should only turn in two Mars.java file.
One in the "chocolate" repository and one in the "planet" repository.

Also add a private "size" attribute to this new "Mars" class, with a getter and a setter (**getSize** and **setSize**).

> It must be possible to specify the size of the planet when creating one thanks to its constructor, but it shouldn't be mandatory.

## Exercise 04

**File to hand in**: `rendu/basic_exo_1/ex_04/Astronaut.java`

> In ths exercise, every time we ask for **[Name]** to be displayed, it should be replaced by the name of the Astronaut.
For example **[Name]: Nothing to do.**
becomes (for an Astronaut named "Mutta") **Mutta: Nothing to do.**

It is time for our Astronaut to start working!
If you haven't already done it, add a getter for his snacks (**getSnacks**).
No setter should be created.

Create a new method **doActions** taking an optional parameter.
If no parameter is given the method simply displays:

	[Name]: Nothing to do.

If the parameter is a "planet.Mars", display:

	[Name]: Started a mission!

Because some people can't guess obvious things (obviously I won't say who...), you will also need to store our Astronaut's new destination to his attribute destination (see Exercise 02).
If no destination was given, display:

	[Name]: I may have done nothing, but I have [x] Mars to eat at least !

where [x] is the number of snacks possessed by our Astronaut.

If a "chocolate.Mars" is given, display:

	[Name] is eating mars number [Mars id]

where [Mars id] should obviously be replaced by the Mars id...

Also, if our Astronaut received a snack, you will also need to increment his "snacks" attribute by one.

## Exercise 05

**Files to hand in**:
1. `rendu/basic_exo_1/ex_05/planet/moon/Phobos.java`
2. `rendu/basic_exo_1/ex_05/chocolate/Mars.java`
3. `rendu/basic_exo_1/ex_05/planet/Mars.java`

Use your "Mars" classes from the previous exercises without changing it.
Create a "Phobos" class in the "Phobos.java" file. This class must be in a "moon" namespace, which is, itself, defined in the "planet" namespace.

Your "Phobos" class must have a private attribute named "mars" with a getter (**getMars**), but no setter.
This attribute must be specified upon creation; it is a representation of a "planet.Mars".

During its creation, if it correctly received a "planet.Mars", it must display:

	Phobos placed in orbit.

Otherwise, it must display:

	No planet given.

```java
	public class Example {
		public static void main(String[] args) {
			Mars titi = new planet.Mars();
			Mars toto = new planet.Mars();

			new planet.moon.Phobos(titi);
			new planet.moon.Phobos(toto);
		}
	}
```

#### Result

```
# java Example
Phobos placed in orbit.
Phobos placed in orbit.)
```

## Exercise 06

**File to hand in**:
1. `rendu/basic_exo_1/ex_06/planet/moon/Phobos.java`
2. `rendu/basic_exo_1/ex_06/chocolate/Mars.java`
3. `rendu/basic_exo_1/ex_06/planet/Mars.java`
4. `rendu/basic_exo_1/ex_06/Astronaut.java`
5. `rendu/basic_exo_1/ex_06/Team.java`

Create a new "Team" class that represents a team of astronaut.
Its constructor must take the team name as parameter.

Create a getter (**getName**), but no setter for this attribute.
Create a few methods to manipulate our team:

- **add**: It takes an Astronaut as parameter. This Astronaut should be added to the team.
- **remove**: It takes an astronaut as parameter and removes him from the team. This function never displays anything.
- **countMembers**: It returns the number of Astronaut currently on our team.
- **showMembers**: It displays the members that are on the team, the following way:

```
[Team name]: [Astronaut 1] on mission, [Astronaut 2] on stanby.
```

Obviously, "on mission" is displayed if the Astronaut is currently on a mission.
Otherwise "on standby" is displayed.
If no member is in the team, don't display anything.

```java
	public class Example {
		public static void main(String[] args) {
			Astronaut mutta = new Astronaut("Mutta");
			Astronaut hibito = new Astronaut("Hibito");
			Astronaut serika = new Astronaut("Serika");

			Team spaceBro = new Team("SpaceBrothers");

			spaceBro.add(mutta);
			spaceBro.add(hibito);
			spaceBro.add(serika);
			spaceBro.add(3);

			System.out.println(spaceBro.countMembers());

			Mars titi = new planet.Mars();
			mutta.doActions(titi);

			spaceBro.showMembers();
			spaceBro.remove(hibito);
			System.out.println(spaceBro.countMembers());
     }
}
```

#### Result

```
# java Example
Mutta ready for launch!
Hibito ready for launch!
Serika ready for launch!
SpaceBrothers: Sorry, you are not part of the team.
3
Mutta: started a mission!
SpaceBrothers: Mutta on mission, Hibito on standby, Serika on standby.
2
```

## Exercise 07

**Files to hand in**:
1. `rendu/basic_exo_1/ex_07/planet.moon/Phobos.java`
2. `rendu/basic_exo_1/ex_07/chocolate/Mars.java`
3. `rendu/basic_exo_1/ex_07/planet/Mars.java`
4. `rendu/basic_exo_1/ex_07/Astronaut.java`
5. `rendu/basic_exo_1/ex_07/Team.java`

Copy your previous exercise files.
Add a new method to your Team, **doActions**.
The goal of this method is to call all of the Team’s Astronaut's **doActions** with the received parameter.
If no parameter is received, display:

	[Team name]: Nothing to do.

> Display it only once.

> If chocolate is received, we will admit that they share the chocolate but still count it as a full chocolate.

You will need to modify your Astronaut class.
Now that our Astronauts have more experience, they can also go on a mission to Phobos.
