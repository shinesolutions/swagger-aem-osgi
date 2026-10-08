namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties =

  //#region ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties

  [<CLIMutable>]
  type ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties = {
    [<JsonProperty(PropertyName = "forward.requests")>]
    ForwardRequests : ConfigNodePropertyBoolean;
  }

  //#endregion
