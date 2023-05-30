## Interfaces and Abstract Classes

### Travel App

You are working on a new application for a travel agency. The agency offers several ways of travel - by plane, train, and car, and they also arrange accommodation for travelers. The agency wants to ensure that each travel method provides certain facilities, and they want to be able to manage these methods in a unified way.

Your task is to create a basic structure for this application using interfaces and abstract classes in Java.

Requirements:

- Define the Travel Experience: Consider what all types of travel (air, rail, road) have in common. What actions do you take at the start and end of a journey? Define an interface to represent these shared actions.

- Consider Accommodations: Travel usually involves some form of accommodation. What actions are involved in this process? Define another interface to represent these.

- Abstract Travel Method: Now, think about what travel methods might have in common beyond the travel itself. This could involve preparation, certain shared attributes, or anything else you think is relevant. Represent these shared qualities in an abstract class that implements your travel and accommodation interfaces.

- Implementations for Travel Methods: With your structure in place, it's time to define specific methods of travel. These will be concrete classes extending your abstract travel class. Think about what makes each method unique, but remember, they should all still adhere to the contracts defined by your interfaces.

- Bring it All Together: Finally, create a small main program to demonstrate how these pieces fit together. Use this as an opportunity to test that your classes and interfaces interact as expected.