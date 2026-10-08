namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties

module ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo =

  //#region ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo

  [<CLIMutable>]
  type ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties;
  }

  //#endregion
