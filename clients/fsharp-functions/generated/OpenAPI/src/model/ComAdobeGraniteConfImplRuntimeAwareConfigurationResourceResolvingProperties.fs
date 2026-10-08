namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties =

  //#region ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties

  [<CLIMutable>]
  type ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties = {
    [<JsonProperty(PropertyName = "enabled")>]
    Enabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "fallbackPaths")>]
    FallbackPaths : ConfigNodePropertyArray;
  }

  //#endregion
