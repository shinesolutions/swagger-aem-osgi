namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties =

  //#region ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties

  [<CLIMutable>]
  type ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties = {
    [<JsonProperty(PropertyName = "compatgroups")>]
    Compatgroups : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "enabled")>]
    Enabled : ConfigNodePropertyBoolean;
  }

  //#endregion
