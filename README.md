# limelight-api
Unofficial API for the Limelight.
## Building
Clone the repository and then run `./gradlew build`.
## Adding the Dependency
Add `compile 'com.2train395.limelight.api:limelight-api:1.0.0'` to your Gradle dependencies. Make sure `mavenCentral()` is added as a repository.
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
