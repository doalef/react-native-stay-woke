
import { NativeModules } from 'react-native';

export default {
    keepAwake: NativeModules.RNReactNativeStayWoke.keepScreenAwake(),
    removeKeepAwake: NativeModules.RNReactNativeStayWoke.removeScreenAwake()
}
