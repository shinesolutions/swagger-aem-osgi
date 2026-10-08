namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties =

  //#region ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties

  [<CLIMutable>]
  type ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties = {
    [<JsonProperty(PropertyName = "hc.tags")>]
    HcTags : ConfigNodePropertyArray;
  }

  //#endregion
