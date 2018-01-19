using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace React.Native.Stay.Woke.RNReactNativeStayWoke
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNReactNativeStayWokeModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNReactNativeStayWokeModule"/>.
        /// </summary>
        internal RNReactNativeStayWokeModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNReactNativeStayWoke";
            }
        }
    }
}
