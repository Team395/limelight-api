# limelight-api
Unofficial API for the Limelight.
## Building
Clone the repository and then run `./gradlew build`.
## Adding the Dependency
Copy the built jar into a directory and then add `compile files('relative/path/to/limelight-api-version.jar')` to your Gradle dependencies.
## Using the API
The `Limelight` class provides static methods to access all data posted to NetworkTables by Limelight.
### Examples
To access the target found with the current pipeline:
```java
if (Limelight.hasTarget()) {
    Target target = Limelight.getTarget();
    // Do stuff with the target
}
```
