namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties =

  //#region ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties

  [<CLIMutable>]
  type ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties = {
    [<JsonProperty(PropertyName = "mime.allowEmpty")>]
    MimeAllowEmpty : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "mime.allowed")>]
    MimeAllowed : ConfigNodePropertyArray;
  }

  //#endregion
