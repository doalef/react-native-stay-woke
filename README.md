
# react-native-react-native-stay-woke

## Getting started

`$ npm install react-native-stay-woke --save`

### Mostly automatic installation

`$ react-native link react-native-stay-woke`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-stay-woke` and add `RNReactNativeStayWoke.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNReactNativeStayWoke.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

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

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNReactNativeStayWoke.sln` in `node_modules/react-native-stay-woke/windows/RNReactNativeStayWoke.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using React.Native.Stay.Woke.RNReactNativeStayWoke;` to the usings at the top of the file
  - Add `new RNReactNativeStayWokePackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import stayWoke from 'react-native-stay-woke';

// TODO: What to do with the module?
RNReactNativeStayWoke;
```
  