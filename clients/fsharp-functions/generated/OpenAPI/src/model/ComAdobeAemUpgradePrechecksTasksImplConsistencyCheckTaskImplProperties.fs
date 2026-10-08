namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties =

  //#region ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties

  [<CLIMutable>]
  type ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties = {
    [<JsonProperty(PropertyName = "root.path")>]
    RootPath : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "fix.inconsistencies")>]
    FixInconsistencies : ConfigNodePropertyBoolean;
  }

  //#endregion
