namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties =

  //#region ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties

  [<CLIMutable>]
  type ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties = {
    [<JsonProperty(PropertyName = "flush.agents")>]
    FlushAgents : ConfigNodePropertyArray;
  }

  //#endregion
