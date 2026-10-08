namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqSocialSyncImplDiffChangesObserverProperties =

  //#region ComAdobeCqSocialSyncImplDiffChangesObserverProperties

  [<CLIMutable>]
  type ComAdobeCqSocialSyncImplDiffChangesObserverProperties = {
    [<JsonProperty(PropertyName = "enabled")>]
    Enabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "agentName")>]
    AgentName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "diffPath")>]
    DiffPath : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "propertyNames")>]
    PropertyNames : ConfigNodePropertyString;
  }

  //#endregion
