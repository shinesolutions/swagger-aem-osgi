namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties

module ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo =

  //#region ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo

  [<CLIMutable>]
  type ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties;
  }

  //#endregion
