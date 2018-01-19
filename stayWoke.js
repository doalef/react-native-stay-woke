
import { NativeModules } from 'react-native';

const { RNReactNativeStayWoke } = NativeModules;

export default {
    keepAwake: RNReactNativeStayWoke.keepScreenAwake(),
    removeKeepAwake: RNReactNativeStayWoke.removeScreenAwake()
}
