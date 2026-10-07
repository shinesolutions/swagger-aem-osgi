namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties

module ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo =

  //#region ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo

  [<CLIMutable>]
  type ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties;
  }

  //#endregion
