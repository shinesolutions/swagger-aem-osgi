namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialSyncImplDiffChangesObserverProperties

module ComAdobeCqSocialSyncImplDiffChangesObserverInfo =

  //#region ComAdobeCqSocialSyncImplDiffChangesObserverInfo

  [<CLIMutable>]
  type ComAdobeCqSocialSyncImplDiffChangesObserverInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialSyncImplDiffChangesObserverProperties;
  }

  //#endregion
