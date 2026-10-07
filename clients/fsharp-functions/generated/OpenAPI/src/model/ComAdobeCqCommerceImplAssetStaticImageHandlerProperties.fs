namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqCommerceImplAssetStaticImageHandlerProperties =

  //#region ComAdobeCqCommerceImplAssetStaticImageHandlerProperties

  [<CLIMutable>]
  type ComAdobeCqCommerceImplAssetStaticImageHandlerProperties = {
    [<JsonProperty(PropertyName = "cq.commerce.asset.handler.active")>]
    CqCommerceAssetHandlerActive : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "cq.commerce.asset.handler.name")>]
    CqCommerceAssetHandlerName : ConfigNodePropertyString;
  }

  //#endregion
