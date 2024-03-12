# Desing Patterns
In this repo tab we will cover design patterns

## Facade
 The Facade class provides a simple interface to the complex logic of one or several subsystems. The Facade delegates the client requests to the appropriate objects within the subsystem. The Facade is also responsible for managing their lifecycle. All of this shields the client from the undesired complexity of the subsystem.

<p align="center">
  <img src="https://refactoring.guru/images/patterns/diagrams/facade/structure.png?id=258401362234ac77a2aaf1cde62339e7">
</p>

* Code example

```c
    class Subsystem1 {
 public:
  std::string Operation1() const {
    return "Subsystem1: Ready!\n";
  }
  // ...
  std::string OperationN() const {
    return "Subsystem1: Go!\n";
  }
};
/**
 * Some facades can work with multiple subsystems at the same time.
 */
class Subsystem2 {
 public:
  std::string Operation1() const {
    return "Subsystem2: Get ready!\n";
  }
  // ...
  std::string OperationZ() const {
    return "Subsystem2: Fire!\n";
  }
};

class Facade {
 protected:
  Subsystem1 *subsystem1_;
  Subsystem2 *subsystem2_;

 public:

  Facade(
      Subsystem1 *subsystem1 = nullptr,
      Subsystem2 *subsystem2 = nullptr) {
    this->subsystem1_ = subsystem1 ?: new Subsystem1;
    this->subsystem2_ = subsystem2 ?: new Subsystem2;
  }
  ~Facade() {
    delete subsystem1_;
    delete subsystem2_;
  }
} 
```
