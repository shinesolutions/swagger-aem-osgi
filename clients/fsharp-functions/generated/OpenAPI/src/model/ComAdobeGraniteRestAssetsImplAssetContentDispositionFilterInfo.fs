namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties

module ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo =

  //#region ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo

  [<CLIMutable>]
  type ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties;
  }

  //#endregion
