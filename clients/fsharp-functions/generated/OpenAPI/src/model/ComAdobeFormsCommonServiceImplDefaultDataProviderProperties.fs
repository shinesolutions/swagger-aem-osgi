namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeFormsCommonServiceImplDefaultDataProviderProperties =

  //#region ComAdobeFormsCommonServiceImplDefaultDataProviderProperties

  [<CLIMutable>]
  type ComAdobeFormsCommonServiceImplDefaultDataProviderProperties = {
    [<JsonProperty(PropertyName = "alloweddataFileLocations")>]
    AlloweddataFileLocations : ConfigNodePropertyArray;
  }

  //#endregion
