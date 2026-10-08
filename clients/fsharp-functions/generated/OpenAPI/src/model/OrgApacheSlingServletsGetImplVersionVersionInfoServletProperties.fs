namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean

module OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties =

  //#region OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties

  [<CLIMutable>]
  type OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties = {
    [<JsonProperty(PropertyName = "sling.servlet.selectors")>]
    SlingServletSelectors : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "ecmaSuport")>]
    EcmaSuport : ConfigNodePropertyBoolean;
  }

  //#endregion
