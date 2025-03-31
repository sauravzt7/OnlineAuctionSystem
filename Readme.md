```markdown
# Auction System

This project is an implementation of an auction system using the mediator design pattern. It allows sellers to create auctions and buyers to place bids on those auctions. The system determines the winner based on a specified winning strategy.

## Features

- Create auctions with specified bid limits and participation costs.
- Add buyers and sellers to the system.
- Place and withdraw bids.
- Close auctions and determine the winner based on the highest unique bid strategy.

## Project Structure

- `src/main/java/com/machinecoding/` - Contains the main application code.
  - `mediator/` - Contains the mediator classes for managing auctions.
  - `models/` - Contains the models for buyers and sellers.
  - `strategy/` - Contains the strategy interface and implementations for determining the auction winner.

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven

### Building the Project

To build the project, navigate to the project directory and run:

```sh
mvn clean install
```

### Running the Application

To run the application, use the following command:

```sh
mvn exec:java -Dexec.mainClass="com.machinecoding.Main"
```

## Usage

The main class `Main` demonstrates the usage of the auction system. It creates auctions, adds buyers and sellers, places bids, and closes auctions to determine the winners.

## Contributing

Contributions are welcome! Please open an issue or submit a pull request for any improvements or bug fixes.

## License

This project is licensed under the MIT License. See the `LICENSE` file for details.
```
