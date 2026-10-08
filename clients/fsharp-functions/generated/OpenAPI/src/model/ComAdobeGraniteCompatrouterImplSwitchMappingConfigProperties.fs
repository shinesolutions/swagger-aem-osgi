namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties =

  //#region ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties

  [<CLIMutable>]
  type ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties = {
    [<JsonProperty(PropertyName = "group")>]
    Group : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "ids")>]
    Ids : ConfigNodePropertyArray;
  }

  //#endregion
