namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties

module ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo =

  //#region ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo

  [<CLIMutable>]
  type ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties;
  }

  //#endregion
