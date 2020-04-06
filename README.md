# DesignerToast 🤩❤️🔥 
[![Android Arsenal]( https://img.shields.io/badge/Android%20Arsenal-DesignerToast-green.svg?style=flat )]( https://android-arsenal.com/details/1/8090 )
[![platform](https://img.shields.io/badge/platform-Android-green.svg)](https://www.android.com)
[![API](https://img.shields.io/badge/API-17%2B-brightgreen.svg?style=plastic)](https://android-arsenal.com/api?level=17)
[![](https://jitpack.io/v/vedraj360/DesignerToast.svg)](https://jitpack.io/#vedraj360/DesignerToast)

## Prerequisites

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
	repositories {
		maven { url "https://jitpack.io" }
	}
}
```

## Dependency

Add this to your module's `build.gradle` file (make sure the version matches the JitPack badge above):

```gradle
dependencies {
	        implementation 'com.github.vedraj360:DesignerToast:0.1.2'
}
```

## Usage
To display an default Toast:

``` java
DesignerToast.defaultToast("yourContext","Default Toast",Gravity.CENTER,Toast.LENGTH_SHORT);

```
To display a success Toast:

``` java
DesignerToast.Success("yourContext", "Success Toast", Gravity.CENTER, Toast.LENGTH_SHORT);
```
To display the error Toast:

``` java
DesignerToast.Error("yourContext", "Error Toast", Gravity.CENTER, Toast.LENGTH_SHORT);

```

To display a warning Toast:

``` java
DesignerToast.Warning("yourContext","Warning Toast",Gravity.CENTER,Toast.LENGTH_SHORT);

```

To display an info Toast:

``` java
DesignerToast.Info("yourContext", "Info Toast", Gravity.CENTER, Toast.LENGTH_SHORT);
```

## Custom Toast 🔥❤️🔥 
To display the custom Toast:

Prameters Required -> Context, Message, Gravity, Toast Length, Custom Background, Text Size, Text Color,
Toast Image,Layout Width, Layout Height.

``` java
DesignerToast.Custom(this,"Custom Toast",Gravity.CENTER,Toast.LENGTH_SHORT,
R.drawable.my_custom_shape,20,"#FFFFFF",R.drawable.ic_person, 200, 200);

```


## Screenshots 🔥❤️🔥 

**Please click the image below to enlarge.**

<p float="left">
  <img src="https://github.com/vedraj360/DesignerToast/blob/master/Screenshots/default_toast.png" width="200" hspace="40"/>
  <img src="https://github.com/vedraj360/DesignerToast/blob/master/Screenshots/success.png" width="200" hspace="40"/> 
 <img src="https://github.com/vedraj360/DesignerToast/blob/master/Screenshots/error.png" width="200" hspace="40"/> 
</p>

<p float="left">
  <img src="https://github.com/vedraj360/DesignerToast/blob/master/Screenshots/info.png" width="200" hspace="40" />
  <img src="https://github.com/vedraj360/DesignerToast/blob/master/Screenshots/warning.png" width="200" hspace="40" />
 <img src="https://github.com/vedraj360/DesignerToast/blob/master/Screenshots/custom.png" width="200" hspace="40" />  
</p>


## Dark Theme Toast

Just write DesignerToast.STYLE_DARK in parameter


## Usage

To display a success Toast:

``` java
DesignerToast.Success("yourContext", "Success",, "Hello this is demo success!",Gravity.CENTER, Toast.LENGTH_SHORT,DesignerToast.STYLE_DARK);
```
To display the error Toast:

``` java
DesignerToast.Error("yourContext", "Error",, "Hello this is demo error!",Gravity.CENTER, Toast.LENGTH_SHORT,DesignerToast.STYLE_DARK);
```

To display a warning Toast:

``` java
DesignerToast.Warning("yourContext", "Warning",, "Hello this is demo warning!",Gravity.CENTER, Toast.LENGTH_SHORT,DesignerToast.STYLE_DARK);
```

To display an info Toast:

``` java
DesignerToast.Info("yourContext", "Info",, "Hello this is demo info!",Gravity.CENTER, Toast.LENGTH_SHORT,DesignerToast.STYLE_DARK);
```




## Dark Theme Screenshots

<p float="center"> <img src="https://github.com/vedraj360/DesignerToast/blob/master/Screenshots/sample_dark_toast.png" width="500" hspace="40"/>

## Contributing

Please fork this repository and contribute back.
Any contributions, large or small, major features, bug fixes, are welcomed and appreciated
but will be thoroughly reviewed .

## License

* [Apache Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

```
Copyright 2020 Vedraj360

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
