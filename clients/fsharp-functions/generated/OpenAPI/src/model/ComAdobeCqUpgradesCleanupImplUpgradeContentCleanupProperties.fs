namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties =

  //#region ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties

  [<CLIMutable>]
  type ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties = {
    [<JsonProperty(PropertyName = "delete.path.regexps")>]
    DeletePathRegexps : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "delete.sql2.query")>]
    DeleteSql2Query : ConfigNodePropertyString;
  }

  //#endregion
