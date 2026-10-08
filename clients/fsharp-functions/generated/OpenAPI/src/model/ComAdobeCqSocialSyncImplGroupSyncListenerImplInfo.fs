namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties

module ComAdobeCqSocialSyncImplGroupSyncListenerImplInfo =

  //#region ComAdobeCqSocialSyncImplGroupSyncListenerImplInfo

  [<CLIMutable>]
  type ComAdobeCqSocialSyncImplGroupSyncListenerImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties;
  }

  //#endregion
