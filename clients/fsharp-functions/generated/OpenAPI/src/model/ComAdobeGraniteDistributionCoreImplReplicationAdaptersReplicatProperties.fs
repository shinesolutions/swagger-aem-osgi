namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties =

  //#region ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties

  [<CLIMutable>]
  type ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties = {
    [<JsonProperty(PropertyName = "providerName")>]
    ProviderName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "forward.requests")>]
    ForwardRequests : ConfigNodePropertyBoolean;
  }

  //#endregion
