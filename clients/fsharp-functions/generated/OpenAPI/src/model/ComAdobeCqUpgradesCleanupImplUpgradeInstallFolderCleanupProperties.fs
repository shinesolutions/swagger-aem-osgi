namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties =

  //#region ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties

  [<CLIMutable>]
  type ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties = {
    [<JsonProperty(PropertyName = "delete.name.regexps")>]
    DeleteNameRegexps : ConfigNodePropertyArray;
  }

  //#endregion
