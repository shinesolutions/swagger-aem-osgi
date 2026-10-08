namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties =

  //#region ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties

  [<CLIMutable>]
  type ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties = {
    [<JsonProperty(PropertyName = "com.adobe.cq.dam.mac.sync.damsyncservice.registered_paths")>]
    ComAdobeCqDamMacSyncDamsyncserviceRegisteredPaths : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "com.adobe.cq.dam.mac.sync.damsyncservice.sync.renditions")>]
    ComAdobeCqDamMacSyncDamsyncserviceSyncRenditions : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "com.adobe.cq.dam.mac.sync.damsyncservice.replicate.thread.wait.ms")>]
    ComAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "com.adobe.cq.dam.mac.sync.damsyncservice.platform")>]
    ComAdobeCqDamMacSyncDamsyncservicePlatform : ConfigNodePropertyDropDown;
  }

  //#endregion
