namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties

module ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo =

  //#region ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo

  [<CLIMutable>]
  type ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties;
  }

  //#endregion
