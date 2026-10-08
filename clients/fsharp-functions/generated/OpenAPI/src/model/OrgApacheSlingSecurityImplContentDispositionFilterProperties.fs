namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean

module OrgApacheSlingSecurityImplContentDispositionFilterProperties =

  //#region OrgApacheSlingSecurityImplContentDispositionFilterProperties

  [<CLIMutable>]
  type OrgApacheSlingSecurityImplContentDispositionFilterProperties = {
    [<JsonProperty(PropertyName = "sling.content.disposition.paths")>]
    SlingContentDispositionPaths : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "sling.content.disposition.excluded.paths")>]
    SlingContentDispositionExcludedPaths : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "sling.content.disposition.all.paths")>]
    SlingContentDispositionAllPaths : ConfigNodePropertyBoolean;
  }

  //#endregion
