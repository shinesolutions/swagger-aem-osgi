namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComAdobeGraniteContexthubImplContextHubImplProperties =

  //#region ComAdobeGraniteContexthubImplContextHubImplProperties

  [<CLIMutable>]
  type ComAdobeGraniteContexthubImplContextHubImplProperties = {
    [<JsonProperty(PropertyName = "com.adobe.granite.contexthub.silent_mode")>]
    ComAdobeGraniteContexthubSilentMode : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "com.adobe.granite.contexthub.show_ui")>]
    ComAdobeGraniteContexthubShowUi : ConfigNodePropertyBoolean;
  }

  //#endregion
