# Decorator Pattern Scenario
An example scenario for the decorator pattern, using the example of cake with various toppings, with each topping acting as a wrapper (decorator).

## The Scenario
The decorator pattern can quickly become convoluted due to the large number of interconnected components. For this reason, the scenario presented here has been simplified to present the structure of the singleton pattern, while being relatively straight-forward to understand in the context.

In this scenario, there are 5 different classes of interest:
- [**Main**](https://github.com/RJHaytree/DecoratorPatternScenario/blob/master/src/com/haytree/cakedecoratorpattern/Main.java) - The Main class. Used to initialised the application, and instantiate the concrete components and decorators.
- [**Cake**](https://github.com/RJHaytree/DecoratorPatternScenario/blob/master/src/com/haytree/cakedecoratorpattern/Cake.java) - The Cake class is the **component** absract class, and must be inherited by all classes that which to take part in the decorator pattern.
- [**ChocolateCake**](https://github.com/RJHaytree/DecoratorPatternScenario/blob/master/src/com/haytree/cakedecoratorpattern/component/ChocolateCake.java) - The ChocolateCake pattern is an example implementation of the Cake class, and shows the component class being extended to form a **concrete component**.
- [**BaseTopping**](https://github.com/RJHaytree/DecoratorPatternScenario/blob/master/src/com/haytree/cakedecoratorpattern/decorator/BaseTopping.java) - The BaseTopping class is the *base decorator** abstract class, and extends the Cake class much like the concrete classes.
- [**FondantIcing**](https://github.com/RJHaytree/DecoratorPatternScenario/blob/master/src/com/haytree/cakedecoratorpattern/decorator/FondantIcing.java) - The FondantIcing class is an example implementation of a **concrete decorator**, and details the internal workings of the decorator pattern.
