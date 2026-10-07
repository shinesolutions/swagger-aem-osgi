namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties

module ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo =

  //#region ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo

  [<CLIMutable>]
  type ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties;
  }

  //#endregion
