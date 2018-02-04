# leJOS example project

API docs at http://www.lejos.org/ev3/docs/

## Build
Uses the follwing artifact from Maven Central

group: 'com.github.bdeneuter', name: 'lejos-ev3-api', version: '0.9.1-beta'

gradlew build   Build project

Unfortunately that doesn't work for me, lejos-ev3-api is compiled
for Java language level 8, but my lejos installation is still running Java 7.
