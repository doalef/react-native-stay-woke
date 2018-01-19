
# react-native-react-native-stay-woke

## Getting started

`$ npm install react-native-stay-woke --save`

### Mostly automatic installation

`$ react-native link react-native-stay-woke`

### Manual installation


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNReactNativeStayWokePackage;` to the imports at the top of the file
  - Add `new RNReactNativeStayWokePackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-react-native-stay-woke'
  	project(':react-native-react-native-stay-woke').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-react-native-stay-woke/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-react-native-stay-woke')
  	```


## Usage
```javascript
import stayWoke from 'react-native-stay-woke';

// TODO: What to do with the module?
RNReactNativeStayWoke;
```
  