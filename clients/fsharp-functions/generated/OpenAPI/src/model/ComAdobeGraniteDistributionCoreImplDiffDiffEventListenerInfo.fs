namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties

module ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo =

  //#region ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo

  [<CLIMutable>]
  type ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties;
  }

  //#endregion
