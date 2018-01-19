
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import android.widget.Toast;

public class RNReactNativeStayWokeModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNReactNativeStayWokeModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNReactNativeStayWoke";
  }

  @ReactMethod
  public void keepScreenAwake() {
      Toast.makeText(getCurrentActivity().getApplicationContext(),"text",Toast.LENGTH_LONG).show();
      getCurrentActivity().runOnUiThread(new Runnable() {
          @Override
          public void run() {
              getCurrentActivity().getWindow().addFlags(android.view.WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
          }
      });
  }

  @ReactMethod
  public void removeScreenAwake() {
      getCurrentActivity().runOnUiThread(new Runnable() {
          @Override
          public void run() {
              getCurrentActivity().getWindow().clearFlags(android.view.WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
          }
      });
  }
}