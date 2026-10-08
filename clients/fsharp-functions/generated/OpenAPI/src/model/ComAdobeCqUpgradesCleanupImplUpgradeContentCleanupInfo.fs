namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties

module ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo =

  //#region ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo

  [<CLIMutable>]
  type ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties;
  }

  //#endregion
