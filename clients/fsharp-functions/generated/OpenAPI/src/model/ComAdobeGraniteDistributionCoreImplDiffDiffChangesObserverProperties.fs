namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties =

  //#region ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties

  [<CLIMutable>]
  type ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties = {
    [<JsonProperty(PropertyName = "enabled")>]
    Enabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "agentName")>]
    AgentName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "diffPath")>]
    DiffPath : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "observedPath")>]
    ObservedPath : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "serviceName")>]
    ServiceName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "propertyNames")>]
    PropertyNames : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "distributionDelay")>]
    DistributionDelay : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "serviceUser.target")>]
    ServiceUserTarget : ConfigNodePropertyString;
  }

  //#endregion
