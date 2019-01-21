# limelight-api
Unofficial API for the Limelight.
## Adding the Dependency
Add `compile 'com.2train395.limelight.api:limelight-api:1.0.0'` to your Gradle dependencies.  
Make sure `mavenCentral()` is added as a repository.
## Building From Source
If you'd like to build the API yourself from the most recent commit (**not recommended**), then run:
```shell
git clone https://github.com/Team395/limelight-api.git
cd limelight-api
./gradlew build
```
The resulting jars can be found in `build/libs`. Assuming you have a Gradle project with the same parent directory as the cloned repository, add the following dependency:
```groovy
compile files('../limelight-api/build/libs/limelight-api-1.0.0.jar')
```
Adjust the path as necessary if your project is elsewhere.
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
