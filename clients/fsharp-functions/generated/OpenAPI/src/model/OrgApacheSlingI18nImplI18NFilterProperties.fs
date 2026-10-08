namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyInteger

module OrgApacheSlingI18nImplI18NFilterProperties =

  //#region OrgApacheSlingI18nImplI18NFilterProperties

  [<CLIMutable>]
  type OrgApacheSlingI18nImplI18NFilterProperties = {
    [<JsonProperty(PropertyName = "service.ranking")>]
    ServiceRanking : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "sling.filter.scope")>]
    SlingFilterScope : ConfigNodePropertyArray;
  }

  //#endregion
