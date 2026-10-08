namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties

module ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo =

  //#region ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo

  [<CLIMutable>]
  type ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties;
  }

  //#endregion
