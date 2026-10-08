namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties =

  //#region ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties

  [<CLIMutable>]
  type ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties = {
    [<JsonProperty(PropertyName = "hc.tags")>]
    HcTags : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "exclude.search.path")>]
    ExcludeSearchPath : ConfigNodePropertyArray;
  }

  //#endregion
