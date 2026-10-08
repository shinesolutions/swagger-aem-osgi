namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqScreensDeviceImplDeviceServiceProperties =

  //#region ComAdobeCqScreensDeviceImplDeviceServiceProperties

  [<CLIMutable>]
  type ComAdobeCqScreensDeviceImplDeviceServiceProperties = {
    [<JsonProperty(PropertyName = "com.adobe.aem.screens.player.pingfrequency")>]
    ComAdobeAemScreensPlayerPingfrequency : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "com.adobe.aem.screens.device.pasword.specialchars")>]
    ComAdobeAemScreensDevicePaswordSpecialchars : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "com.adobe.aem.screens.device.pasword.minlowercasechars")>]
    ComAdobeAemScreensDevicePaswordMinlowercasechars : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "com.adobe.aem.screens.device.pasword.minuppercasechars")>]
    ComAdobeAemScreensDevicePaswordMinuppercasechars : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "com.adobe.aem.screens.device.pasword.minnumberchars")>]
    ComAdobeAemScreensDevicePaswordMinnumberchars : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "com.adobe.aem.screens.device.pasword.minspecialchars")>]
    ComAdobeAemScreensDevicePaswordMinspecialchars : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "com.adobe.aem.screens.device.pasword.minlength")>]
    ComAdobeAemScreensDevicePaswordMinlength : ConfigNodePropertyInteger;
  }

  //#endregion
